import java.util.ArrayList;
import java.util.List;

public class Apteka {
    private String name; // Название аптеки
    private List<Lekarstvo> medicines; // Лекарства

    // Конструктор для инициализации полей
    public Apteka(String name) {
        this.name = name;
        this.medicines = new ArrayList<>();
    }

    // Метод для добавления лекарства
    public void addMedicine(String name, double price) {
        medicines.add(new Lekarstvo(name, price));
    }

    // Метод для получения полной информации об аптеке
    public String getFullInfo() {
        StringBuilder info = new StringBuilder("Аптека: " + name + "\nЛекарства:\n");
        for (Lekarstvo lekarstvo : medicines) {
            info.append(lekarstvo.getName()).append(" - ").append(lekarstvo.getPrice()).append(" руб.\n");
        }
        return info.toString();
    }

    // Метод для выяснения стоимости самого дорогого лекарства
    public double getHighestPrice() {
        return medicines.stream().mapToDouble(Lekarstvo::getPrice).max().orElse(0);
    }

    // Метод для нахождения стоимости всех лекарств
    public double getTotalCost() {
        return medicines.stream().mapToDouble(Lekarstvo::getPrice).sum();
    }
}

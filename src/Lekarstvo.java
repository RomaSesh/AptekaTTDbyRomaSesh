import java.util.Objects;
public class Lekarstvo {
    private String name; // Название лекарства
    private double price; // Цена лекарства

    // Конструктор
    public Lekarstvo(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lekarstvo)) return false;
        Lekarstvo lekarstvo = (Lekarstvo) o;
        return Double.compare(lekarstvo.price, price) == 0 && Objects.equals(name, lekarstvo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}

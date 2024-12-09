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
}

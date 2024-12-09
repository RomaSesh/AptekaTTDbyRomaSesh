public class Main {
    public static void main(String[] args) {
        // Создаем несколько объектов класса «Аптека»
        Apteka apteka1 = new Apteka("Аптека №1");
        apteka1.addMedicine("Парацетамол", 60.0);
        apteka1.addMedicine("Ибупрофен", 80.0);
        apteka1.addMedicine("Аспирин", 35.0);

        Apteka apteka2 = new Apteka("Аптека №2");
        apteka2.addMedicine("Антигистамин", 135.0);
        apteka2.addMedicine("Витамин C", 99.0);
        apteka2.addMedicine("Корвалол" , 150.0);

        Apteka apteka3 = new Apteka("Аптека №3");
        apteka3.addMedicine("Активированный уголь", 50.0);
        apteka3.addMedicine("Витамин D", 70.0);
        apteka3.addMedicine("Витамин B", 100.0);

        Apteka apteka4 = new Apteka("Аптека №4");
        apteka4.addMedicine("Активированный уголь", 45.0);
        apteka4.addMedicine("Витамин B2", 75.0);
        apteka4.addMedicine("Анальгин", 100.0);
        apteka4.addMedicine("Гексорал", 335.0);

        // Проверяем работоспособность всех методов
        System.out.println(apteka1.getFullInfo());
        System.out.println("Самое дорогое лекарство: " + apteka1.getHighestPrice() + " руб.");
        System.out.println("Общая стоимость всех лекарств: " + apteka1.getTotalCost() + " руб.");

        System.out.println(apteka2.getFullInfo());
        System.out.println("Самое дорогое лекарство: " + apteka2.getHighestPrice() + " руб.");
        System.out.println("Общая стоимость всех лекарств: " + apteka2.getTotalCost() + " руб.");

        System.out.println(apteka3.getFullInfo());
        System.out.println("Самое дорогое лекарство: " + apteka3.getHighestPrice() + " руб.");
        System.out.println("Общая стоимость всех лекарств: " + apteka3.getTotalCost() + " руб.");

        System.out.println(apteka4.getFullInfo());
        System.out.println("Самое дорогое лекарство: " + apteka4.getHighestPrice() + " руб.");
        System.out.println("Общая стоимость всех лекарств: " + apteka4.getTotalCost() + " руб.");


    }
}

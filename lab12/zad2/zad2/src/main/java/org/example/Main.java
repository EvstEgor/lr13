package org.example;

public class Main {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Иван", "Петров");
        Tester tester2 = new Tester("Мария", "Иванова", 5, "Intermediate", 50000.0);

        tester1.printInfo();
        tester2.printInfo("Дополнительная информация");
        tester2.printInfo("Полная информация", true);

        int[] experiences = {2, 5, 3, 7};
        double averageExperience = Tester.calculateAverageExperience(experiences);
        System.out.println("Средний опыт: " + averageExperience + " лет");

        double averageEmpty = Tester.calculateAverageExperience(new int[]{});
        System.out.println("Средний опыт (пустой массив): " + averageEmpty);
    }
}
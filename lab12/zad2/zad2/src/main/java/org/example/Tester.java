package org.example;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Tester(String name, String surname, int expirienceInYears, String englishLevel) {
        this(name, surname, expirienceInYears, englishLevel, 0.0);
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "Beginner");
    }

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public int getExpirienceInYears() { return expirienceInYears; }
    public String getEnglishLevel() { return englishLevel; }
    public double getSalary() { return salary; }
    public void printInfo() {
        System.out.println("Name: " + name);
    }

    public void printInfo(String additionalMessage) {
        System.out.println("Name: " + name + ", Surname: " + surname + ", " + additionalMessage);
    }

    public void printInfo(String additionalMessage, boolean includeSalary) {
        String info = "Name: " + name + ", Surname: " + surname + ", Experience: " + expirienceInYears +
                " years, English: " + englishLevel;
        if (includeSalary) {
            info += ", Salary: " + salary;
        }
        System.out.println(info + ", " + additionalMessage);
    }
    public static double calculateAverageExperience(int[] experiences) {
        if (experiences == null || experiences.length == 0) return 0.0;
        double sum = 0;
        for (int exp : experiences) {
            sum += exp;
        }
        return sum / experiences.length;
    }
}
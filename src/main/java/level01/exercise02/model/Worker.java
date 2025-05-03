package level01.exercise02.model;

/**
 * PROGRAM: Worker
 * AUTHOR: Diego Balaguer
 * DATE: 30/04/2025
 */

public class Worker {
    private String name;
    private String surname;
    private double priceHour;

public Worker(String name, String surname, double priceHour) {
    this.name = name;
    this.surname = surname;
    this.priceHour = priceHour;
}

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getPriceHour() {
        return priceHour;
    }

    public double calculateSalary(double hoursWorked) {
        return hoursWorked * priceHour;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", priceHour=" + priceHour +
                '}';
    }
}

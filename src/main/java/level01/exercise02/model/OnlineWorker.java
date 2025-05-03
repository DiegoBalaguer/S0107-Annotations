package level01.exercise02.model;

/**
 * PROGRAM: OnlineWorker
 * AUTHOR: Diego Balaguer
 * DATE: 30/04/2025
 */

public class OnlineWorker extends Worker {
    private final double INTERNET_FLAT_RATE = 200;

    public OnlineWorker(String name, String surname, double priceHour) {
        super(name, surname, priceHour);
    }

    @Override
    public double calculateSalary(double hoursWorkedMonth) {
        return (hoursWorkedMonth * getPriceHour()) + INTERNET_FLAT_RATE;
    }

    @Deprecated
    public void printInternetRate() {
        System.out.println("Internet flat rate: " + INTERNET_FLAT_RATE);
    }
}

package level01.exercise01.model;

/**
 * PROGRAM: FaceToFaceWorker
 * AUTHOR: Diego Balaguer
 * DATE: 30/04/2025
 */

public class FaceToFaceWorker extends Worker {
    private final double GASOLINE = 100;

    public FaceToFaceWorker(String name, String surname, double priceHour) {
        super(name, surname, priceHour);
    }

    @Override
    public double calculateSalary(double hoursWorkedMonth) {
        return (hoursWorkedMonth * getPriceHour()) + GASOLINE;
    }
}
package level01.exercise02.application;

import level01.exercise02.model.FaceToFaceWorker;
import level01.exercise02.model.OnlineWorker;
import level01.exercise02.model.Worker;

import java.util.ArrayList;

/**
 * PROGRAM: AplicationWorkers
 * AUTHOR: Diego Balaguer
 * DATE: 30/04/2025
 */

public class ApplicationWorkers {

    private ArrayList<Worker> workers;

    public ApplicationWorkers() {
        workers = new ArrayList<>();
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public Worker getWorker(int indexArray) {
        return workers.get(indexArray);
    }

    @SuppressWarnings("deprecation")
    public void printGasolineCost(FaceToFaceWorker faceWorker) {
        faceWorker.printGasolineCost();
    }

    @SuppressWarnings("deprecation")
    public void printInternetRate(OnlineWorker onlineWorker) {
        onlineWorker.printInternetRate();
    }
}

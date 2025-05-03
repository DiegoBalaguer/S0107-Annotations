package level01.exercise01.data;

import level01.exercise01.application.ApplicationWorkers;
import level01.exercise01.model.FaceToFaceWorker;
import level01.exercise01.model.OnlineWorker;

public class ListWorkers {

    public static void addWorkers(ApplicationWorkers applicationWorkers) {
        applicationWorkers.addWorker(new FaceToFaceWorker("Marie", "Curie", 100.00));
        applicationWorkers.addWorker(new FaceToFaceWorker("Albert", "Einstein", 100.00));
        applicationWorkers.addWorker(new FaceToFaceWorker("Isaac", "Newton", 100.00));
        applicationWorkers.addWorker(new FaceToFaceWorker("Rosalind", "Franklin", 100.00));
        applicationWorkers.addWorker(new OnlineWorker("Nikola", "Tesla", 100.00));
        applicationWorkers.addWorker(new OnlineWorker("Katherine", "Johnson", 100.00));
        applicationWorkers.addWorker(new OnlineWorker("Stephen", "Hawking", 100.00));
        applicationWorkers.addWorker(new OnlineWorker("Ada", "Lovelace", 100.00));
    }
}

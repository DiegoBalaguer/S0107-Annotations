package level01.exercise02.application;

import level01.exercise02.data.ListWorkers;
import level01.exercise02.model.FaceToFaceWorker;
import level01.exercise02.model.OnlineWorker;

/**
 * PROGRAM: AplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 30/04/2025
 */

public class ApplicationController {
    ApplicationWorkers applicationWorkers = new ApplicationWorkers();


    public void run() {
        System.out.println("* ADD WORKERS TO ARRAY..........." + System.lineSeparator());
        ListWorkers.addWorkers(applicationWorkers);

        System.out.println("* USE DEPRECATED METHODS..........." + System.lineSeparator());
        applicationWorkers.printGasolineCost((FaceToFaceWorker) applicationWorkers.getWorker(1));
        applicationWorkers.printInternetRate((OnlineWorker) applicationWorkers.getWorker(6));

        System.out.println("✅ process completed correctly");

    }
}

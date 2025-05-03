package level01.exercise01.application;

import level01.exercise01.data.ListWorkers;

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
        System.out.println("* SHOW LIST WORKERS TO ARRAY..........." + System.lineSeparator());
        System.out.println(applicationWorkers.listWorkers() + System.lineSeparator());

        System.out.println("✅ process completed correctly");

    }
}

package level01.exercise01.application;

import level01.exercise01.Utils.StringUtils;
import level01.exercise01.model.Worker;

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

    public String listWorkers() {
        StringBuilder message = new StringBuilder();
        message.append(StringUtils.formatToChars("Name: ", 15))
                .append("\t").append(StringUtils.formatToChars("Surname:", 15))
                .append("\t").append(StringUtils.formatToChars("PriceHour: ", 9))
                .append("\t").append(StringUtils.formatToChars("Salary: ", 8))
                .append(System.lineSeparator());
        for (Worker worker : workers) {
            message.append(StringUtils.formatToChars(worker.getName(), 15))
                    .append("\t").append(StringUtils.formatToChars(worker.getSurname(), 15))
                    .append("\t").append(StringUtils.formatToChars(String.valueOf(worker.getPriceHour()), 9))
                    .append("\t").append(StringUtils.formatToChars(String.valueOf(worker.calculateSalary(10.00)), 8))
                    .append(System.lineSeparator());
        }
        return message.toString();
    }


}

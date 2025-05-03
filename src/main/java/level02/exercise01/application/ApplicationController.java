package level02.exercise01.application;

import level02.exercise01.model.User;

/**
 * PROGRAM: AplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 30/04/2025
 */

public class ApplicationController {

    public void run() {
        System.out.println("* SAVE AND LOAD SERIALIZED OBJECT..........." + System.lineSeparator());

        System.out.println("** Create object User .............");
        User user = new User("Alan Turing", 41);

        try {
            ApplicationWorkers.serializeToJson(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("** User: " + System.lineSeparator() + user);
        System.out.println("** Load json User .............");

        User loadedUser = ApplicationWorkers.deserializeFromJson(User.class);
        System.out.println("👤 Loaded user: " + loadedUser);

        System.out.println("✅ process completed correctly");
    }
}

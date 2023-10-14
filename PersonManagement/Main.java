package PersonManagement;

import PersonManagement.controller.PersonController;

public class Main {
    public static void main(String[] args) {
        PersonController personController = new PersonController();
        personController.run();
    }
}

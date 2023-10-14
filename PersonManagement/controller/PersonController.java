package PersonManagement.controller;

import PersonManagement.Repository.Repository;
import PersonManagement.view.Menu;

public class PersonController extends Menu {
    Repository repository = new Repository();
    static String[] option = { " Find person info.",
            "Copy Text to new file.",
            "Exit" };

    public PersonController() {
        super("Person Programming", option);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                repository.findPersonInfo();
                break;
            case 2:
                repository.coppyNewFile();
                break;
            default:
                break;
        }
    }

}

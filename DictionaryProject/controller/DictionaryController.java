package DictionaryProject.controller;

import java.util.HashMap;

import DictionaryProject.Repository.DictionaryRepository;
import DictionaryProject.view.Menu;

public class DictionaryController extends Menu {
    DictionaryRepository dictionaryRepository = new DictionaryRepository();
    HashMap<String, String> hm = new HashMap<>();
    static String[] option = { " Add new word.",
            "Delete word.",
            "Translate word.",
            "Exit" };

    public DictionaryController() {
        super("Dictionary programming", option);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                dictionaryRepository.addNewWord(hm);
                break;
            case 2:
                dictionaryRepository.deleteWord(hm);
                break;

            case 3:
                dictionaryRepository.translate(hm);
                break;
            default:
                break;
        }
    }

}

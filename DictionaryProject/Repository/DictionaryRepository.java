package DictionaryProject.Repository;

import java.util.HashMap;

import DictionaryProject.DataAccess.Function;

public class DictionaryRepository implements IDictionaryRepository {

    Function function = new Function();

    @Override
    public void addNewWord(HashMap<String, String> hm) {
        function.addNewWord(hm);
    }

    @Override
    public void deleteWord(HashMap<String, String> hm) {
        function.deleteWord(hm);
    }

    @Override
    public void translate(HashMap<String, String> hm) {
        function.translate(hm);
    }

}

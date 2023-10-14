package DictionaryProject.Repository;

import java.util.HashMap;

public interface IDictionaryRepository {
    public void addNewWord(HashMap<String, String> hm);

    public void deleteWord(HashMap<String, String> hm);

    public void translate(HashMap<String, String> hm);
}

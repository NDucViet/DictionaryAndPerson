package PersonManagement.Repository;

import PersonManagement.DataAccess.Function;

public class Repository implements IPersonRepository {

    Function function = new Function();

    @Override
    public void findPersonInfo() {
        function.findPersonInfo();
    }

    @Override
    public void coppyNewFile() {
        function.coppyNewFile();
    }

}

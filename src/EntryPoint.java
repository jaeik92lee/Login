import db.LocalDB;
import model.UserModel;
import view.FrontView;

public class EntryPoint {

    public static void main(String[] args) {

        UserModel userModel = new UserModel();
        userModel.setId("jaeik");
        userModel.setPassword("pwd");

        LocalDB.userList.add(userModel);

        FrontView frontView = new FrontView();
        frontView.registerView();
    }
}

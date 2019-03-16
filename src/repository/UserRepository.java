package repository;

import db.LocalDB;
import model.UserModel;

import java.util.List;

public class UserRepository {

    public int saveUser(UserModel userModel) {
        LocalDB.userList.add(userModel);
        return 0;
    }

    public UserModel findUserById(String id) {
        for (UserModel userModel : LocalDB.userList) {
            if(id.equalsIgnoreCase(userModel.getId())) {
                return userModel;
            }
        }
        return null;
    }

    public List<UserModel> findAll() {
        return LocalDB.userList;
    }
}

package service;

import model.UserModel;
import repository.UserRepository;

import java.util.List;

public class UserService {

    UserRepository userRepository = new UserRepository();

    public int saveUser(String id, String password) {
        UserModel user = new UserModel(id, password);
        return 0;
    }

    public UserModel findUserById(String id) {
        return userRepository.findUserById(id);
    }

    public List<UserModel> findAll() {
        return userRepository.findAll();
    }
}

import view.LoginView;

public class EntryPoint {

    public static void main(String[] args) {
        LoginView loginView = new LoginView();
        loginView.registerView();
        loginView.registerView();
        loginView.registerView();

        loginView.findAllUsers();
    }
}

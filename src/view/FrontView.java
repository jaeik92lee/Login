package view;

import service.UserService;

import java.util.Scanner;

public class FrontView {

    UserService userService = new UserService();

    public void registerView() {
        System.out.println("Register View");

        Scanner scanner = new Scanner(System.in);

        String id = null;
        String password = null;

        System.out.print("ID : ");
        id = scanner.nextLine();

        System.out.print("PWD : ");
        password = scanner.nextLine();

        //  1. 결과값 가져옴
        //  response = 1    중복된 id X
        //  response = -1   중복된 id O
        int response = userService.saveUser(id, password);

        //  2. 중복된 id가 있으면, 중복된 id가 있다고 출력
        if (response == -1) {
            duplicatedId();
        }

        //  3. 중복된 id가 없으면, 로그인 화면으로 이동
        if (response == 1) {
            loginView();
        }
    }

    public void duplicatedId() {
        System.out.println("중복된 ID 있어요 !!!");
    }

    public void loginView() {
        System.out.println("여기는 로그인 화면 !!!");

        Scanner scanner = new Scanner(System.in);

        String id = null;
        String password = null;

        System.out.print("ID : ");
        id = scanner.nextLine();

        System.out.print("PWD : ");
        password = scanner.nextLine();

        //  1. 결과값을 받는다.
        int response = userService.login(id, password);

        //  2. 결과값이 0이면, id 없음
        //  3. 결과값이 1이면, 비밀번호 틀림
        //  4. 결과값이 2이면, 로그인 성공
        switch (response) {
            case 0:
                System.out.println("ID 없음");
                break;
            case 1:
                System.out.println("비밀번호 틀림");
                break;
            case 2:
                System.out.println("로그인 성공");
                break;
        }
    }
}

package com.livfame;

import com.livfame.controller.UserController;
import com.livfame.service.UserService;

public class Application {

    public static void main(String[] args) throws InterruptedException {
//        DemoController demoController = new DemoController();
//        demoController.show();
        UserController userController = new UserController(new UserService());
        userController.show();
        userController.save();
        userController.saveWithOutJava8Lamda();
    }
}

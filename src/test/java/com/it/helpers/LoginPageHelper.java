package com.it.helpers;

import com.it.Entity.User;
import com.it.Entity.UserFactory;
import com.it.pages.LoginPage;

public class LoginPageHelper extends LoginPage {

    public void loginValidUser () {

        User user = UserFactory.getValidUser();
        log.info(String.format("Login user name - %s, password -%s.", user.getLogin(), user.getPass()));
        login(user.getLogin(),user.getPass());

    }

    public void loginValidUser (User user) {

        log.info(String.format("Login user name - %s, password -%s.", user.getLogin(), user.getPass()));
        login(user.getLogin(),user.getPass());

    }

}

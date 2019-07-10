package com.it.Entity;

import java.util.Objects;

public class User {
    private String Login;
    private String pass;
    private String email;

    public User(String login, String pass, String email) {
        Login = login;
        this.pass = pass;
        this.email = email;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Login.equals(user.Login) &&
                pass.equals(user.pass) &&
                email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Login, pass, email);
    }

    @Override
    public String toString() {
        return "User{" +
                "Login='" + Login + '\'' +
                ", pass='" + pass + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

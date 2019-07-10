package com.it;

import com.it.helpers.CommonHelper;
import com.it.helpers.DashBoardHelper;
import com.it.helpers.LoginPageHelper;

public class App {
    public LoginPageHelper login;
    public DashBoardHelper dashdoard;
    public CommonHelper common;

    public App() {
        login = new LoginPageHelper();
        dashdoard = new DashBoardHelper();
        common = new CommonHelper();
    }
}

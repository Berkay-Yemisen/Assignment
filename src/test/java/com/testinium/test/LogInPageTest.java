package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.LoginPage;
import org.junit.Test;

public class LogInPageTest extends BaseTest {
    @Test
    public void logIn(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }
}

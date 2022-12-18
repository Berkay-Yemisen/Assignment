package com.testinium.page;

import com.testinium.method.Method;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {
    Method method;

    Logger logger = LogManager.getLogger(LoginPage.class);
    public LoginPage(){
        method  = new Method();
    }

    public void login(){
        method.click(By.cssSelector("#js-popup-accept-button"));
        method.waitBySeconds(1);
        method.click(By.cssSelector(".menu-top-button.login>a"));
        method.waitBySeconds(1);
        method.sendKeys(By.id("login-email"),"mamay86898@lubde.com");
        method.waitBySeconds(1);
        method.sendKeys(By.xpath("//input[@id='login-password']"),"1Q2w3e4r5t"); //xpath ile
        method.waitBySeconds(1);
        method.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        method.waitBySeconds(1);
        Assert.assertTrue(method.isElementVisible(By.cssSelector(".section")));
        method.waitBySeconds(1);
        logger.info("Login olundu");
    }

}

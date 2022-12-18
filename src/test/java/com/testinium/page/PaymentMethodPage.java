package com.testinium.page;

import com.testinium.method.Method;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class PaymentMethodPage {

    Method method;

    Logger logger = LogManager.getLogger(ProductPage.class);

    public PaymentMethodPage(){
        method= new Method();
    }

    public void paymentMethod(){
        method.waitBySeconds(2);
        method.scrollWithAction(By.xpath("//input[@id='credit-card-owner']"));
        method.waitBySeconds(1);
        method.sendKeys(By.xpath("//input[@id='credit-card-owner']"),"fgdfgdfg");
        method.waitBySeconds(1);
        method.sendKeys(By.xpath("//input[@id='credit_card_number_1']"),"2423");
        method.sendKeys(By.xpath("//input[@id='credit_card_number_2']"),"1111");
        method.sendKeys(By.xpath("//input[@id='credit_card_number_3']"),"1111");
        method.sendKeys(By.xpath("//input[@id='credit_card_number_4']"),"1111");
        method.waitBySeconds(1);
        method.selectByText(By.id("credit-card-expire-date-month"),"02");
        method.selectByText(By.id("credit-card-expire-date-year"),"2032");
        method.sendKeys(By.id("credit-card-security-code"),"4353");
        method.click(By.xpath("//button[@id='button-checkout-continue']"));
        method.isElementVisible(By.cssSelector(".grand-total"));
        logger.info("Ödeme işlemi yapıldı");

    }

    public void returnHomePage(){
        method.click(By.cssSelector(".checkout-logo>img"));
    }
}

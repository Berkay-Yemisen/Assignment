package com.testinium.page;

import com.testinium.method.Method;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class AddressPage {

    Method method;

    Logger logger = LogManager.getLogger(ProductPage.class);

    public AddressPage(){
        method = new Method();
    }

    public void addressInfo(){
        method.click(By.xpath("//div[@id='shipping-tabs']/a[2]"));
        method.sendKeys(By.xpath("//input[@id='address-firstname-companyname']"),"Berkay");
        method.waitBySeconds(1);
        method.sendKeys(By.xpath("//input[@id='address-lastname-title']"),"Yemişen");
        method.waitBySeconds(1);
        method.selectByText(By.xpath("//select[@id='address-zone-id']"),"İstanbul");
        method.waitBySeconds(3);
        method.selectByText(By.xpath("//select[@id='address-county-id']"),"KADIKÖY");
        method.waitBySeconds(1);
        method.sendKeys(By.xpath("//input[@id='district']"),"ddfgdfgdfg");
        method.sendKeys(By.xpath("//textarea[@id='address-address-text']"),"fjdfghdgjfg");
        method.sendKeys(By.xpath("//input[@id='address-postcode']"),"1234");
        method.sendKeys(By.xpath("//input[@id='address-mobile-telephone']"),"5111111111");
        method.sendKeys(By.xpath("//textarea[@id='address-address-text']"),"2222222222");
        method.sendKeys(By.xpath("//input[@id='address-tax-id']"),"22268304232");
        method.click(By.xpath("//button[@id='button-checkout-continue']"));
        method.waitBySeconds(2);
        method.click(By.xpath("//button[@id='button-checkout-continue']"));
        logger.info("Adres bilgileri girildi");
        method.waitBySeconds(2);
    }
}

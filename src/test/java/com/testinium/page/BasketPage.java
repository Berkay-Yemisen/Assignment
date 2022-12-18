package com.testinium.page;

import com.testinium.method.Method;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class BasketPage {
    Method method;

    Logger logger = LogManager.getLogger(ProductPage.class);

    public BasketPage(){
        method = new Method();
    }

    public void goBasket(){
        method.waitBySeconds(1);
        method.click(By.xpath("//span[@id='cart-items']"));
        method.click(By.id("js-cart"));
        method.waitBySeconds(1);
        logger.info("Sepete gidildi");

    }

    public void productEnhancement(){
        method.doubleClick(By.xpath("//input[@name='quantity']"));
        method.sendKeys(By.xpath("//input[@name='quantity']"),"2");
        method.waitBySeconds(1);
        method.click(By.xpath("//i[@title='Güncelle']"));
        logger.info("Ürün arttırımı yapıldı");
    }

    public void buyProduct(){
        method.waitBySeconds(1);
        method.click(By.cssSelector(".right>.button.red"));
        logger.info("Satın al butununa tıklandı");
    }
}

package com.testinium.page;

import com.testinium.method.Method;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class HobbyPage {

    Method method;

    Logger logger = LogManager.getLogger(ProductPage.class);
    public HobbyPage(){
        method = new Method();
    }

    public void selectRandom(){
        method.waitBySeconds(1);

        method.random(By.cssSelector(".cover"));
        logger.info("Rastgele ürün aratıldı");
    }

}

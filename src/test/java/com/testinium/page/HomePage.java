package com.testinium.page;
import com.testinium.method.Method;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

    Method method;

    Logger logger = LogManager.getLogger(HomePage.class);

    public HomePage(){
        method = new Method();
    }


    public void backHomePage(){
        method.click(By.cssSelector(".logo-text>a>img"));
        logger.info("Anasayfa ya dönüldü");
    }
    public void scoreCatalogue(){
        method.click(By.cssSelector(".lvl1catalog>a"));
        method.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        method.selectByText(By.xpath("//select[@onchange='location = this.value;']"),"Yüksek Oylama");
        logger.info("Puan kataloğuna gidilip,yüksek oylama seçildi");
    }

    public void allBooks(){
        method.hover(By.xpath("//*[@id='mainNav']/div[1]/ul/li[1]/div[2]/ul/li[3]/span"));
        method.waitBySeconds(2);
        method.click(By.xpath("//*[@id='mainNav']/div[1]/ul/li[1]/div[2]/ul/li[3]/div/div[1]/div/ul[2]/li[14]/a"));
        logger.info("Tüm kitaplara gidilip, hobi seçildi");
    }





    public void logOut(){
        method.hover(By.cssSelector(".welcome.fl>.menu.top.login"));
        method.waitBySeconds(1);
        method.click(By.xpath("//*[@id='header-top']/div/div[1]/div[1]/ul/li/div/ul/li[4]/a"));
         logger.info("LogOut olundu");

    }
}

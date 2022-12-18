package com.testinium.method;

import com.testinium.driver.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Method {

    WebDriver driver;
    FluentWait<WebDriver> wait;
    JavascriptExecutor jsdriver;

    Actions act;

    Logger logger = LogManager.getLogger(Method.class);
    public Method(){
        driver = BaseTest.driver;
        wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofMillis(300)).ignoring(NoSuchElementException.class);
        jsdriver = (JavascriptExecutor) driver;
        act  = new Actions(driver);
    }

    public WebElement findElement(By by){
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void click(By by){

        findElement(by).click();
    }

    public void doubleClick(By by){

        act.doubleClick( findElement(by)).perform();
    }

    //Normalde  kullanmıyoruz
    public void waitBySeconds(long seconds){
        try{
            Thread.sleep(seconds*1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void sendKeys(By by, String text){
        findElement(by).sendKeys(text);
    }

    public boolean isElementVisible(By by){
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
            logger.info("true");
            return true;
        }catch (Exception e){
            logger.info("false"+ e.getMessage());
            return false;
        }
    }

    public void scrollWithAction(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }

    public void hover(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).perform();
    }

    public void random(By by){
        List<WebElement> randomProduct = driver.findElements(by);
        randomProduct.get(new Random().nextInt(randomProduct.size())).click();
    }


    public Select getSelecet(By by){

        return new Select(findElement(by));
    }

    public void selectByText(By by,String text){
        getSelecet(by).selectByVisibleText(text);
    }


}

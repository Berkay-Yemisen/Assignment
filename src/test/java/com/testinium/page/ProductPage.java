package com.testinium.page;

import com.testinium.method.Method;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {
    Method method;

    Logger logger = LogManager.getLogger(ProductPage.class);
    public ProductPage(){
        method = new Method();
    }

    public void searchProduct(){
        method.sendKeys(By.xpath("//input[@id='search-input']"),"oyuncak");
        method.click(By.cssSelector(".common-sprite.button-search"));
        //method.waitBySeconds(3);
        method.scrollWithAction(By.xpath("(//div[@class='product-list']/div[@class='product-cr'])[7]"));
        method.waitBySeconds(1);
        logger.info("Ürün aratıldı");

    }

    public void addFavorite(){
        method.waitBySeconds(1);
        method.findElement(By.cssSelector(".product-list>.product-cr:nth-child(7)>.grid_2.alpha.omega.relative>.hover-menu>.add-to-favorites")).click();
        method.waitBySeconds(1);
        method.findElement(By.cssSelector(".product-list>.product-cr:nth-child(8)>.grid_2.alpha.omega.relative>.hover-menu>.add-to-favorites")).click();
        method.waitBySeconds(1);
        method.findElement(By.cssSelector(".product-list>.product-cr:nth-child(9)>.grid_2.alpha.omega.relative>.hover-menu>.add-to-favorites")).click();
        method.waitBySeconds(1);
        method.findElement(By.cssSelector(".product-list>.product-cr:nth-child(10)>.grid_2.alpha.omega.relative>.hover-menu>.add-to-favorites")).click();
        method.waitBySeconds(1);
        method.scrollWithAction(By.cssSelector(".breadcrumb"));
        Assert.assertTrue(method.isElementVisible(By.cssSelector(".search-heading-title")));
        logger.info("Ürün favorilere eklendi");
    }

    public void addBasket(){
        method.waitBySeconds(1);
        method.click(By.xpath("//a[@id='button-cart']"));
        logger.info("Ürün sepete eklendi");
    }

    public void deleteFavorite(){
        method.hover(By.xpath("//*[@id='header-top']/div/div[2]/ul/li[1]/div/ul/li/a"));
        method.click(By.xpath("//*[@id='header-top']/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));
        method.click(By.xpath("//*[@id='product-586888']/div[2]/div[3]/a[4]"));
        logger.info("Ürün silindi");
    }

}

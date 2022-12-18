package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.BasketPage;
import org.junit.Test;

public class BasketPageTest extends BaseTest {

    @Test
    public void basketPageTest(){
        BasketPage basketPage = new BasketPage();
        basketPage.goBasket();
        basketPage.productEnhancement();
        basketPage.buyProduct();
    }
}

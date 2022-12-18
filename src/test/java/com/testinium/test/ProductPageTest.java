package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.ProductPage;
import org.junit.Test;

public class ProductPageTest extends BaseTest {
    @Test
    public void productPageTest(){
        ProductPage productPage = new ProductPage();
        productPage.searchProduct();
        productPage.addFavorite();
        productPage.addBasket();
        productPage.deleteFavorite();
    }


}

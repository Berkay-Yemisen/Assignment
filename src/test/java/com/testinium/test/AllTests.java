package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.*;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AllTests extends BaseTest {

    @Test
    public void allTest(){
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        HomePage homePage = new HomePage();
        HobbyPage hobbyPage = new HobbyPage();
        BasketPage basketPage = new BasketPage();
        AddressPage addressPage = new AddressPage();
        PaymentMethodPage paymentMethodPage = new PaymentMethodPage();
        loginPage.login();
        productPage.searchProduct();
        productPage.addFavorite();
        homePage.backHomePage();
        homePage.scoreCatalogue();
        homePage.allBooks();
        hobbyPage.selectRandom();
        productPage.addBasket();
        productPage.deleteFavorite();
        basketPage.goBasket();
        basketPage.productEnhancement();
        basketPage.buyProduct();
        addressPage.addressInfo();
        paymentMethodPage.paymentMethod();
        paymentMethodPage.returnHomePage();
        homePage.logOut();



    }

}

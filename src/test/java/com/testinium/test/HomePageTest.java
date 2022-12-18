package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.HomePage;
import org.junit.Test;

public class HomePageTest extends BaseTest {
    @Test
    public void homePageTest(){
        HomePage homePage = new HomePage();
        homePage.backHomePage();
        homePage.scoreCatalogue();
        homePage.allBooks();
        homePage.logOut();
    }
}

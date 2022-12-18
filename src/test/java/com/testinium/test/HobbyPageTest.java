package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.HobbyPage;

public class HobbyPageTest extends BaseTest {

    public void hobbyPageTest(){
        HobbyPage hobbyPage = new HobbyPage();
        hobbyPage.selectRandom();
    }
}

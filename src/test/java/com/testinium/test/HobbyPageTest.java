package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.HobbyPage;
import org.junit.Test;

public class HobbyPageTest extends BaseTest {
    @Test
    public void hobbyPageTest(){
        HobbyPage hobbyPage = new HobbyPage();
        hobbyPage.selectRandom();
    }
}

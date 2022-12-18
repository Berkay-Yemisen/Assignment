package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.AddressPage;
import org.junit.Test;

public class AddressPageTest extends BaseTest {

    @Test
    public void addressPageTest(){
        AddressPage addressPage = new AddressPage();
        addressPage.addressInfo();
    }
}

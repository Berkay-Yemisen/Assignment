package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.PaymentMethodPage;
import org.junit.Test;

public class PaymentMethodPageTest extends BaseTest {
    @Test
    public void paymentMethodPageTest(){
        PaymentMethodPage paymentMethodPage = new PaymentMethodPage();
        paymentMethodPage.paymentMethod();
        paymentMethodPage.returnHomePage();
    }
}

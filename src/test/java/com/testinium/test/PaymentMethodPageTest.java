package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.PaymentMethodPage;

public class PaymentMethodPageTest extends BaseTest {

    public void paymentMethodPageTest(){
        PaymentMethodPage paymentMethodPage = new PaymentMethodPage();
        paymentMethodPage.paymentMethod();
        paymentMethodPage.returnHomePage();
    }
}

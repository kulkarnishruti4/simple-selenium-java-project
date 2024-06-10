package com.simple.ticket.booking;


import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        HomePage homePage = new HomePage(driver);
        homePage.clickLogin();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("testuser", "password123");
    }
}

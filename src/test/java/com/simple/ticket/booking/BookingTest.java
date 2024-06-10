package com.simple.ticket.booking;

import org.junit.jupiter.api.Test;

public class BookingTest extends BaseTest {

    @Test
    public void testBooking() {
        HomePage homePage = new HomePage(driver);
        homePage.enterSearch("concert tickets");
        homePage.submitSearch();

        SearchPage searchPage = new SearchPage(driver);
        searchPage.selectFirstResult();

        BookingPage bookingPage = new BookingPage(driver);
        bookingPage.clickBookNow();
    }
}


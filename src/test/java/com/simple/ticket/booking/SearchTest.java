package com.simple.ticket.booking;

import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest {

    @Test
    public void testSearch() {
        HomePage homePage = new HomePage(driver);
        homePage.enterSearch("concert tickets");
        homePage.submitSearch();

        SearchPage searchPage = new SearchPage(driver);
        searchPage.selectFirstResult();
    }
}

package com.simple.ticket.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingPage {
    private WebDriver driver;

    private By bookNowButton = By.id("bookNowButton");

    public BookingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBookNow() {
        driver.findElement(bookNowButton).click();
    }
}

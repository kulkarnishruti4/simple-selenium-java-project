package com.simple.ticket.booking;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;

    private By firstResult = By.cssSelector(".result-item");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFirstResult() {
        driver.findElement(firstResult).click();
    }
}


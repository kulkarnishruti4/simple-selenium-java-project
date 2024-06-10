package com.simple.ticket.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private By loginButton = By.id("loginButton");
    private By searchBox = By.id("searchBox");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void enterSearch(String query) {
        driver.findElement(searchBox).sendKeys(query);
    }

    public void submitSearch() {
        driver.findElement(searchBox).submit();
    }
}

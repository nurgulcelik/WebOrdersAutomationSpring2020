package com.weborders.pages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage{

    protected WebDriverWait wait= new WebDriverWait(Driver.getDriver(),20);

    @FindBy(linkText="View all orders")
    private  WebElement viewAllOrders;
    @FindBy(linkText="View all products")
    private  WebElement viewAllProducts;
    @FindBy(linkText="Order")
    private  WebElement order;

    public BasePage(){
        //we put this line to be able to use @FindBy annotations
        PageFactory.initElements(Driver.getDriver(),this);
    }
    public void clickOnViewAllOrders(){
        System.out.println("Clicking on 'View all orders' page");
        wait.until(ExpectedConditions.elementToBeClickable(viewAllOrders));
        viewAllOrders.click();
    }
    public void clickOnViewAllProducts(){
        System.out.println("Clicking on 'View all products' page");
        wait.until(ExpectedConditions.elementToBeClickable(viewAllProducts));
        viewAllProducts.click();
    }
    public void clickOnOrder(){
        System.out.println("Clicking on 'Order' page");
        wait.until(ExpectedConditions.elementToBeClickable(order)).click();
    }
}

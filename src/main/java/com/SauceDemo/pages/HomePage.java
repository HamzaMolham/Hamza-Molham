package com.SauceDemo.pages;

import com.SauceDemo.base.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HomePage extends Base {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "[class=\"title\"]")
    WebElement Product;

    @FindBy(css = "[class=\"inventory_item_img\"]")
    WebElement DogImage;

    @FindBy (css = "[class=\"product_sort_container\"]")
    WebElement Select;

    @FindBy (css = "[class=\"shopping_cart_container visual_failure\"]")
    WebElement BasketButton;


    public void IsProductTestDisplayed () {
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        Assert.assertTrue(Product.isDisplayed());
    }

    public void IsWrongImageDisplayed(){
        Assert.assertTrue(DogImage.isDisplayed());
    }
    public void SelectSorting(){
        Select sort = new Select(Select);
         sort.selectByValue("lohi");
}
      public void AlertScreen(){
        driver.switchTo().alert().accept();
}
     public void BasketButtonWrongPlace(){
        Assert.assertTrue(BasketButton.isDisplayed());
     }
}

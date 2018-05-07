package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AbstractPage {
    protected WebDriver driver;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openURL(String url){
        this.driver.get(url);
    }

    void inputValueInFieldByID(String fieldID, String value){
        driver.findElement(By.id(fieldID)).click();
        driver.findElement(By.id(fieldID)).clear();
        driver.findElement(By.id(fieldID)).sendKeys(value);
    }

    void clickElementByID(String ID){
        driver.findElement(By.id(ID)).click();
    }

    void inputValueInFieldByName(String fieldName, String value){
        driver.findElement(By.name(fieldName)).click();
        driver.findElement(By.name(fieldName)).clear();
        driver.findElement(By.name(fieldName)).sendKeys(value);
    }

    void clickElementByName(String name){
        driver.findElement(By.name(name)).click();
    }

    public void inputValueInFieldByXPath(String XPath, String value){
        driver.findElement(By.id(XPath)).click();
        driver.findElement(By.id(XPath)).clear();
        driver.findElement(By.id(XPath)).sendKeys(value);
    }

    void clickElementByXPath(String XPath){
        driver.findElement(By.id(XPath)).click();
    }

    public String getTextOfElementByID(String ID){
        return driver.findElement(By.id(ID)).getText();
    }

    public String getTextOfElementByXpath(String xpath){
        return driver.findElement(By.id(xpath)).getText();
    }

    void selectInDropDownMenuByName(String nameOfDropDownMenu, String textOfElement){
        new Select(driver.findElement(By.name(nameOfDropDownMenu)))
                .selectByVisibleText(textOfElement);
    }

    public static void inputValueInField(WebElement field, String value){
        field.click();
        field.clear();
        field.sendKeys(value);
    }
}

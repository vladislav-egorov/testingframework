package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {

    String contrMenuID = "contr_menu",
            docMenuID = "doc_menu",
            docTypeName = "doc_type";

    String createContrFieldXpath = "//input[@value='Ð¡Ð¾Ð·Ð´Ð°ÑÑ']",
            createDocumentFieldXpath = "//input[@value='Ð¡Ð¾Ð·Ð´Ð°ÑÑ']";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickContrMenu(){
        clickElementByID(contrMenuID);
    }

    public void clickCreateContrField(){
        clickElementByXPath(createContrFieldXpath);
    }

    public void clickDocMenu(){
        clickElementByID(docMenuID);
    }

    public void selectDocumentType(String documentType){
        selectInDropDownMenuByName(docTypeName,  documentType);
    }

    public void clickCreateDocumentField(){
        clickElementByXPath(createDocumentFieldXpath);
    }
}

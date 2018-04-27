package pages;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class CreateContrPage extends AbstractPage {

    private String descriptionFieldName = "description",
        nameFieldName = "name",
        accountFieldName = "account",
        bankNameFieldName = "bank_name",
        bankAccountFieldName = "bank_account",
        bankBicFieldName = "bank_bic",
        element1ButtonXpath = "//input[@value='Ð¡Ð¾Ð·Ð´Ð°ÑÑ']",
        element2ButtonXpath = "//div[@id='conterparty_list']/table/tbody/tr[23]/td/div/a/h3";

    public CreateContrPage(WebDriver driver) {
        super(driver);
    }

    public void setDescription(String description) {
        inputValueInFieldByName(descriptionFieldName, description);
    }

    public void setName(String name) {
        inputValueInFieldByName(nameFieldName, name);
    }

    public void setAccount(String account) {
        inputValueInFieldByName(accountFieldName, account);
    }

    public void setBankName(String bankName) {
        inputValueInFieldByName(bankNameFieldName, bankName);
    }

    public void setBankAccount(String bankAccount) {
        inputValueInFieldByName(bankAccountFieldName, bankAccount);
    }

    public void setBankBic(String bankBic) {
        inputValueInFieldByName(bankBicFieldName, bankBic);
    }

    public void clickElement1(){
        clickElementByXPath(element1ButtonXpath);
    }

    public void clickElement2(){
        clickElementByXPath(element2ButtonXpath);
    }
}



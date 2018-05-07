package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static helpers.DriverHelpers.firefoxDriverInit;
import static pages.AbstractPage.inputValueInField;

public class CucumberSteps extends BaseSteps{

    private WebDriver driver;

    @FindBy(how = How.ID, using = "contr_menu")
    private WebElement contrMenu;

    @FindBy(how = How.XPATH, using = "contr_menu")
    private WebElement createContrField;

    @FindBy(how = How.NAME, using = "description")
    private WebElement descriptionField;

    @FindBy(how = How.NAME, using = "name")
    private WebElement nameField;

    @FindBy(how = How.NAME, using = "account")
    private WebElement accountField;

    @FindBy(how = How.NAME, using = "bank_name")
    private WebElement bankNameField;

    @FindBy(how = How.NAME, using = "bank_account")
    private WebElement bankAccountField;

    @FindBy(how = How.NAME, using = "bank_bic")
    private WebElement bankBicField;

    @FindBy(how = How.XPATH, using = "//input[@value='Ð¡Ð¾Ð·Ð´Ð°ÑÑ']")
    private WebElement element1;

    @FindBy(how = How.XPATH, using = "//div[@id='conterparty_list']/table/tbody/tr[23]/td/div/a/h3")
    private WebElement element2;

    @FindBy(how = How.ID, using = "log_out")
    private WebElement logOutButton;

    @Given("^open system$")
    public void openSystem() throws Throwable {
        driver = firefoxDriverInit();
        openMainSystem();
        throw new PendingException();
    }

    @Given("^login with login and password \"([^\"]*)\" \"([^\"]*)\"$")
    public void loginWithLoginAndPassword(String arg1, String arg2) throws Throwable {
        loginAs(arg1, arg2);
        throw new PendingException();
    }

    @Given("^click contr menu$")
    public void clickContrMenu() throws Throwable {
        contrMenu.click();
        throw new PendingException();
    }

    @Given("^click create contr button$")
    public void clickCreateContrButton() throws Throwable {
        createContrField.click();
        throw new PendingException();
    }

    @Given("^set value in field Contr Description \"([^\"]*)\"$")
    public void setValueInFieldContrDescription(String arg1) throws Throwable {
        inputValueInField(descriptionField, arg1);
        throw new PendingException();
    }

    @Given("^set value in field Contr Name \"([^\"]*)\"$")
    public void setValueInFieldContrName(String arg1) throws Throwable {
        inputValueInField(nameField, arg1);
        throw new PendingException();
    }

    @Given("^set value in field Contr Account \"([^\"]*)\"$")
    public void setValueInFieldContrAccount(String arg1) throws Throwable {
        inputValueInField(accountField, arg1);
        throw new PendingException();
    }

    @Given("^set value in field Bank Name \"([^\"]*)\"$")
    public void setValueInFieldBankName(String arg1) throws Throwable {
        inputValueInField(bankNameField, arg1);
        throw new PendingException();
    }

    @Given("^set value in field Bank Account \"([^\"]*)\"$")
    public void setValueInFieldBankAccount(String arg1) throws Throwable {
        inputValueInField(bankAccountField, arg1);
        throw new PendingException();
    }

    @Given("^set value in field Bank Bic \"([^\"]*)\"$")
    public void setValueInFieldBankBic(String arg1) throws Throwable {
        inputValueInField(bankBicField, arg1);
        throw new PendingException();
    }

    @Given("^click elementOne$")
    public void clickElementOne() throws Throwable {
        element1.click();
        throw new PendingException();
    }

    @Given("^click elementTwo$")
    public void clickElementTwo() throws Throwable {
        element2.click();
        throw new PendingException();
    }

    @Then("^user close session$")
    public void userCloseSession() throws Throwable {
        logOutButton.click();
        driver.quit();
        throw new PendingException();
    }
}

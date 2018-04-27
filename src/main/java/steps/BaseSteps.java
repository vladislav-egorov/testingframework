package steps;

import org.openqa.selenium.WebDriver;
import pages.*;


public class BaseSteps {

    private WebDriver driver;

    private LoginPage loginPage;
    private HomePage homePage;
    private CreateContrPage createContrPage;
    private AssertSteps assertSteps;
    private CreateDocumentPage createDocumentPage = new CreateDocumentPage(driver);

    public BaseSteps(WebDriver driver) {
        this.driver = driver;
        this.loginPage = new LoginPage(driver);
        this.homePage = new HomePage(driver);
        this.createContrPage = new CreateContrPage(driver);
        this.assertSteps = new AssertSteps(driver);
    }

    BaseSteps() {
    }

    public void openMainSystem(){
        loginPage.openMainSystem();
    }

    public void loginAs(String username, String password){
        loginPage.inputLogin(username);
        loginPage.inputPassword(password);
        loginPage.clickSubmit();
    }

    public void startCreatingContr(){
        homePage.clickContrMenu();
        homePage.clickCreateContrField();
    }

    public void startCreatingDocument(String documentType){
        homePage.clickDocMenu();
        homePage.selectDocumentType(documentType);
        homePage.clickCreateDocumentField();
    }

    public void createContr(String description, String name, String account,
                                   String bankName, String bankAccount, String bankBic){

        createContrPage.setDescription(description);
        createContrPage.setName(name);
        createContrPage.setAccount(account);
        createContrPage.setBankName(bankName);
        createContrPage.setBankAccount(bankAccount);
        createContrPage.setBankBic(bankBic);
        createContrPage.clickElement1();
        createContrPage.clickElement2();

        assertSteps.checkContrAfterCreating(description, name, account, bankName, bankAccount, bankBic);
    }

    public void createDocument(String sum, String purpose, String payeeName, String payerAccount,
                               String payeeAccount, String payeeBank,
                               String payeeBankAccount, String payeeBankBic){

        createDocumentPage.setSum(sum);
        createDocumentPage.setPurpose(purpose);
        createDocumentPage.selectPayerAccount(payerAccount);
        createDocumentPage.setPayeeName(payeeName);
        createDocumentPage.setPayeeAccount(payeeAccount);
        createDocumentPage.setPayeeBank(payeeBank);
        createDocumentPage.setPayeeBankAccount(payeeBankAccount);
        createDocumentPage.setPayeeBankBic(payeeBankBic);
        createDocumentPage.clickCreateButton();

        assertSteps.checkDocumentAfterCreating(sum, purpose, payeeName, payeeBankAccount, payeeBankBic);

        createDocumentPage.signDocument();

    }

    public void createDocumentWithCounterParty(String sum, String purpose,
                                               String payerAccount, String payerCounterParty){

        createDocumentPage.setSum(sum);
        createDocumentPage.setPurpose(purpose);
        createDocumentPage.selectPayerAccount(payerAccount);
        createDocumentPage.selectPayeeCounerParty(payerCounterParty);

        assertSteps.checkDocumentWithCounterParty(sum, payerCounterParty);

        createDocumentPage.signDocument();

    }
}

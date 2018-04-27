import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import steps.BaseSteps;

import static helpers.DriverHelpers.closeSession;
import static helpers.DriverHelpers.firefoxDriverInit;

public class RecordedTest {

    private WebDriver driver;

    private BaseSteps baseSteps;
    private StringBuffer verificationErrors = new StringBuffer();

    private String login = "testuser4", password = "1234512345";

    @Before
    public void setUp() throws Exception {
        driver = firefoxDriverInit();
        baseSteps = new BaseSteps(driver);
    }

    @Test
    public void testCase1() throws Exception {
        String contrDescription = "Description", contrName = "Contr Name",
                contrAccount = "112344", bankName = "Bank Name",
                bankAccount = "123000333", bankBic = "93128372";

        baseSteps.openMainSystem();
        baseSteps.loginAs(login, password);
        baseSteps.startCreatingContr();
        baseSteps.createContr(contrDescription, contrName, contrAccount,
                bankName, bankAccount, bankBic);

    }

    @Test
    public void testCase2() throws Exception {
        String documentType = "Document Type", sum = "1000",
                purpose = "Purpose", payeeName = "Name", payerAccount = "40702810100110000001",
                payeeAccount = "12345678901234567890", payeeBank = "93128372",
                payeeBankAccount = "09876543210987654321", payeeBankBic = "123456789";

        baseSteps.openMainSystem();
        baseSteps.loginAs(login, password);
        baseSteps.startCreatingDocument(documentType);
        baseSteps.createDocument(sum, purpose, payeeName, payerAccount, payeeAccount,
                payeeBank, payeeBankAccount, payeeBankBic);
    }

    @Test
    public void testCase3() throws Exception {
        String documentType = "Document Type", sum = "1500",
                purpose = "Purpose", payerAccount = "40702810100110000001",
                payerCounterParty = "Payer Counter Party";

        baseSteps.openMainSystem();
        baseSteps.loginAs(login, password);
        baseSteps.startCreatingDocument(documentType);
        baseSteps.createDocumentWithCounterParty(sum, purpose, payerAccount, payerCounterParty);
    }

    @After
    public void tearDown() throws Exception {
        closeSession(driver, verificationErrors);
    }
}

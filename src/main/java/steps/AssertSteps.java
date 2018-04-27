package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AbstractPage;

class AssertSteps extends BaseSteps{
    private AbstractPage ap;

    AssertSteps(WebDriver driver) {
        this.ap = new AbstractPage(driver);
    }

    void checkContrAfterCreating(String description, String name, String account,
                                 String bankName, String bankAccount, String bankBic){

        Assert.assertEquals(description, ap.getTextOfElementByID("description"));
        Assert.assertEquals(name, ap.getTextOfElementByID("name"));
        Assert.assertEquals(account, ap.getTextOfElementByID("account"));
        Assert.assertEquals(bankName, ap.getTextOfElementByID("bank_name"));
        Assert.assertEquals(bankAccount, ap.getTextOfElementByID("bank_account"));
        Assert.assertEquals(bankBic, ap.getTextOfElementByID("bank_bic"));
    }

    void checkDocumentAfterCreating(String sum, String purpose, String payeeName,
                                           String payeeBankAccount, String payeeBankBic){

        Assert.assertEquals(sum, ap
                .getTextOfElementByXpath("//form[@id='operate_form']/div/div[2]/div"));
        Assert.assertEquals(purpose, ap
                .getTextOfElementByXpath("//form[@id='operate_form']/div/div[12]/div"));
        Assert.assertEquals(payeeBankAccount, ap
                .getTextOfElementByXpath("//form[@id='operate_form']/div/div[13]/div"));
        Assert.assertEquals(payeeName, ap
                .getTextOfElementByXpath("//form[@id='operate_form']/div/div[14]/div"));
        Assert.assertEquals(payeeBankAccount, ap
                .getTextOfElementByXpath("//form[@id='operate_form']/div/div[15]/div"));
        Assert.assertEquals(payeeBankBic, ap
                .getTextOfElementByXpath("//form[@id='operate_form']/div/div[16]/div"));
    }

    void checkDocumentWithCounterParty(String sum, String payerCounterParty){

        Assert.assertEquals(sum, ap
                .getTextOfElementByXpath("//form[@id='operate_form']/div/div[2]/div"));
        Assert.assertEquals(payerCounterParty, ap
                .getTextOfElementByXpath("//form[@id='operate_form']/div/div[12]/div"));

    }

}

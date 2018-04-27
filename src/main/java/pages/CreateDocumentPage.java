package pages;

import org.openqa.selenium.WebDriver;


public class CreateDocumentPage extends AbstractPage {

    String sumFieldName = "sum",
        purposeFieldName = "purpose",
        payerAccountSelectName = "payer_account",
        payeeNameFieldName = "payee_name",
        payeeAccountFieldName = "payee_account",
        payeeBankFieldName = "payee_bank",
        payeeBankAccountFieldName = "payee_bank_account",
        payeeBankBicFieldName = "payee_bank_bic",
        payeeCounerPartyFieldName = "payee_conterparty";

    String elementFieldXPath = "//input[@value='Ð¡Ð¾Ð·Ð´Ð°ÑÑ']";

    String signButtonID = "sign_button";


    public CreateDocumentPage(WebDriver driver) {
        super(driver);
    }

    public void setSum(String sum){
        inputValueInFieldByName(sumFieldName, sum);
    }

    public void setPurpose(String purpose){
        inputValueInFieldByName(purposeFieldName, purpose);
    }

    public void selectPayerAccount(String payerAccount){
        selectInDropDownMenuByName(payerAccountSelectName, payerAccount);
    }

    public void setPayeeName(String payeeName){
        inputValueInFieldByName(payeeNameFieldName, payeeName);
    }

    public void setPayeeAccount(String payeeAccount){
        inputValueInFieldByName(payeeAccountFieldName, payeeAccount);
    }

    public void setPayeeBank(String payeeBank){
        inputValueInFieldByName(payeeBankFieldName, payeeBank);
    }

    public void setPayeeBankAccount(String payeeBankAccount){
        inputValueInFieldByName(payeeBankAccountFieldName, payeeBankAccount);
    }

    public void setPayeeBankBic(String payeeBankBic){
        inputValueInFieldByName(payeeBankBicFieldName, payeeBankBic);
    }

    public void selectPayeeCounerParty(String payeeCounerParty){
        selectInDropDownMenuByName(payeeCounerPartyFieldName, payeeCounerParty);
    }


    public void clickCreateButton(){
        clickElementByXPath(elementFieldXPath);
    }

    public void signDocument(){
        clickElementByID(signButtonID);
    }
}

package pages;
import org.openqa.selenium.WebDriver;


public class LoginPage extends AbstractPage {

    private String loginFieldID = "login",
        passwordFieldID = "password",
        submitButtonID = "submit",
        mainSystemURL = "http://192.168.14.7:8080/reckondemo/login.php";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openMainSystem(){
        openURL(mainSystemURL);
    }

    public void inputLogin(String username){
        inputValueInFieldByID(loginFieldID, username);
    }

    public void inputPassword(String password){
        inputValueInFieldByID(passwordFieldID, password);
    }

    public void clickSubmit(){
        clickElementByID(submitButtonID);
    }
}
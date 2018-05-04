package steps;

import cucumber.api.PendingException;
import cucumber.api.java.ru.*;

public class CucumberSteps extends BaseSteps{

   @Дано("^открыть главную систему$")
    public void открытьГлавнуюСистему() throws Throwable {
        openMainSystem();
        throw new PendingException();
    }

    @Дано("^вход в систему по логину и паролю \"([^\"]*)\" \"([^\"]*)\"$")
    public void входВСистемуПоЛогинуИПаролю(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Дано("^пользователь \\(нажимает кнопку верхнего меню\\) \"([^\"]*)\"$")
    public void пользовательНажимаетКнопкуВерхнегоМеню(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Дано("^пользователь \\(нажимает кнопку\\) \"([^\"]*)\"$")
    public void пользовательНажимаетКнопку(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Дано("^пользователь \\(вводит значение в поле\\) \"([^\"]*)\"$")
    public void пользовательВводитЗначениеВПоле(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Дано("^пользователь \\(нажимает на кнопку\\) \"([^\"]*)\"$")
    public void пользовательНажимаетНаКнопку(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Тогда("^пользователь завершает сеанс$")
    public void пользовательЗавершаетСеанс() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends CommonMethods {

    By title = By.xpath("//*[@class='sign-up-title']");
    By usernameInput = By.xpath("//input [@class ='form-control email-title']");
    By usernamePassword = By.xpath("//input [@class ='form-control']");
    By loginBtn = By.xpath("//input [@class ='btn btn-lg btn-success btn-block']");
    By rememberCheckBox = By.xpath("//input [@name ='remember']");
    By txtWithErrorMsg = By.xpath("//form [@method ='POST']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public String GetTitle() throws Exception {

        return getText(title);
    }

    public void enter_username(String userName) throws Exception {

        sendText(usernameInput, userName);

    }

    public void enter_password(String password) throws Exception {

        sendText(usernamePassword, password);
    }

    public void clickLoginBtn() throws Exception {

        click(loginBtn);
    }

    public void clickRememberCheckbox() throws Exception {

        click(rememberCheckBox);
    }

    public void login(String userName,String password) throws Exception {

        enter_username(userName);
        enter_password(password);
        clickRememberCheckbox();
        clickLoginBtn();
    }

    public String GetTxtErrorMsg() throws Exception {

        String s=getText(txtWithErrorMsg);
        s=getText(txtWithErrorMsg);
        return getText(txtWithErrorMsg);
    }

}

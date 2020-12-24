package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Chat extends CommonMethods {

    public static final By chatIcon = By.cssSelector("svg > path");
    By chatTextBox = By.xpath("//textarea [@name ='message']");
    By chatIframe = By.cssSelector("div>iframe");
    By chatIframeBody = By.id("intercom-container-body");

    public Chat(WebDriver driver){
        super(driver);
    }

    public void openChat() throws Exception {

        click(chatIcon);
    }

    public void sendMsg(String textToSend) throws Exception {

        switchToIframe(chatIframe);
        sendText(chatTextBox,textToSend);
        pressEnter(chatTextBox);
    }

    public String getTextFromChatBox() throws Exception {

        return getText(chatIframeBody);
    }
}

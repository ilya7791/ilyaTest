package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Chat;

import static pages.CommonLocators.siteURL;

public class ChatTest extends BaseTest {

    Chat objChat;

    @BeforeMethod
    public void setup() throws Exception {

        objChat = new Chat(driver);
        driver.get(siteURL);
    }

    @Test()
    public void check_that_response_in_chat_received_whithin_five_seconds_after_sending_text() throws Exception {

        test = extent.createTest("check_that_response_in_chat_received_whithin_five_seconds_after_sending_text");
        objChat.openChat();
        objChat.sendMsg("Hi");
        Thread.sleep(5000);
        String chatTxt = objChat.getTextFromChatBox();
        Assert.assertTrue(chatTxt.contains("Give the team a way to reach you:"));
    }
}

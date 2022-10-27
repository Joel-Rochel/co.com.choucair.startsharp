package co.com.choucair.startsharp.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoToCreateMeetingPage extends PageObject {
    public static final Target SELECT_MEETING = Target.the("We select meetings")
            .located(By.xpath("//span[contains(text(),'Meeting')]"));
    public static final Target SELECT_MEETINGS = Target.the("We select meetings")
            .located(By.xpath("//span[contains(text(),'Meetings')]"));
    public static final Target BUTTON_NEW_MEETING = Target.the("Button to create a new meeting")
            .located(By.xpath("//span[@class = 'button-inner']"));
}

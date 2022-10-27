package co.com.choucair.startsharp.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public static final Target INPUT_USERNAME = Target.the("Field to enter the username")
            .located(By.id("StartSharp_Membership_LoginPanel0_Username"));
    public static final  Target INPUT_PASSWORD = Target.the("Field to enter the password")
            .located(By.id("StartSharp_Membership_LoginPanel0_Password"));
    public static final  Target BUTTON_SING_IN = Target.the("button to login")
            .located(By.id("StartSharp_Membership_LoginPanel0_LoginButton"));
}

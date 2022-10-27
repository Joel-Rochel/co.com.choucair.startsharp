package co.com.choucair.startsharp.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateMeetingPage extends PageObject {
    public static final Target INPUT_MEETING_NAME = Target.the("Field to enter the name of the meeting")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingName"));
    public static final Target SELECT_MEETING_TYPE = Target.the("Field to select the type of meeting")
            .located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_MeetingTypeId"));
    public static final Target INPUT_MEETING_TYPE = Target.the("Field to enter the type of meeting")
            .located(By.id("s2id_autogen6_search"));
    public static  final Target INPUT_MEETING_NUMBER = Target.the("Field to enter the meeting number")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber"));
    public static final  Target INPUT_START_DATE = Target.the("Field to enter the start date of the meeting")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_StartDate"));
    public static final Target SELECT_START_HOUR = Target.the("Field to enter the start time of the meeting")
            .located(By.xpath("//div[@class= 'field StartDate col-sm-6']//select"));
    public static final Target INPUT_END_DATE = Target.the("Field to enter the end date of the meeting")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_EndDate"));
    public static final Target SELECT_END_HOUR = Target.the("Field to enter the end time of the meeting")
            .located(By.xpath("//div[@class= 'field EndDate col-sm-6']//select"));
    public static final Target SELECT_LOCATION = Target.the("Field to select the location of the meeting")
            .located(By.id("select2-chosen-7"));
    public static final Target INPUT_LOCATION = Target.the("Field to enter the location of the meeting")
            .located(By.id("s2id_autogen7_search"));
    public static final Target SELECT_UNIT = Target.the("Field to select the meeting business unit")
            .located(By.id("select2-chosen-8"));
    public static final Target INPUT_UNIT = Target.the("Field to enter the business unit of the meeting")
            .located(By.id("s2id_autogen8_search"));
    public static final Target SELECT_ORGANIZED_BY = Target.the("Field to select meeting organizer")
            .located(By.id("select2-chosen-9"));
    public static final Target INPUT_ORGANIZED_BY = Target.the("Field to enter the meeting organizer")
            .located(By.id("s2id_autogen9_search"));
    public static final Target SELECT_REPORTER = Target.the("Field to select the meeting reporter")
            .located(By.id("select2-chosen-10"));
    public static final Target INPUT_REPORTER = Target.the("Field to enter the meeting reporter")
            .located(By.id("s2id_autogen10_search"));
    public static final Target SELECT_ATTENDEE_LIST = Target.the("Field to select the list of meeting attendees")
            .located(By.id("select2-chosen-12"));
    public static final Target INPUT_ATTENDEE_LIST = Target.the("Field to enter the list of meeting attendees")
            .located(By.id("s2id_autogen12_search"));
    public static final Target BUTTON_SAVE = Target.the("Button to create the meeting")
            .located(By.xpath("//div[@id= 'Serenity_Pro_Meeting_MeetingDialog10_Tabs']//div//div//div//div//span[@class= 'button-inner']"));

}

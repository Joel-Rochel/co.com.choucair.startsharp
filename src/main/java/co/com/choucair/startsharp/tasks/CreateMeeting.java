package co.com.choucair.startsharp.tasks;

import co.com.choucair.startsharp.model.StartSharpData;
import co.com.choucair.startsharp.userinterface.CreateMeetingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.startsharp.userinterface.CreateMeetingPage.*;

public class CreateMeeting implements Task {

    private List<StartSharpData> data;

    public CreateMeeting(List<StartSharpData> data) {
        this.data = data;
    }

    public static CreateMeeting onThePage(List<StartSharpData> data) {
        return Tasks.instrumented(CreateMeeting.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrMeetingName()).into(INPUT_MEETING_NAME),
                Click.on(SELECT_MEETING_TYPE),
                Enter.theValue(data.get(0).getStrMeetingType()).into(INPUT_MEETING_TYPE),
                Hit.the(Keys.ENTER).into(INPUT_MEETING_TYPE),
                Enter.theValue(data.get(0).getStrMeetingNumber()).into(INPUT_MEETING_NUMBER),
                Enter.theValue(data.get(0).getStrStartDate()).into(INPUT_START_DATE),
                SelectFromOptions.byVisibleText(data.get(0).getStrStartHour()).from(SELECT_START_HOUR),
                Enter.theValue(data.get(0).getStrEndDate()).into(INPUT_END_DATE),
                SelectFromOptions.byVisibleText(data.get(0).getStrEndHour()).from(SELECT_END_HOUR),
                Click.on(SELECT_LOCATION),
                Enter.theValue(data.get(0).getStrLocation()).into(INPUT_LOCATION),
                Hit.the(Keys.ENTER).into(INPUT_LOCATION),
                Click.on(SELECT_UNIT),
                Enter.theValue(data.get(0).getStrUnit()).into(INPUT_UNIT),
                Hit.the(Keys.ENTER).into(INPUT_UNIT),
                Click.on(SELECT_ORGANIZED_BY),
                Enter.theValue(data.get(0).getStrOrganizedBy()).into(INPUT_ORGANIZED_BY),
                Hit.the(Keys.ENTER).into(INPUT_ORGANIZED_BY),
                Click.on(SELECT_REPORTER),
                Enter.theValue(data.get(0).getStrReporter()).into(INPUT_REPORTER),
                Hit.the(Keys.ENTER).into(INPUT_REPORTER),
                Click.on(SELECT_ATTENDEE_LIST),
                Enter.theValue(data.get(0).getStrAttendeeList()).into(INPUT_ATTENDEE_LIST),
                Hit.the(Keys.ENTER).into(INPUT_ATTENDEE_LIST),
                Click.on(BUTTON_SAVE));

    }
}

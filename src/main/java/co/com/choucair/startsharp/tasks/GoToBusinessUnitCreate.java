package co.com.choucair.startsharp.tasks;

import co.com.choucair.startsharp.userinterface.GoToBusinessUnitCreatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.startsharp.userinterface.GoToBusinessUnitCreatePage.*;

public class GoToBusinessUnitCreate implements Task {

    public static GoToBusinessUnitCreate onThePage() {
        return Tasks.instrumented(GoToBusinessUnitCreate.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SELECT_ORGANIZATION),
                Click.on(SELECT_BUSINESS_UNITS),
                Click.on(BUTTON_NEW_BUSINESS_UNIT));
    }
}

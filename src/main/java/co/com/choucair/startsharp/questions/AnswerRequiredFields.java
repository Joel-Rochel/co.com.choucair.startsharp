package co.com.choucair.startsharp.questions;

import co.com.choucair.startsharp.model.StartSharpData;
import co.com.choucair.startsharp.userinterface.GoToBusinessUnitCreatePage;
import co.com.choucair.startsharp.userinterface.GoToCreateMeetingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static co.com.choucair.startsharp.userinterface.GoToBusinessUnitCreatePage.*;

public class AnswerRequiredFields implements Question<Boolean> {

    private List<StartSharpData> data;

    public AnswerRequiredFields(List<StartSharpData> data) {
        this.data = data;
    }

    public static AnswerRequiredFields toThe(List<StartSharpData> data) {
        return new AnswerRequiredFields(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String confirm_button= Text.of(BUTTON_NEW_BUSINESS_UNIT).viewedBy(actor).asString();

        if (data.get(0).getStrConfirmButton().equals(confirm_button)){
            return true;
        }else {
            return false;
        }
    }
}

package co.com.choucair.startsharp.questions;

import co.com.choucair.startsharp.model.StartSharpData;
import co.com.choucair.startsharp.userinterface.GoToCreateMeetingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static co.com.choucair.startsharp.userinterface.GoToCreateMeetingPage.*;

public class Answer implements Question<Boolean> {

    private List<StartSharpData> data;

    public Answer(List<StartSharpData> data) {
        this.data = data;
    }

    public static Answer toThe(List<StartSharpData> data) {
        return new Answer(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String confirm_button= Text.of(BUTTON_NEW_MEETING).viewedBy(actor).asString();

        if (data.get(0).getStrConfirmButton().equals(confirm_button)){
            return true;
        }else {
            return false;
        }
    }
}

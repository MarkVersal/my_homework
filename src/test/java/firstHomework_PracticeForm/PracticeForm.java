package firstHomework_PracticeForm;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeForm {
        @BeforeAll
        static void beforeAll() {
                Configuration.browserSize = "1920x1080";
                Configuration.baseUrl = "https://demoqa.com";
        }

@Test
void practiceForm(){
open("/automation-practice-form");

$("#firstName").setValue("Mark");
$("#lastName").setValue("Versal");
$("#userEmail").setValue("MarkVersal@mail.ya");
$(".custom-control-label").click();
$("#userNumber").setValue("1234567890");
$("#dateOfBirthInput").click();
$(".react-datepicker__month-select").click();
}


}

package firstHomework_PracticeForm;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

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
$(".react-datepicker__month-select").$(byText("February")).click();
$(".react-datepicker__year-select").$(byText("1999")).click();
$(".react-datepicker__week .react-datepicker__day--001").click();
$("#subjectsInput").setValue("Hindi");
$("#react-select-2-option-0").click();
$("#hobbiesWrapper").$(byText("Sports")).click();
$("#uploadPicture").uploadFromClasspath("pictures/test.png");
$("#currentAddress").setValue("Russia");
$("#state").click();
$(".css-11unzgr").$(byText("Uttar Pradesh")).click();
$("#city").click();
$(".css-11unzgr").$(byText("Lucknow")).click();
$("#submit").click();
$(".modal-body").shouldHave(text("Mark"));
$(".modal-body").shouldHave(text("Versal"));
$(".modal-body").shouldHave(text("MarkVersal@mail.ya"));
$(".modal-body").shouldHave(text("1234567890"));
$(".modal-body").shouldHave(text("1 February,1999"));
$(".modal-body").shouldHave(text("Hindi"));
$(".modal-body").shouldHave(text("Sports"));
$(".modal-body").shouldHave(text("test.png"));
$(".modal-body").shouldHave(text("Russia"));
$(".modal-body").shouldHave(text("Lucknow"));
}
}

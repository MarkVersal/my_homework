package firstHomework_PracticeForm;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class PracticeFormWithPageObjects extends TestBase {

        @Test
        void practiceForm() {
                String userName = "Mark";

                registrationPage.openPage()
                        .setFirstName(userName)
                        .setLastName("Versal")
                        .setEmail("MarkVersal@mail.ya")
                        .setGender()
                        .setNumber("1234567890")
                        .setBirthDay("30","July", "2008");

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
                registrationPage.verifyResultsModalAppears()
                                .verifyResult("Student Name", userName + " Versal")
                                .verifyResult("Student Email", "MarkVersal@mail.ya")
                                .verifyResult("Gender", "Male")
                                .verifyResult("Mobile", "1234567890")
                                .verifyResult("Date of Birth", "1 February,1999");
                $(".modal-body").shouldHave(text("Hindi"));
                $(".modal-body").shouldHave(text("Sports"));
                $(".modal-body").shouldHave(text("test.png"));
                $(".modal-body").shouldHave(text("Russia"));
                $(".modal-body").shouldHave(text("Lucknow"));
        }

        @Test
        void practiceForm1() {
                String userName = "Mark";

                registrationPage.openPage();
                registrationPage.setFirstName(userName);
                registrationPage.setLastName("Versal");
                registrationPage.setEmail("MarkVersal@mail.ya");
                registrationPage.setGender();
                registrationPage.setNumber("1234567890");
        }
}

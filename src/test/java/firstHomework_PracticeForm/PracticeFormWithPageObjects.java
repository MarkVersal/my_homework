package firstHomework_PracticeForm;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class PracticeFormWithPageObjects extends TestBase {

        @Test
        void practiceForm() {
                String firstUserName = "Mark";
                String lastUserName = " Versal";
                String emailUserName = "MarkVersal@mail.ya";
                String numberUserName = "1234567890";
                String gender = "Male";
                String birthDay = "30";
                String birthMonth = "July";
                String birthYear = "2008";
                String subjects = "Hindi";
                String hobbies = "Sports";
                String address = "Russia";
                String state = "Uttar Pradesh";
                String city = "Lucknow";

                registrationPage.openPage()
                        .setFirstName(firstUserName)
                        .setLastName(lastUserName)
                        .setEmail(emailUserName)
                        .setGender()
                        .setNumber(numberUserName)
                        .setBirthDay(birthDay,birthMonth,birthYear)
                        .setSubjects(subjects)
                        .setHobbies(hobbies)
                        .setFile()
                        .setAddress(address)
                        .setState(state)
                        .setCity(city)
                        .submit();
                registrationPage.verifyResultsModalAppears()
                        .verifyResult("Student Name", firstUserName + lastUserName)
                        .verifyResult("Student Email", emailUserName)
                        .verifyResult("Gender", gender)
                        .verifyResult("Mobile", numberUserName)
                        .verifyResult("Subjects", subjects)
                        .verifyResult("Hobbies", hobbies)
                        .verifyResult("Picture", "test.png")
                        .verifyResult("Address", address)
                        .verifyResult("State and City", city);
        }
}

//        @Test
//        void practiceForm1() {
//                String userName = "Mark";
//
//                registrationPage.openPage();
//                registrationPage.setFirstName(userName);
//                registrationPage.setLastName("Versal");
//                registrationPage.setEmail("MarkVersal@mail.ya");
//                registrationPage.setGender();
//                registrationPage.setNumber("1234567890");
//        }
//}

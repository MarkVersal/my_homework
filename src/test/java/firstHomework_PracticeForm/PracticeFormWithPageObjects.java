package firstHomework_PracticeForm;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import static utils.RandomUtils.getRandomEmail;
import static utils.RandomUtils.getRandomString;

public class PracticeFormWithPageObjects extends TestBase {
        Faker faker = new Faker();

        String firstUserName = faker.name().firstName(),
                lastUserName =  faker.name().lastName(),
                emailUserName = faker.internet().emailAddress(),
                numberUserName = "1234567890",
                gender = "Male",
                birthDay = "30",
                birthMonth = "July",
                birthYear = "2008",
                subjects = "Hindi",
                hobbies = "Sports",
                address = "Russia",
                state = "Uttar Pradesh",
                city = "Lucknow";

        @Test
        void practiceForm() {
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
                        .verifyResult("Student Name", firstUserName + " " + lastUserName)
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

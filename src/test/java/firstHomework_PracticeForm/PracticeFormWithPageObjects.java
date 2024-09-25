package firstHomework_PracticeForm;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import static utils.RandomUtils.*;

public class PracticeFormWithPageObjects extends TestBase {
        Faker faker = new Faker();

        String firstUserName = faker.name().firstName();
        String lastUserName =  faker.name().lastName();
        String emailUserName = faker.internet().emailAddress();
        String numberUserName = "79" + faker.number().numberBetween(10000000,99999999);
        String gender = faker.demographic().sex();
        String birthDay = faker.
        String birthMonth = "July",
        String birthYear = "2008",
        String subjects = "Hindi",
        String hobbies = "Sports",
        String address = "Russia",
        String state = "Uttar Pradesh",
        String city = "Lucknow";

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

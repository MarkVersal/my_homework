package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.RegistrationResultModal;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    private CalendarComponent calendarComponent = new CalendarComponent();
    private RegistrationResultModal registrationResultModal = new RegistrationResultModal();

    private final String TITLE_TEXT = "Student Registration Form";
    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            setEmail = $("#userEmail"),
            setGender = $(".custom-control-label"),
            setNumber = $("#userNumber"),
            dateOfBirthImput = $("#dateOfBirthInput");


    public RegistrationPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(TITLE_TEXT));

        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setEmail(String value) {
        setEmail.setValue(value);

        return this;
    }

    public RegistrationPage setGender() {
        setGender.click();

        return this;
    }

    public RegistrationPage setNumber(String value) {
        setNumber.setValue(value);

        return this;
    }

    public RegistrationPage setBirthDay(String day, String month, String year) {
        dateOfBirthImput.click();
calendarComponent.setDate(day, month, year);
        return this;
    }

    public RegistrationPage verifyResultsModalAppears() {
        registrationResultModal.verifyModalAppears();

        return this;
    }

    public RegistrationPage verifyResult(String key, String value) {
        registrationResultModal.verifyResult(key, value);

        return this;
    }
}

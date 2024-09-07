package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.RegistrationResultModal;
import pages.components.UploadFile;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    private CalendarComponent calendarComponent = new CalendarComponent();
    private UploadFile uploadFile = new UploadFile();
    private RegistrationResultModal registrationResultModal = new RegistrationResultModal();

    private final String TITLE_TEXT = "Student Registration Form";
    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            setEmail = $("#userEmail"),
            setGender = $(".custom-control-label"),
            setNumber = $("#userNumber"),
            dateOfBirthImput = $("#dateOfBirthInput"),
            chooseSubjects = $("#subjectsInput"),
            chooseSubjectsClick = $("#react-select-2-option-0"),
            chooseHobbies = $("#hobbiesWrapper"),
            chooseAddress = $("#currentAddress"),
            chooseState = $("#state"),
            chooseStateClick = $(".css-11unzgr"),
            chooseCity = $("#city"),
            chooseCityClick = $(".css-11unzgr"),
            clickSubmit = $("#submit");


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

    public RegistrationPage setSubjects(String value) {
        chooseSubjects.setValue(value);
        chooseSubjectsClick.click();
        return this;

    }

    public RegistrationPage setHobbies(String value) {
        chooseHobbies.$(byText(value)).click();
        return this;

    }

    public RegistrationPage setFile() {
        uploadFile.chooseFile();
        return this;

    }

    public RegistrationPage setAddress(String value) {
        chooseAddress.setValue(value);
        return this;

    }

    public RegistrationPage setState(String value) {
        chooseState.click();
        chooseStateClick.$(byText(value)).click();
        return this;

    }

    public RegistrationPage setCity(String value) {
        chooseCity.click();
        chooseCityClick.$(byText(value)).click();
        return this;
    }

    public RegistrationPage submit() {
        clickSubmit.click();
        return this;
    }

}

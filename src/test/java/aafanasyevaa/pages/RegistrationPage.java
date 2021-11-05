package aafanasyevaa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    //locators
    private final String FORM_TITLE = "Student Registration Form";
    private SelenideElement
            formTitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            genderRadio = $(byText("Female")),
            numberInput = $("#userNumber"),
//           calendarSelect = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput"),
            subjectSelect = $(byText("Chemistry")),
            hobbySelect = $(byText("Sports")),
            addressInput = $("#currentAddress"),
            listOfStates = $("#state"),
            stateSelect = $(byText("NCR")),
            listOfCities = $("#city"),
            citySelect = $(byText("Delhi")),
            formSubmitButton = $("#submit");

    public CalendarComponent calendar = new CalendarComponent();


    //actions
    public RegistrationPage openPage() {
        open("https://demoqa.com/automation-practice-form");
        formTitle.shouldHave(text(FORM_TITLE));
        return this;
    }

    public RegistrationPage typeFirstName(String name) {
        firstNameInput.setValue(name);
        return this;
    }

    public RegistrationPage typeLastName(String lastName) {
        lastNameInput.setValue(lastName);
        return this;
    }

    public RegistrationPage typeEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    public RegistrationPage chooseGender() {
        genderRadio.click();
        return this;
    }

    public RegistrationPage typeNumber(String number) {
        numberInput.setValue(number);
        return this;
    }

//    public RegistrationPage openCalendar() {
//        calendarSelect.click();
//        return this;
//    }

    public RegistrationPage chooseSubject(String letter) {
        subjectsInput.setValue(letter);
        return this;
    }

    public RegistrationPage selectSubject() {
        subjectSelect.click();
        return this;
    }

    public RegistrationPage chooseHobby() {
        hobbySelect.click();
        return this;
    }

    public RegistrationPage typeAddress(String address) {
        addressInput.setValue(address);
        return this;
    }

    public RegistrationPage openListOfStates() {
        listOfStates.click();
        return this;
    }

    public RegistrationPage selectState() {
        stateSelect.click();
        return this;
    }

    public RegistrationPage openListOfCities() {
        listOfCities.click();
        return this;
    }

    public RegistrationPage selectCity() {
        citySelect.click();
        return this;
    }

    public RegistrationPage submitTheForm() {
        formSubmitButton.click();
        return this;
    }
}
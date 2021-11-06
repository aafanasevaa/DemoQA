package aafanasyevaa.pages;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    private final String FORM_TITLE = "Student Registration Form";
    private SelenideElement
            formTitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            genderRadio = $("#genterWrapper"),
            numberInput = $("#userNumber"),
            subjectsInput = $("#subjectsInput"),
            hobbySelect =  $("#hobbiesWrapper"),
            uploadPictureButton = $("#uploadPicture"),
            addressInput = $("#currentAddress"),
            listOfStates = $("#state"),
            listOfCities = $("#city"),
            formSubmitButton = $("#submit"),
            resultsTable =  $(".table-responsive");

    public Calendar calendar = new Calendar();

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

    public RegistrationPage chooseGender(String value) {
        genderRadio.find(byText(value)).click();
        return this;
    }

    public RegistrationPage typeNumber(String number) {
        numberInput.setValue(number);
        return this;
    }

    public RegistrationPage chooseSubject(String letter) {
        subjectsInput.setValue(letter).pressEnter();
        return this;
    }

    public RegistrationPage chooseHobby(String value) {
        hobbySelect.find(byText(value)).click();
        return this;
    }
    public RegistrationPage uploadPicture() {
        uploadPictureButton.uploadFile(new File("src/test/resources/pic.png"));
        return this;
    }

    public RegistrationPage typeAddress(String address) {
        addressInput.setValue(address);
        return this;
    }

    public RegistrationPage openListOfStates(String value) {
        listOfStates.click();
        listOfStates.find(byText(value)).click();
        return this;
    }

    public RegistrationPage openListOfCities(String value) {
        listOfCities.click();
        listOfCities.find(byText(value)).click();
        return this;
    }

    public RegistrationPage submitTheForm() {
        formSubmitButton.click();
        return this;
    }
    public RegistrationPage checkResultsValue(String key, String value) {
        resultsTable.$(byText(key)).parent().shouldHave(text(value));
        return this;
    }
}
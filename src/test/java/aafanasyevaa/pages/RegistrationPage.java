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
            genderChoice = $(byText("Female")),
            numberInput = $("#userNumber"),

    //actions
    public RegistrationPage openPage (){
        open("https://demoqa.com/automation-practice-form");
        formTitle.shouldHave(text(FORM_TITLE));
        return this;
    }

    public RegistrationPage typeFirstName (String name){
       firstNameInput.setValue(name);
       return this;
    }

    public RegistrationPage typeLastName (String lastName){
        lastNameInput.setValue(lastName);
        return this;
    }

    public RegistrationPage typeEmail (String email){
        emailInput.setValue(email);
        return this;
    }

//    public void chooseGender (){
//        genderChoice.click();
//    }

    public RegistrationPage typeNumber (String number){
        numberInput.setValue(number);
        return this;
    }
}

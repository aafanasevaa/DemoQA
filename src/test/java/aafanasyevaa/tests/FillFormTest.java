package aafanasyevaa.tests;

import aafanasyevaa.pages.RegistrationPage;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import aafanasyevaa.testData.TestData;
import aafanasyevaa.tests.TestBase;

public class FillFormTest extends TestData {

    @Test
    void FillFormTest() {
        registrationPage.openPage()
                .typeFirstName(firstName)
                .typeLastName(lastName)
                .typeEmail(email)
                .chooseGender("Female")
                .typeNumber(phone)
                .chooseSubject("Chemistry")
                .chooseHobby("Reading")
                .uploadPicture()
                .typeAddress(address)
                .openListOfStates("NCR")
                .openListOfCities("Delhi");
        registrationPage.calendar.setDate("10", "November", "1997");
        registrationPage.submitTheForm();
        registrationPage.checkResultsValue("Student Name", firstName + lastName)
                        .checkResultsValue("Student Email", email)
                        .checkResultsValue("Gender", "Female")
                        .checkResultsValue("Mobile", phone)
                        .checkResultsValue("Date of Birth", "10 November,1997")
                        .checkResultsValue("Subjects", "Chemistry")
                        .checkResultsValue("Hobbies", "Reading")
                        .checkResultsValue("Picture", "pic.png")
                        .checkResultsValue("Address", address)
                        .checkResultsValue("State and City", "NCR Delhi");
    }
}

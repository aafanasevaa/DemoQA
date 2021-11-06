package aafanasyevaa.tests;

import aafanasyevaa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

public class FillFormTest extends TestBase {

    @Test
    void FillFormTest() {
        registrationPage.openPage()
                .typeFirstName("Anastasiia")
                .typeLastName("Afanasyeva")
                .typeEmail("aaa@aaa.com")
                .chooseGender("Female")
                .typeNumber("888999000777")
                .chooseSubject("Chemistry")
                .chooseHobby("Reading")
                .uploadPicture()
                .typeAddress("Russia")
                .openListOfStates("NCR")
                .openListOfCities("Delhi");
        registrationPage.calendar.setDate("10", "November", "1997");
        registrationPage.submitTheForm();
        registrationPage.checkResultsValue("Student Name", "Anastasiia Afanasyeva")
                        .checkResultsValue("Student Email", "aaa@aaa.com")
                        .checkResultsValue("Gender", "Female")
                        .checkResultsValue("Mobile", "8889990007")
                        .checkResultsValue("Date of Birth", "10 November,1997")
                        .checkResultsValue("Subjects", "Chemistry")
                        .checkResultsValue("Hobbies", "Reading")
                        .checkResultsValue("Picture", "pic.png")
                        .checkResultsValue("Address", "Russia")
                        .checkResultsValue("State and City", "NCR Delhi");
    }
}

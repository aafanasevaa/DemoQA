package aafanasyevaa.tests;

import aafanasyevaa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

public class FillFormTest extends TestBase {

    @Test
    void FillFormTest() {
        registrationPage.openPage()
                .typeFirstName("Anastasiia")
                .typeLastName("Afanasyeva")
                .typeEmail("aaa@aaa")
                .chooseGender()
                .typeNumber("888999000777")
//                .openCalendar()
//                registrationPage.calendar.setDate("30", "July", "2008");

//        $(".react-datepicker__month-select").selectOptionByValue(String.valueOf(11));
//        $(".react-datepicker__year-select").selectOptionByValue(String.valueOf(1997));
//        $$(".react-datepicker__day").find(text("1")).click();
//        $("#subjectsInput").click();

                .chooseSubject("C")
                .selectSubject()
                .chooseHobby()

//        File image = new File("src/test/resources/pic.jpg");
//        $("#uploadPicture").uploadFile(image);

                 .typeAddress("Russia")
                 .openListOfStates()
                 .selectState()
                 .openListOfCities()
                 .selectCity()
                 .submitTheForm();

//        $(".table-responsive").shouldHave(text("Anastasiia"), text("Afanasyeva"), text("afanasyevaa.anastasiia@gmail.com"),
//                text("Female"), text("8899776655"), text("01 December ,1997"), text("Chemistry"),
//                text("Sports"), text("pic.jpg"), text("Russia"),
//                text("NCR Delhi"));

    }
}

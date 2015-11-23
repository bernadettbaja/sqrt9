package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import helper.Dates;
import helper.Constante;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.LogInSteps;
import steps.NewVacationRequestSteps;

@RunWith(SerenityRunner.class)
public class NewVacationRequestTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LogInSteps logInSteps;
   
    @Steps
    public NewVacationRequestSteps newVacationRequestSteps;

    @Test
    public void newSimpleRequest() 
    {
    	logInSteps.login(Constante.USERDEV, Constante.PASSDEV);
    	newVacationRequestSteps.clickNewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(Dates.pickstartday, Dates.pickstartmonth, Dates.pickstartyear);
    	newVacationRequestSteps.selectEndDate(Dates.pickendday, Dates.pickendmonth, Dates.pickendyear);
//    	newVacationRequestSteps.selectHoliday();
//    	newVacationRequestSteps.selectVacationWithoutPayment();
//    	newVacationRequestSteps.selectSickleave();
//    	newVacationRequestSteps.selectSpecialvacation();
    	newVacationRequestSteps.selectMaternityleave();
    	newVacationRequestSteps.selectMaternityLeaveOption();
    	newVacationRequestSteps.clickAddComment();
    	newVacationRequestSteps.typeComment("Comentariuasdasd asd asd");
    	newVacationRequestSteps.clickSaveButton();
 
    	

    }
} 
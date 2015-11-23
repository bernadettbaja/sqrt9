package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import helper.Dates;
import helper.constante;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import pages.NewVacationRequestPage;
import steps.ApproveRequestSteps;
import steps.LogInSteps;
import steps.LogOutSteps;
import steps.NewVacationRequestSteps;

@RunWith(SerenityRunner.class)
public class NewRequestSignOutApproveTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LogInSteps logInSteps;
    
    @Steps
    public LogOutSteps logOutSteps;
   
    @Steps
    public NewVacationRequestSteps newVacationRequestSteps;
    
    @Steps
    public ApproveRequestSteps approveRequestSteps;
    
   

    @Test
    public void logoutScenarioTest() 
    {
    	logInSteps.login(constante.USERPM, constante.PASSPM);
    	newVacationRequestSteps.clickNewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(Dates.startday, Dates.startmonth, Dates.startyear);
    	newVacationRequestSteps.selectEndDate(Dates.endday, Dates.endmonth, Dates.endyear);
    	newVacationRequestSteps.selectHoliday();
    	newVacationRequestSteps.clickAddComment();
    	newVacationRequestSteps.typeComment("Concediu");
    	newVacationRequestSteps.clickSaveButton();
    	logOutSteps.clickProfilePicture();
    	logOutSteps.signOut();
    	logInSteps.login(constante.USERDM, constante.PASSDM);
    	approveRequestSteps.GoToInbox();
    	approveRequestSteps.checklist();
    	approveRequestSteps.approve();
    	approveRequestSteps.verifymessage();
    	
    }
}
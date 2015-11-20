package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.pages.NewVacationRequestPage;
import com.steps.serenity.ApproveRequestSteps;
import com.steps.serenity.LogInSteps;
import com.steps.serenity.LogOutSteps;
import com.steps.serenity.NewVacationRequestSteps;

import Helper.constante;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

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
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(12, "May", 2016);
    	newVacationRequestSteps.selectEndDate(13, "May", 2016);
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
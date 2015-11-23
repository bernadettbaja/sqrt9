package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
//import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
//import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import steps.ApproveRequestSteps;
import steps.EndUserSteps;
import steps.LogInSteps;
import steps.RejectRequestSteps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import helper.Constante;

@RunWith(SerenityRunner.class)
public class RejectRequestTest 
{

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LogInSteps logInSteps;
    
    @Steps
    public RejectRequestSteps rejectRequestSteps;
  
    @Test
    public void approveRequestTest() {
    	logInSteps.login(Constante.USERDM, Constante.PASSDM);
    	rejectRequestSteps.GoToInbox();
    	rejectRequestSteps.checklist();
    	rejectRequestSteps.reject();
    	rejectRequestSteps.verifymessage();
    }
     
  
    
}    
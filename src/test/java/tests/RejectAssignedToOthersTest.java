package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
//import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
//import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import steps.AssignedToOthersSteps;
import steps.LogInSteps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import helper.constante;

@RunWith(SerenityRunner.class)
public class RejectAssignedToOthersTest 
{

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LogInSteps logInSteps;
    
    @Steps
    public AssignedToOthersSteps assignedToOthersSteps;

    
    @Test
    public void approveRequestTest() {
    	logInSteps.login(constante.USERDM, constante.PASSDM);
    	assignedToOthersSteps.GoToInbox();
    	assignedToOthersSteps.GotoAssignedToOthersTab();
    	assignedToOthersSteps.checklist();
    	assignedToOthersSteps.reject();
    	assignedToOthersSteps.verifymessage();
    
    }
     
  
    
}  
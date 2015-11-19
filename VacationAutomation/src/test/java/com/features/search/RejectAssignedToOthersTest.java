package com.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
//import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
//import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.ApproveRequestSteps;
import com.steps.serenity.AssignedToOthersSteps;
import com.steps.serenity.EndUserSteps;
//import com.steps.serenity.EndUserSteps;
import com.steps.serenity.LogInSteps;

import Helper.constante;

@RunWith(SerenityRunner.class)
public class RejectAssignedToOthersTest 
{

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LogInSteps logInSteps;
    
    @Steps
    public AssignedToOthersSteps AssignedToOthersSteps;
  
    @Test
    public void approveRequestTest() {
    	logInSteps.login(constante.USERDM, constante.PASSDM);
    	AssignedToOthersSteps.GoToInbox();
    	AssignedToOthersSteps.GotoAssignedToOthersTab();
    	AssignedToOthersSteps.checklist();
    	AssignedToOthersSteps.reject();
    	AssignedToOthersSteps.verifymessage();
    	
    }
     
  
    
}  
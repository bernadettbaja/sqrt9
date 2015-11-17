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
import com.steps.serenity.EndUserSteps;
//import com.steps.serenity.EndUserSteps;
import com.steps.serenity.LogInSteps;

@RunWith(SerenityRunner.class)
public class ApproveRequestTest 
{

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LogInSteps logInSteps;
    
    @Steps
    public ApproveRequestSteps approveRequestSteps;
  
    @Test
    public void approveRequestTest() {
    	logInSteps.login("alexandra.vlaic1", "Viking");
    	approveRequestSteps.GoToInbox();
    	approveRequestSteps.checklist();
    	approveRequestSteps.approve();
    	approveRequestSteps.verifymessage();
    }
     
  
    
}     

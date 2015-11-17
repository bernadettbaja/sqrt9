package com.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
//import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
//import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import com.steps.serenity.EndUserSteps;
//import com.steps.serenity.EndUserSteps;
import com.steps.serenity.LogInSteps;

@RunWith(SerenityRunner.class)
public class approve_request {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LogInSteps logInSteps;
 

  
    @Test
    public void approve_request() {
    	logInSteps.login("alexandra.vlaic1", "Viking");
        logInSteps.GoToInbox();
        logInSteps.checklist();
        logInSteps.approve();
    }
     
    
}     

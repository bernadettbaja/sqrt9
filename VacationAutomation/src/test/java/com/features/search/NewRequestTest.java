package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.LogInSteps;
import com.steps.serenity.NewVacationRequestSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class NewRequestTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LogInSteps logInSteps;
   
    @Steps
    public NewVacationRequestSteps newVacationRequestSteps;

    @Test
    public void new_simple_request() 
    {
    	logInSteps.login("bernadett.baja1", "testing");
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(17, "Nov", 2015);
    	newVacationRequestSteps.selectEndDate(18, "Nov", 2015);
    }
} 
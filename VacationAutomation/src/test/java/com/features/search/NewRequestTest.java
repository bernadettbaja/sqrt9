package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.pages.VacationOptionsPage;
import com.pages.VacationTracker;
import com.steps.serenity.LogInSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class NewRequestTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LogInSteps logInSteps;
    public VacationOptionsPage obj;
    public VacationTracker vacTrack;

    @Test
    public void new_simple_request() 
    {
    	logInSteps.login("bernadett.baja1", "testing");
    	obj.create_page_trackVacationTracker();
    	vacTrack.verifica();
    	
    }

} 
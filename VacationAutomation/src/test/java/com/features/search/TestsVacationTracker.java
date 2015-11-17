package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.pages.LogInPage;
import com.pages.VacationOptionsPage;
import com.pages.VacationTracker;
import com.steps.serenity.LogInSteps;
import com.steps.serenity.VacationTrackerSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class TestsVacationTracker 
{
	@Managed(uniqueSession = true)
    public WebDriver webdriver;
	private VacationTrackerSteps vacationTrackerSteps; 
	private LogInSteps logInSteps;
	
	
    @Test
    public void new_simple_request() 
    {
    	logInSteps.login("tudor.butiri1", "evoportal");
    	vacationTrackerSteps.enter_track_vacation_tracker();
    	vacationTrackerSteps.insert_startDate_endDate();;
    	vacationTrackerSteps.insert_building_department();
    	vacationTrackerSteps.apply_selection();
    }
}

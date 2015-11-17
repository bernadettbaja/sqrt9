package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.LogInSteps;
import com.steps.serenity.VacationTrackerSteps;

import Helper.constante;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class TestsVacationTracker 
{
	@Managed(uniqueSession = true)
    public WebDriver webdriver;
	
	@Steps
	public VacationTrackerSteps vacationTrackerSteps;
	
	@Steps
	public LogInSteps logInSteps;
	
	
    @Test
    public void new_simple_request() throws InterruptedException 
    {
    	logInSteps.login(constante.USERPM, constante.PASSPM);
    	vacationTrackerSteps.enter_track_vacation_tracker();
    	int day = 16;
    	String month = "dec";
    	int year = 2014;
    	vacationTrackerSteps.insert_startDate(day, month, year);
    	vacationTrackerSteps.insert_building_department();
    	vacationTrackerSteps.apply_selection();
    }
}

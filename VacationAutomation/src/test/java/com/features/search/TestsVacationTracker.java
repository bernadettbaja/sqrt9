package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.LogInSteps;
import com.steps.serenity.VacationTrackerSteps;

import Helper.Dates;
import Helper.constante;
import Helper.departments;
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
    	vacationTrackerSteps.insert_StartDate(Dates.STARTDAY_PM, Dates.STARTMONTH_PM, Dates.STARTYEAR_PM);    	
    	vacationTrackerSteps.insert_EndDate(Dates.ENDDAY_PM, Dates.ENDMONTH_PM, Dates.ENDYEAR_PM);
    	vacationTrackerSteps.insert_building(departments.building);
    	vacationTrackerSteps.insert_department(departments.departament);
    	vacationTrackerSteps.apply_selection();
    	
    }
}

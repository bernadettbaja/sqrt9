package com.steps.serenity;

import com.pages.VacationOptionsPage;
import com.pages.VacationTracker;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class VacationTrackerSteps extends ScenarioSteps
{
	@Steps
    public LogInSteps logInSteps;
    public VacationOptionsPage vacationOptionsPage;
    public VacationTracker vacationTracker;
    
    
	@Step
    public void login(String user, String pass) 
	{
    	logInSteps.login(user, pass);
    }
	
	@Step
	public void enter_track_vacation_tracker()
	{
		vacationOptionsPage.create_page_trackVacationTracker();
	}
	
	@Step
	public void insert_startDate(int day, String month, int year) throws InterruptedException	
	{
		vacationTracker.apasa_pentru_calendar();
		vacationTracker.setDate(year, month, year);
	}
	
	@Step
	public void insert_building_department()
	{
		
	}
	
	public void apply_selection()
	{
		
	}
}

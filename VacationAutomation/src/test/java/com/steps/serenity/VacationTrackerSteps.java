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
	public void insert_startDate_endDate()
	{
		
	}
	
	@Step
	public void insert_building_department()
	{
		
	}
	
	public void apply_selection()
	{
		
	}
}

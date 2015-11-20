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
	public void insert_StartDate (int day, String month, int year) throws InterruptedException	
	{
		vacationTracker.setStartDate(day, month, year);
	}
	
	@Step
	public void insert_EndDate (int day, String month, int year) throws InterruptedException
	{
		vacationTracker.setEndDate(day, month, year);
	}
	
	@Step
	public void insert_building(String building)
	{
		vacationTracker.setBuilding(building);
	}
	
	@Step
	public void insert_department(String department)
	{
		vacationTracker.setDepartment(department);
	}
	
	@Step
	public void apply_selection()
	{
		vacationTracker.applyChanges();
	}
	
	@Step
	public void check_department_and_building_in_list(String building, String department)
	{
		vacationTracker.check_dep_and_building_in_first_page(building, department);
	}
	
	@Step
	public void check_if_list_is_empty(String building, String department)
	{
		vacationTracker.check_list_empty(building, department);
	}
	
	@Step
	public void check_department_and_building_in_all_list(String building, String department)
	{
		vacationTracker.check_dep_and_building_in_all_list(building, department);
	}
	
	@Step
	public void checkQaDepartmentBuildingDeltaNoEntry(String building, String department, String noVacationMess)
	{
		vacationTracker.checkQaDepDeltaBuildNotInList(building,  department, noVacationMess);
	}
	
}

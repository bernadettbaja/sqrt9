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
	public void enterTrackVacationTracker()
	{
		vacationOptionsPage.enterPageTrackVacationTracker();
	}
	
	@Step
	public void insertStartDate (int day, String month, int year) throws InterruptedException	
	{
		vacationTracker.setStartDate(day, month, year);
	}
	
	@Step
	public void insertEndDate (int day, String month, int year) throws InterruptedException
	{
		vacationTracker.setEndDate(day, month, year);
	}
	
	@Step
	public void insertBuilding(String building)
	{
		vacationTracker.setBuilding(building);
	}
	
	@Step
	public void insertDepartment(String department)
	{
		vacationTracker.setDepartment(department);
	}
	
	@Step
	public void applySelection()
	{
		vacationTracker.applyChanges();
	}
	
	@Step
	public void checkDepartmentAndBuildingInFirstPage(String building, String department)
	{
		vacationTracker.checkDepAndBuildInFirstPage(building, department);
	}
	
	@Step
	public void checkIfListIsEmpty(String building, String department)
	{
		vacationTracker.checkListEmpty(building, department);
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

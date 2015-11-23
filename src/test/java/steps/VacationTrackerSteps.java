package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import pages.VacationOptionsPage;
import pages.VacationTrackerPage;

public class VacationTrackerSteps extends ScenarioSteps
{
	@Steps
    public LogInSteps logInSteps;
    public VacationOptionsPage vacationOptionsPage;
    public VacationTrackerPage vacationTracker;
    
    
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
	public void checkDepartmentAndBuildingInAllList(String building, String department)
	{
		vacationTracker.checkDepartBuildingInAllList(building, department);
	}
	
	@Step
	public void checkQaDepartmentBuildingDeltaNoEntry(String building, String department, String noVacationMess)
	{
		vacationTracker.checkQaDepDeltaBuildNotInList(building, department, noVacationMess);
	}
	
	@Step
	public void checkNumberOfRowsModification(String building, String department)
	{
		vacationTracker.checkChangeInNumberOfRows(building, department);
	}
	
}

package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import helper.Dates;
import helper.Constante;
import helper.Departments;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import pages.DatePickerPage;
import steps.LogInSteps;
import steps.VacationTrackerSteps;

@RunWith(SerenityRunner.class)
public class VacationTrackerTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public VacationTrackerSteps vacationTrackerSteps;
	public DatePickerPage setDates;

	@Steps
	public LogInSteps logInSteps;

	@Test
	public void checkWebDepartmentBuildingMainTestInFirstPage() throws InterruptedException 
	{
		logInSteps.login(Constante.USERPM, Constante.PASSPM);
		vacationTrackerSteps.enterTrackVacationTracker();
		setDates.setDate(Dates.STARTDAY_PM_WEB, Dates.STARTMONTH_PM_WEB, Dates.STARTYEAR_PM_WEB);
		setDates.setDate(Dates.ENDDAY_PM_WEB, Dates.ENDMONTH_PM_WEB, Dates.ENDYEAR_PM_WEB);
		vacationTrackerSteps.insertBuilding(Departments.BUILDING_MAIN);
		vacationTrackerSteps.insertDepartment(Departments.DEPARTMENT_WEB);
		vacationTrackerSteps.applySelection();
		vacationTrackerSteps.checkDepartmentAndBuildingInFirstPage(Departments.BUILDING_MAIN, Departments.DEPARTMENT_WEB);
		webdriver.close();
	}
//
//	@Test
//	public void checkQaDepartmentAndBuildingDeltaInFirstPage() throws InterruptedException 
//	{
//		logInSteps.login(Constante.USERPM, Constante.PASSPM);
//		vacationTrackerSteps.enterTrackVacationTracker();
//		vacationTrackerSteps.insertStartDate(Dates.STARTDAY_PM_QA, Dates.STARTMONTH_PM_QA, Dates.STARTYEAR_PM_QA);
//		vacationTrackerSteps.insertEndDate(Dates.ENDDAY_PM_QA, Dates.ENDMONTH_PM_QA, Dates.ENDYEAR_PM_WEB);
//		vacationTrackerSteps.insertBuilding(Departments.BUILDING_DELTA);
//		vacationTrackerSteps.insertDepartment(Departments.DEPARTMENT_QA);
//		vacationTrackerSteps.applySelection();
//		vacationTrackerSteps.checkDepartmentAndBuildingInFirstPage(Departments.BUILDING_DELTA, Departments.DEPARTMENT_QA);
//		webdriver.close();
//	}
//	
//	@Test
//	public void checkWebDepartmentAndBuildingMainStartDateAfterEndDate() throws InterruptedException 
//	{
//		logInSteps.login(Constante.USERPM, Constante.PASSPM);
//		vacationTrackerSteps.enterTrackVacationTracker();
//		vacationTrackerSteps.insertStartDate(Dates.STARTDAY_PM_WEB_NEG, Dates.STARTMONTH_PM_WEB_NEG, Dates.STARTYEAR_PM_WEB_NEG);
//		vacationTrackerSteps.insertEndDate(Dates.ENDDAY_PM_WEB_NEG, Dates.ENDMONTH_PM_WEB_NEG, Dates.ENDYEAR_PM_WEB_NEG);
//		vacationTrackerSteps.insertBuilding(Departments.BUILDING_MAIN);
//		vacationTrackerSteps.insertDepartment(Departments.DEPARTMENT_WEB);
//		vacationTrackerSteps.applySelection();
//		vacationTrackerSteps.checkIfListIsEmpty(Departments.BUILDING_MAIN, Departments.DEPARTMENT_WEB);
//		webdriver.close();
//	}
//	
//	@Test
//	public void checkWebDepBuildingMainSearchAllPages() throws InterruptedException
//	{
//		logInSteps.login(Constante.USERPM, Constante.PASSPM);
//		vacationTrackerSteps.enterTrackVacationTracker();
//		vacationTrackerSteps.insertStartDate(Dates.STARTDAY_PM_WEB_PAGE, Dates.STARTMONTH_PM_WEB_PAGE, Dates.STARTYEAR_PM_WEB_PAGE);
//		vacationTrackerSteps.insertEndDate(Dates.ENDDAY_PM_WEB_PAGE, Dates.ENDMONTH_PM_WEB_PAGE, Dates.ENDYEAR_PM_WEB_PAGE);
//		vacationTrackerSteps.insertBuilding(Departments.BUILDING_MAIN);
//		vacationTrackerSteps.insertDepartment(Departments.DEPARTMENT_WEB);
//		vacationTrackerSteps.applySelection();
//		vacationTrackerSteps.checkDepartmentAndBuildingInAllList(Departments.BUILDING_MAIN, Departments.DEPARTMENT_WEB);
//		webdriver.close();
//	}	
//	
//	@Test
//	public void checkQaDepartmentMainBuildingNoVacation() throws InterruptedException 
//	{
//		logInSteps.login(Constante.USERPM, Constante.PASSPM);
//		vacationTrackerSteps.enterTrackVacationTracker();
//		vacationTrackerSteps.insertStartDate(Dates.STARTDAY_PM_WEB, Dates.STARTMONTH_PM_WEB, Dates.STARTYEAR_PM_WEB);
//		vacationTrackerSteps.insertEndDate(Dates.ENDDAY_PM_WEB, Dates.ENDMONTH_PM_WEB, Dates.ENDYEAR_PM_WEB);
//		vacationTrackerSteps.insertBuilding(Departments.BUILDING_DELTA);
//		vacationTrackerSteps.insertDepartment(Departments.DEPARTMENT_QA);
//		vacationTrackerSteps.applySelection();
//		vacationTrackerSteps.checkQaDepartmentBuildingDeltaNoEntry(Departments.BUILDING_DELTA, Departments.BUILDING_DELTA, Constante.NOVACATIONMESS);
//		webdriver.close();
//	}
//	
//	@Test
//	public void checkChangeNumberOfRows() throws InterruptedException
//	{
//		logInSteps.login(Constante.USERPM, Constante.PASSPM);
//		vacationTrackerSteps.enterTrackVacationTracker();
//		vacationTrackerSteps.insertStartDate(Dates.STARTDAY_PM_WEB, Dates.STARTMONTH_PM_WEB, Dates.STARTYEAR_PM_WEB);
//		vacationTrackerSteps.insertEndDate(Dates.ENDDAY_PM_WEB_PAGE, Dates.ENDMONTH_PM_WEB_PAGE, Dates.ENDYEAR_PM_WEB_PAGE);
//		vacationTrackerSteps.insertBuilding(Departments.BUILDING_MAIN);
//		vacationTrackerSteps.insertDepartment(Departments.DEPARTMENT_WEB);
//		vacationTrackerSteps.applySelection();
//		vacationTrackerSteps.checkNumberOfRowsModification(Departments.BUILDING_MAIN, Constante.NoRows);
//		webdriver.close();
//	}
}

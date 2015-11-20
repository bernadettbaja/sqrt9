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
public class TestsVacationTracker {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public VacationTrackerSteps vacationTrackerSteps;

	@Steps
	public LogInSteps logInSteps;

	@Test
	public void checkWebDepartmentBuildingMainTest() throws InterruptedException 
	{
		logInSteps.login(constante.USERPM, constante.PASSPM);
		vacationTrackerSteps.enterTrackVacationTracker();
		vacationTrackerSteps.insertStartDate(Dates.STARTDAY_PM_WEB, Dates.STARTMONTH_PM_WEB, Dates.STARTYEAR_PM_WEB);
		vacationTrackerSteps.insertEndDate(Dates.ENDDAY_PM_WEB, Dates.ENDMONTH_PM_WEB, Dates.ENDYEAR_PM_WEB);
		vacationTrackerSteps.insert_building(departments.BUILDING_MAIN);
		vacationTrackerSteps.insert_department(departments.DEPARTMENT_WEB);
		vacationTrackerSteps.apply_selection();
		vacationTrackerSteps.check_department_and_building_in_list(departments.BUILDING_MAIN, departments.DEPARTMENT_WEB);
		webdriver.close();
	}

	@Test
	public void check_if_QaDepartment_and_BuildingDelta_are_in_list() throws InterruptedException 
	{
		logInSteps.login(constante.USERPM, constante.PASSPM);
		vacationTrackerSteps.enterTrackVacationTracker();
		vacationTrackerSteps.insertStartDate(Dates.STARTDAY_PM_QA, Dates.STARTMONTH_PM_QA, Dates.STARTYEAR_PM_QA);
		vacationTrackerSteps.insertEndDate(Dates.ENDDAY_PM_QA, Dates.ENDMONTH_PM_QA, Dates.ENDYEAR_PM_WEB);
		vacationTrackerSteps.insert_building(departments.BUILDING_DELTA);
		vacationTrackerSteps.insert_department(departments.DEPARTMENT_QA);
		vacationTrackerSteps.apply_selection();
		vacationTrackerSteps.check_department_and_building_in_list(departments.BUILDING_DELTA, departments.DEPARTMENT_QA);
		webdriver.close();
	}
	
	@Test
	public void check_if_WebDep_BuildingMain_startDate_afterEndDate() throws InterruptedException 
	{
		logInSteps.login(constante.USERPM, constante.PASSPM);
		vacationTrackerSteps.enterTrackVacationTracker();
		vacationTrackerSteps.insertStartDate(Dates.STARTDAY_PM_WEB_NEG, Dates.STARTMONTH_PM_WEB_NEG, Dates.STARTYEAR_PM_WEB_NEG);
		vacationTrackerSteps.insert_EndDate(Dates.ENDDAY_PM_WEB_NEG, Dates.ENDMONTH_PM_WEB_NEG, Dates.ENDYEAR_PM_WEB_NEG);
		vacationTrackerSteps.insert_building(departments.BUILDING_MAIN);
		vacationTrackerSteps.insert_department(departments.DEPARTMENT_WEB);
		vacationTrackerSteps.apply_selection();
		vacationTrackerSteps.check_if_list_is_empty(departments.BUILDING_MAIN, departments.DEPARTMENT_WEB);
		webdriver.close();
	}
	
	@Test
	public void check_WebDep_BuildingMain_all_pages() throws InterruptedException
	{
		logInSteps.login(constante.USERPM, constante.PASSPM);
		vacationTrackerSteps.enter_track_vacation_tracker();
		vacationTrackerSteps.insert_StartDate(Dates.STARTDAY_PM_WEB_PAGE, Dates.STARTMONTH_PM_WEB_PAGE, Dates.STARTYEAR_PM_WEB_PAGE);
		vacationTrackerSteps.insert_EndDate(Dates.ENDDAY_PM_WEB_PAGE, Dates.ENDMONTH_PM_WEB_PAGE, Dates.ENDYEAR_PM_WEB_PAGE);
		vacationTrackerSteps.insert_building(departments.BUILDING_MAIN);
		vacationTrackerSteps.insert_department(departments.DEPARTMENT_WEB);
		vacationTrackerSteps.apply_selection();
		vacationTrackerSteps.check_department_and_building_in_all_list(departments.BUILDING_MAIN, departments.DEPARTMENT_WEB);
		webdriver.close();
	}	
	
	@Test
	public void checkQaDepartmentMainBuildingNoVacation() throws InterruptedException 
	{
		logInSteps.login(constante.USERPM, constante.PASSPM);
		vacationTrackerSteps.enter_track_vacation_tracker();
		vacationTrackerSteps.insert_StartDate(Dates.STARTDAY_PM_WEB, Dates.STARTMONTH_PM_WEB, Dates.STARTYEAR_PM_WEB);
		vacationTrackerSteps.insert_EndDate(Dates.ENDDAY_PM_WEB, Dates.ENDMONTH_PM_WEB, Dates.ENDYEAR_PM_WEB);
		vacationTrackerSteps.insert_building(departments.BUILDING_DELTA);
		vacationTrackerSteps.insert_department(departments.DEPARTMENT_QA);
		vacationTrackerSteps.apply_selection();
		vacationTrackerSteps.checkQaDepartmentBuildingDeltaNoEntry(departments.BUILDING_DELTA, departments.BUILDING_DELTA, constante.NOVACATIONMESS);
		webdriver.close();
	}
}

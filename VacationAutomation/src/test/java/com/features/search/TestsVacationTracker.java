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

//	@Test
//	public void check_WebDep_BuildingMain() throws InterruptedException 
//	{
//		logInSteps.login(constante.USERPM, constante.PASSPM);
//		vacationTrackerSteps.enter_track_vacation_tracker();
//		vacationTrackerSteps.insert_StartDate(Dates.STARTDAY_PM_WEB, Dates.STARTMONTH_PM_WEB, Dates.STARTYEAR_PM_WEB);
//		vacationTrackerSteps.insert_EndDate(Dates.ENDDAY_PM_WEB, Dates.ENDMONTH_PM_WEB, Dates.ENDYEAR_PM_WEB);
//		vacationTrackerSteps.insert_building(departments.building_main);
//		vacationTrackerSteps.insert_department(departments.departament_web);
//		vacationTrackerSteps.apply_selection();
//		vacationTrackerSteps.check_departmnet_and_building(departments.building_main, departments.departament_web);
//		webdriver.close();
//	}
//
//	@Test
//	public void check_QaDep_BuildingDelta() throws InterruptedException 
//	{
//		logInSteps.login(constante.USERPM, constante.PASSPM);
//		vacationTrackerSteps.enter_track_vacation_tracker();
//		vacationTrackerSteps.insert_StartDate(Dates.STARTDAY_PM_QA, Dates.STARTMONTH_PM_QA, Dates.STARTYEAR_PM_QA);
//		vacationTrackerSteps.insert_EndDate(Dates.ENDDAY_PM_QA, Dates.ENDMONTH_PM_QA, Dates.ENDYEAR_PM_WEB);
//		vacationTrackerSteps.insert_building(departments.building_delta);
//		vacationTrackerSteps.insert_department(departments.departament_qa);
//		vacationTrackerSteps.apply_selection();
//		vacationTrackerSteps.check_departmnet_and_building(departments.building_delta, departments.departament_qa);
//		webdriver.close();
//	}
//	
//	@Test
//	public void check_WebDep_BuildingMain_startDate_afterEndDate() throws InterruptedException 
//	{
//		logInSteps.login(constante.USERPM, constante.PASSPM);
//		vacationTrackerSteps.enter_track_vacation_tracker();
//		vacationTrackerSteps.insert_StartDate(Dates.STARTDAY_PM_WEB_NEG, Dates.STARTMONTH_PM_WEB_NEG, Dates.STARTYEAR_PM_WEB_NEG);
//		vacationTrackerSteps.insert_EndDate(Dates.ENDDAY_PM_WEB_NEG, Dates.ENDMONTH_PM_WEB_NEG, Dates.ENDYEAR_PM_WEB_NEG);
//		vacationTrackerSteps.insert_building(departments.building_main);
//		vacationTrackerSteps.insert_department(departments.departament_web);
//		vacationTrackerSteps.apply_selection();
//		vacationTrackerSteps.check_if_list_is_empty();
//		webdriver.close();
//	}
	
	@Test
	public void check_WebDep_BuildingMain_all_pages() throws InterruptedException
	{
		logInSteps.login(constante.USERPM, constante.PASSPM);
		vacationTrackerSteps.enter_track_vacation_tracker();
		vacationTrackerSteps.insert_StartDate(Dates.STARTDAY_PM_WEB, Dates.STARTMONTH_PM_WEB, Dates.STARTYEAR_PM_WEB);
		vacationTrackerSteps.insert_EndDate(Dates.ENDDAY_PM_WEB, Dates.ENDMONTH_PM_WEB, Dates.ENDYEAR_PM_WEB);
		vacationTrackerSteps.insert_building(departments.building_main);
		vacationTrackerSteps.insert_department(departments.departament_web);
		vacationTrackerSteps.apply_selection();
		vacationTrackerSteps.check_departmnet_and_building(departments.building_main, departments.departament_web);
		webdriver.close();
	}

	
}

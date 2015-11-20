package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.ApproveRequestSteps;
import com.steps.serenity.LogInSteps;
import com.steps.serenity.VacationsReportSteps;

import Helper.constante;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class VacationReportTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LogInSteps logInSteps;

	@Steps
	public ApproveRequestSteps approveRequestSteps;
	
	@Steps
	public VacationsReportSteps vacationsReportSteps ;

	@Test
	public void approveRequestTest() {
		logInSteps.login(constante.USERDM, constante.PASSDM);
		vacationsReportSteps.clickVacationReport();
		vacationsReportSteps.selectMonth("May");
		vacationsReportSteps.selectYear("2014");
		vacationsReportSteps.selectPending();
		vacationsReportSteps.selectExport();
		
	}

}

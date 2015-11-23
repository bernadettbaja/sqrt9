package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import helper.constante;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.ApproveRequestSteps;
import steps.LogInSteps;
import steps.VacationsReportSteps;

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

package com.steps.serenity;

import com.pages.InboxPage;
import com.pages.VacationOptionsPage;
import com.pages.VacationsReportPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class VacationsReportSteps extends ScenarioSteps {
	private static final long serialVersionUID = -4731298978265942640L;

	VacationOptionsPage vacationOptionPage;
	InboxPage InboxPage;
	VacationsReportPage vacationsReportPage;

	@Step
	public void selectMonth(String month) {
		vacationsReportPage.selectMonth(month);
	}

	@Step
	public void clickVacationReport() {
		vacationsReportPage.clickVacationReport();
	}

	public void selectYear(String year) {
		vacationsReportPage.setYear(year);
		
	}
	@Step
	public void selectPending(){
		vacationsReportPage.clickPending();
	}
	
	@Step
	public void selectExport(){
	vacationsReportPage.clickExport();

	}
}
package com.steps.serenity;

import com.pages.InboxPage;
import com.pages.VacationOptionsPage;
import com.pages.VacationsReportPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class VacationsReportSteps extends ScenarioSteps {
	private static final long serialVersionUID = -4731298978265942640L;

	VacationOptionsPage obj;
	VacationOptionsPage vacationOptionPage;

	InboxPage InboxPage;
	VacationsReportPage vacationsReportPage;

//	@Step
//	public void selectMont(String montName) {
//		vacationsReportPage.setMonth(montName);
//	}
//	
//	@Step
//	public void selectYear(String year) {
//		vacationsReportPage.setMonth(year);
//	}
	
	@Step
	public void selectMonth(String month) {
		vacationsReportPage.selectMonth(month);
	}

	@Step
	public void clicVacationReport() {
		vacationsReportPage.clicVacationReport();
	}

	public void selectYear(String year) {
		vacationsReportPage.setYear(year);
		
	}

}
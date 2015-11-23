package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.DatePickerBernadettPage;
import pages.NewVacationRequestPage;
import pages.VacationOptionsPage;

public class NewVacationRequestSteps extends ScenarioSteps {

	NewVacationRequestPage newVacationRequestPage;
	VacationOptionsPage vacationOptionsPage;
	DatePickerBernadettPage datePickerBernadettPage;

	@Step
	public void selectStartDate(int day, String month, int year) {
		newVacationRequestPage.click_startDate();
		datePickerBernadettPage.setDate(day, month, year);
	}

	@Step
	public void clickNewVacationRequestFromTheLeftMenu() {
		vacationOptionsPage.createPageNewVacationRequest();
	}

	@Step
	public void selectEndDate(int day, String month, int year) {
		newVacationRequestPage.click_endDate();
		datePickerBernadettPage.setDate(day, month, year);
		
	}
	
	@Step
	public void selectHoliday() {
		newVacationRequestPage.clickOnHoliday();
	}
	
	@Step
	public void selectVacationWithoutPayment() {
		newVacationRequestPage.clickOnVacationWithoutPayment();
	}
	
	@Step
	public void selectSickleave() {
		newVacationRequestPage.clickOnSickleave();
		
	}
	@Step
	public void selectSpecialvacation() {
		newVacationRequestPage.clickOnSpecialVacation();
		
	}
	
	@Step
	public void selectMaternityleave() {
		newVacationRequestPage.clickOnMaternityleave();
	}
	
	@Step
	public void selectMaternityLeaveOption() {
		newVacationRequestPage.selectMaternityLeaveOption();
	}
	
	@Step
	public void clickAddComment() {
		newVacationRequestPage.clickAddComment();
	}
	
	@Step
	public void typeComment(String textComment) {
		newVacationRequestPage.typeComment(textComment);
	}
	
	@Step
	public void clickSaveButton() {
		newVacationRequestPage.clickSaveButton();
	}
}
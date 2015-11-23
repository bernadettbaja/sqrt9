package pages;

import helper.constante;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(constante.BASEURL + "/vacation")
public class NewVacationRequestPage extends PageObject {
	@FindBy(css = "input[name='startDate']")
	private WebElementFacade startDate;

	@FindBy(css = "input[name='endDate']")
	private WebElementFacade endDate;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_type_CO']")
	private WebElementFacade holiday;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_type_CF']")
	private WebElementFacade vacationwithoutpayment;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_type_CM']")
	private WebElementFacade sickleave;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_type_CS']")
	private WebElementFacade specialvacation;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_type_ML']")
	private WebElementFacade maternityleave;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_maternityLeave")
	private WebElementFacade maternityleaveDropdown;
	
	@FindBy(css = "div#_evovacation_WAR_EvoVacationportlet_newVacationComment")
	private WebElementFacade addcomment;
	
	@FindBy(css="textarea[name='commentContent']")
	private WebElementFacade textArea;
	
	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_saveButton")
	private WebElementFacade saveButton;


	public void click_startDate() {
		element(startDate).waitUntilVisible();
		startDate.click();
	}

	public void click_endDate() {
		endDate.click();
	}

	public void clickOnHoliday() {
		holiday.click();

	}

	public void clickOnVacationWithoutPayment() {
		vacationwithoutpayment.click();

	}

	public void clickOnSickleave() {
		sickleave.click();
	}

	public void clickOnSpecialVacation() {
		specialvacation.click();
	}

	public void clickOnMaternityleave() {
		maternityleave.click();
	}

	public void selectMaternityLeaveOption() {
		maternityleaveDropdown.selectByValue("MATERNITY_SICK_LEAVE");
	}
	
	public void clickAddComment() {
		addcomment.click();
	}
	
	public void typeComment(String textComent){
		textArea.type(textComent);
	}
	
	public void clickSaveButton() {
		saveButton.click();
		
	}
}

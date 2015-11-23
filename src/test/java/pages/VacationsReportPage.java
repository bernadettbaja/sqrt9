package pages;

import helper.Constante;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(Constante.BASEURL + "/vacation")
public class VacationsReportPage extends PageObject {
	//	private WebDriver driver;

	@FindBy(css = "a[href*='vacation-report']")
	private WebElementFacade VacationsReport;

	@FindBy(css = "select#_evovacation_WAR_EvoVacationportlet_exportMonth")
	private WebElementFacade selectMonth;

	@FindBy(css = "select#_evovacation_WAR_EvoVacationportlet_exportYear")
	private WebElementFacade selectYear;

	@FindBy(css = "label[for='_evovacation_WAR_EvoVacationportlet_pending']")
	private WebElementFacade selectPending;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_CIM']")
	private WebElementFacade SelectCIM;

	@FindBy(css="input[id='_evovacation_WAR_EvoVacationportlet_exportButton']")
	private WebElementFacade export;

	
	public void setYear(String year) {
		element(selectYear).waitUntilVisible();
		selectYear.click();
		selectYear.click();
		selectYear.selectByVisibleText(year);
		waitABit(5000);
	}
	
	
	public void selectMonth(String month){
		selectMonth.click();
		selectMonth.click();
		selectMonth.selectByVisibleText(month);
	}
	

	public void clickVacationReport() {
		element(VacationsReport).waitUntilVisible();
		VacationsReport.click();
	}
	
	
	public void clickPending(){
		selectPending.click();
	}
	
	
	public void clickExport(){
		export.click();
		waitABit(7000);
	}
}
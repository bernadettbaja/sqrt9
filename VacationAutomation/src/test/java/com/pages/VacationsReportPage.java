package com.pages;

import Helper.constante;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(constante.BASEURL + "/vacation")
public class VacationsReportPage extends PageObject {
	//	private WebDriver driver;

	@FindBy(css = "a[href*='vacation-report']")
	private WebElementFacade VacationsReport;

	//	@FindBy(css = "select#_evovacation_WAR_EvoVacationportlet_exportMonth")
	//	private WebElementFacade selectMonth;

	//@FindBy(css = "div.aui-datepicker-focused select.aui-datepicker-month")
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

	// public void setMonth(String month) {
	// element(selectMonth).waitUntilVisible();
	// selectMonth.selectByVisibleText(month);
	// }
	//
	public void setYear(String year) {
		element(selectYear).waitUntilVisible();
		
		selectYear.click();
		selectYear.click();
		selectYear.selectByVisibleText(year);
		waitABit(5000);
	}

	//	public void selectMonth(String month) {
	//		Select dropdown = new Select(driver.findElement(By.id("_evovacation_WAR_EvoVacationportlet_exportMonth")));
	//		dropdown.selectByVisibleText("May");
	//	}

	public void selectMonth(String month){
		//		element(selectMonth).waitUntilVisible();
		
		selectMonth.click();
		selectMonth.click();
		//waitABit(1000);
		selectMonth.selectByVisibleText(month);
		//selectMonth.selectByVisibleText(month);
		//waitABit(1000);
		
		/*List<WebElement> monthList = selectMonth.findElements(By.cssSelector("option"));
		for(WebElement monthElement:monthList){
			System.out.println("element: "+monthElement.getText());
			if(monthElement.getText().contains(month)){
				monthElement.click();
			}
		}*/
	}

	public void clicVacationReport() {
		element(VacationsReport).waitUntilVisible();
		VacationsReport.click();
	}
	public void clicPending(){
		selectPending.click();
	}
	
	public void clicExport(){
		export.click();
		waitABit(7000);
	}
}
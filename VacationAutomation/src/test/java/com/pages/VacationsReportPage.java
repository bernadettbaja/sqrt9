package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;

@DefaultUrl("http://172.22.4.88:9090/vacation")
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

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_approved']")
	private WebElementFacade SelectApproved;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_CIM']")
	private WebElementFacade SelectCIM;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_exportButton']")
	private WebElementFacade Export;

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

}
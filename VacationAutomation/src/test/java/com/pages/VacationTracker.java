package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://172.22.4.88:9090/vacation?p_p_id=evovacation_WAR_EvoVacationportlet&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_evovacation_WAR_EvoVacationportlet_backURL=%2Fvacation%3Fp_p_id%3Devovacation_WAR_EvoVacationportlet%26p_p_lifecycle%3D0%26p_p_state%3Dnormal%26p_p_mode%3Dview%26p_p_col_id%3Dcolumn-1%26p_p_col_count%3D1%26_evovacation_WAR_EvoVacationportlet_backURL%3D%252Fvacation%253Fp_p_id%253Devovacation_WAR_EvoVacationportlet%2526p_p_lifecycle%253D0%2526p_p_state%253Dnormal%2526p_p_mode%253Dview%2526p_p_col_id%253Dcolumn-1%2526p_p_col_count%253D1%2526_evovacation_WAR_EvoVacationportlet_backURL%253D%25252Fvacation%2526_evovacation_WAR_EvoVacationportlet_menuItem%253Dnew-request%26_evovacation_WAR_EvoVacationportlet_menuItem%3Dnew-request&_evovacation_WAR_EvoVacationportlet_menuItem=vacation-tracker")
public class VacationTracker extends PageObject {
	private WebDriver driver;

	@FindBy(name = "trackerStartDate")
	private WebElementFacade trackerStarDate;

	@FindBy(name = "trackerEndDate")
	private WebElementFacade trackerEndDate;

	@FindBy(css = "[style*='display: block'] .dp_caption")
	private WebElementFacade title;

	@FindBy(css = "[style*='display: block'] .dp_yearpicker td")
	private List<WebElementFacade> yearList;

	@FindBy(css = "[style*='display: block'] .dp_monthpicker td")
	private List<WebElementFacade> monthList;

	@FindBy(css = "[style*='display: block'] .dp_daypicker td:not([class*='disabled'])")
	private List<WebElementFacade> dayList;

	@FindBy(css = "#buildings dl dt div.hida")
	private WebElementFacade pressBuildings;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_Main BuildingCheckbox']")
	private WebElementFacade pressMainBuilding;

	@FindBy(name = "_evovacation_WAR_EvoVacationportlet_buildingsCheckbox")
	private WebElementFacade pressAllBuildings;

	@FindBy(css = "#departments dl dt div.hida")
	private WebElementFacade pressDepartments;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_departmentsALLCheckbox']")
	private WebElementFacade pressAllDepartments;
	
	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_Web DepartmentCheckbox']")
	private WebElementFacade pressWebDepartment;
	
	

	@FindBy(className = "aui-button-input")
	private WebElementFacade pressApplyButton;

	@FindBy(css = "#departments div.mutliSelect ul")
	private WebElementFacade departmentsContainer;

	public void setStartDate(int day, String month, int year) throws InterruptedException {
		trackerStarDate.click(); // It simply clicks on the StartDate calendar -
									// for the calendar to open

		// it clicks two times on title
		title.click();
		title.click();

		// select year
		for (WebElementFacade i : yearList)
			if (i.getText().contentEquals(Integer.toString(year))) {
				i.click();
				break;
			}

		// select month
		for (WebElementFacade i : monthList)
			if (i.getText().equalsIgnoreCase(month)) {
				i.click();
				break;
			}

		// select day
		for (WebElementFacade i : dayList)
			if (i.getText().contentEquals(Integer.toString(day))) {
				i.click();
				break;
			}
	}

	public void setEndDate(int day, String month, int year) throws InterruptedException {
		trackerEndDate.click(); // It simply clicks on the StartDate calendar -
								// for the calendar to open

		// it clicks two times on title
		title.click();
		title.click();

		// select year
		for (WebElementFacade i : yearList)
			if (i.getText().contentEquals(Integer.toString(year))) {
				i.click();
				break;
			}

		// select month
		for (WebElementFacade i : monthList)
			if (i.getText().equalsIgnoreCase(month)) {
				i.click();
				break;
			}

		// select day
		for (WebElementFacade i : dayList)
			if (i.getText().contentEquals(Integer.toString(day))) {
				i.click();
				break;
			}
	}

	public void setBuilding() {
		pressBuildings.click();
		pressAllBuildings.click();
		pressMainBuilding.click();
		pressBuildings.click();

	}

	 public void setDepartment()
	 {
	 //element(pressDepartments).waitUntilVisible();
	 pressDepartments.click();
	 //element(pressWebDepartment).waitUntilVisible();
	 pressAllDepartments.click();
	 pressWebDepartment.click();
	 }

//	public void setDepartment(String departmentName) {
//		element(pressDepartments).waitUntilVisible();
//		pressDepartments.click();
//		List<WebElement> departmentList = departmentsContainer.findElements(By.cssSelector("li"));
//		System.out.println("lista");
//		for (WebElement departmentElement : departmentList) {
//			System.out.println("element: " + departmentElement.getText());
//			if (departmentElement.getText().contains(departmentName)) {
//				 System.out.println(departmentElement.getText().contains(departmentName));
//				departmentElement.findElement(By.cssSelector("input")).click();
//				System.out.println(" aici = " + departmentElement.getText());
//				break;
//			}
//		}
//	}

	public void applyChanges() {
		pressApplyButton.click();
	}

}

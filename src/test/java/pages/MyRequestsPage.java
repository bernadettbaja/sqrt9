package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyRequestsPage extends PageObject {

	@FindBy(css = "a[href*='my-requests']")
	private WebElementFacade myRequests;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_futureVacationsCheckbox")
	private WebElementFacade checkShowFutureVacations;

	@FindBy(css = ".aui-column-content   column-three-content column-center-content")
	private WebElementFacade typeFilterContainer;

//	@FindBy(css = "[class='portlet-dropzone portlet-column-content portlet-column-content-only']")
//	@FindBy(css = ".aui-column-content.column-three-content.column-center-content:not(.aui-column-content-last)")
	@FindBy(css = ".filter-content")
	private WebElement filterMainContainer;

	
	public void selectFilter(String filterName){
		element(filterMainContainer).waitUntilVisible();
		List<WebElement> optionsList = filterMainContainer.findElements(By.cssSelector("span.aui-field-content"));
	
		theFor:
		for (WebElement elementNow : optionsList) {
			String labelValue = elementNow.findElement(By.tagName("label")).getText();
			if(labelValue.contains(filterName)){
				elementNow.findElement(By.cssSelector("input[type='checkbox']")).click();
				break theFor;
			}
		
		}
	
	}
	
	
	public void clickMyRequestsBtn() {
		element(myRequests).waitUntilVisible();
		myRequests.click();

	}

	public void clickShowOnlyFutureVacations() {
		element(checkShowFutureVacations).waitUntilVisible();
		checkShowFutureVacations.click();
	}

	public void selectDaysNumberFilter(String filterDays) {
		element(typeFilterContainer).waitUntilVisible();

	}
}
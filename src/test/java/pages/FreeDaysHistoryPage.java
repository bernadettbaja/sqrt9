package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class FreeDaysHistoryPage extends PageObject {

	@FindBy(css = "a[href*='free-days-history']")
	private WebElementFacade freeDayHistoryMenuBtn;

	@FindBy(css = "a[href*='free-days-history']")
	private WebElementFacade selectVacationDays;

	@FindBy(css = "div.filter-content-history div.aui-column-content-first")
	private WebElementFacade typeFilterContainer;

	@FindBy(css = "a[href*='free-days-history']")
	private WebElementFacade selectDays;

	@FindBy(css = ".filter-content-history")
	// @FindBy(css = "div[class*='aui-column-content column-three-content']")
	private WebElementFacade filterHistoryContainer;

	@FindBy(css = "a[href*='free-days-history']")
	private WebElementFacade selectOperation;

	@FindBy(css = "div[class*='aui-column  column-three  aui-column-last']")
	private WebElementFacade operationFilterContainer;
	
	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade applyButton;

	@FindBy(css="div.portlet-msg-info")
    private WebElementFacade message;


	public void clickFreeDaysHistoryMenuBtn() {
		element(freeDayHistoryMenuBtn).waitUntilVisible();
		freeDayHistoryMenuBtn.click();
	}

	public void selectTypeFilterSearch(String filterType) {
		element(typeFilterContainer).waitUntilVisible();

		List<WebElement> typeElementList = typeFilterContainer.findElements(By.cssSelector("span.aui-field-choice"));

		for (WebElement typeElement : typeElementList) {
			if (typeElement.getText().contains(filterType)) {
				WebElement inputCheck = typeElement.findElement(By.cssSelector("input.aui-field-input-choice"));
				inputCheck.click();
				waitABit(5000);
				break;
			}
		}
	}

	public void selectDaysFilterSearch(String filterDays) {
		element(filterHistoryContainer).waitUntilVisible();

		List<WebElement> daysElementList = filterHistoryContainer
				.findElements(By.cssSelector(".column-three:nth-child(2) span.aui-field-choice"));

		for (WebElement daysElement : daysElementList) {
			if (daysElement.getText().contains(filterDays)) {
				WebElement inputCheck = daysElement.findElement(By.cssSelector("input[type*='checkbox']"));
				// WebElement inputCheck =
				// daysElement.findElement(By.cssSelector("input.aui-field-input-choice"));
				inputCheck.click();
				waitABit(5000);
				break;
			}

		}
	}

	public void selectOperationFilterSearch(String filterOperation)
	{
		boolean found = false;
		element(filterHistoryContainer).waitUntilVisible();

//		List<WebElement> operationElementList = filterHistoryContainer
//				.findElements(By.cssSelector(".column-three:nth-last-child(3) span.aui-field-choice"));
		
		List<WebElement> operationElementList = filterHistoryContainer
			.findElements(By.cssSelector("div[class$='aui-column-last'] div[class='column-content'] span[class='aui-field-content']"));
		

		for (WebElement operationElement : operationElementList) {
			System.out.println("Expected: " + filterOperation);
			System.out.println("Actual: " + operationElement.getText());
			if (operationElement.getText().contains(filterOperation)) {
				System.out.println("Found IT!!!!!");
				found = true;
				WebElement inputCheck = operationElement.findElement(By.cssSelector("input[type*='checkbox']"));
				inputCheck.click();
				waitABit(5000);
				break;
			}
		}
		Assert.assertTrue("Elementul nu a fost gasit in lista", found);
	}
	
	public void clickApplyButton() {
		applyButton.click();
	}
	
    public void verifyMessage() {
        Assert.assertTrue("Wrong !!!!", message.getText().contentEquals("No history available."));
}
}


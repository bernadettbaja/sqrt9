package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.22.4.88:9090/vacation")
public class NewVacationRequestPage extends PageObject
{
	@FindBy (css = "input[name='startDate']")
	private WebElementFacade startDate;
	
	@FindBy (css = "input[name='endDate']")
	private WebElementFacade endDate;
	
	public void click_startDate() 
    {
		element(startDate).waitUntilVisible();
		startDate.click();
    }

	public void click_endDate() {
		endDate.click();
	}
	
	public void select_VacationTypeContainer () {
		
		
	}
}



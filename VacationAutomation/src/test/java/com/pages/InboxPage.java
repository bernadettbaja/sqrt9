package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.22.4.88:9090/vacation")
public class InboxPage extends PageObject {

    @FindBy(name="_evovacation_WAR_EvoVacationportlet_rowIds")
    private WebElementFacade checklist;
    
    @FindBy(css="input[id='_evovacation_WAR_EvoVacationportlet_multipleApproveButton']")
    private WebElementFacade approve;
    
    @FindBy(css="input[id='login-username']")
    private WebElementFacade reject;
    
    /*public void enter_username(String user) {
    	element(username).waitUntilVisible();
    	username.type(user);
    }*/
    
    public void click_checklist() {
    	checklist.click();
    }
    public void approve() {
    	approve.click();
    }
    public void reject() {
    	reject.click();
    }
}
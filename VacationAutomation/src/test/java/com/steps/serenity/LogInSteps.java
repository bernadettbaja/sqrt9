package com.steps.serenity;


import com.pages.LogInPage;
import com.pages.InboxPage;
import com.pages.VacationOptionsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class LogInSteps extends ScenarioSteps {
	VacationOptionsPage obj;

    LogInPage logInPage;
    
    InboxPage InboxPage;
    

    @Step
    public void login(String user, String pass) {
    	logInPage.open();
    	logInPage.enter_username(user);
    	logInPage.enter_password(pass);
    	logInPage.click_login();
    }
    
    @Step
    public void GoToInbox()
    {
    	obj.create_page_inboxVacManagement();
    }
    	
    @Step
    public void checklist() {
    	InboxPage.click_checklist();
    }
    @Step
    public void approve() {
    	InboxPage.approve();
    }
    
    @Step
    public void reject() {
    	InboxPage.reject();
    }
    
    }


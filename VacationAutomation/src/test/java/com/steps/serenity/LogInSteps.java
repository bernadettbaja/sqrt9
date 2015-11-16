package com.steps.serenity;

import com.pages.LogInPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LogInSteps extends ScenarioSteps {

    LogInPage logInPage;

    @Step
    public void login(String user, String pass) {
    	logInPage.open();
    	logInPage.enter_username(user);
    	logInPage.enter_password(pass);
    	logInPage.click_login();
    }
}
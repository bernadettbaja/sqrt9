package com.steps.serenity;

import com.pages.LogInPage;
import com.pages.InboxPage;
import com.pages.VacationOptionsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import org.junit.Assert;

public class LogInSteps extends ScenarioSteps {

	LogInPage logInPage;

	InboxPage InboxPage;

	@Step
	public void login(String user, String pass) {
		logInPage.open();
		logInPage.enter_username(user);
		logInPage.enter_password(pass);
		logInPage.click_login();
	}

}
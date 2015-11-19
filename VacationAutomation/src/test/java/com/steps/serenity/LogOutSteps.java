package com.steps.serenity;

import com.pages.LogInPage;
import com.pages.InboxPage;

import Helper.constante;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LogOutSteps extends ScenarioSteps {

	LogInPage logInPage;


	@Step
	 public void signOut() {
	  logInPage.openAt(constante.ENVURL + "/c/portal/logout");
	 }

}
package com.steps.serenity;

import com.pages.LogOutPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LogOutSteps extends ScenarioSteps {

	LogOutPage logOutPage;

	@Step
	public void clickProfilePicture(){
		logOutPage.clickUserPicture();
	}
	
	@Step
	public void signOut(){
		logOutPage.clickSignout();
	}

}
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

public class ApproveRequestSteps extends ScenarioSteps 
{
 VacationOptionsPage obj;

	InboxPage InboxPage;

	@Step
	public void GoToInbox() {
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
	@Step
	public void verifymessage(){
		InboxPage.verifyMessage();
	}

}

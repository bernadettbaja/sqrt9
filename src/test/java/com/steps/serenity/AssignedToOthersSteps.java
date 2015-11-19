package com.steps.serenity;

import com.pages.LogInPage;
import com.pages.InboxPage;
import com.pages.AssignedToOthersPage;
import com.pages.VacationOptionsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import org.junit.Assert;

public class AssignedToOthersSteps extends ScenarioSteps 
{
 VacationOptionsPage obj;

	InboxPage InboxPage;
	AssignedToOthersPage AssignedToOthersPage;

	@Step
	public void GoToInbox() {
		obj.create_page_inboxVacManagement();
	}
	@Step
	public void GotoAssignedToOthersTab(){
		AssignedToOthersPage.assignedToOthers();
	}

	@Step
	public void checklist() {
		AssignedToOthersPage.click_checklist();
	}

	@Step
	public void reject() {
		AssignedToOthersPage.reject();
	}
	@Step
	public void verifymessage(){
		AssignedToOthersPage.verifyMessage();
		
	}
//	asdasdA

}
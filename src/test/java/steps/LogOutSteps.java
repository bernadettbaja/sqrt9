package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.LogOutPage;

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
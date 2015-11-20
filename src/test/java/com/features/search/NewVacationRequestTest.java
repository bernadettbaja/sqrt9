package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.steps.serenity.LogInSteps;
import com.steps.serenity.NewVacationRequestSteps;
import Helper.constante;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class NewVacationRequestTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LogInSteps logInSteps;
   
    @Steps
    public NewVacationRequestSteps newVacationRequestSteps;

    @Test
    public void newSimpleRequest() 
    {
    	logInSteps.login(constante.USERDEV, constante.PASSDEV);
    	newVacationRequestSteps.clickNewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(17, "Nov", 2015);
    	newVacationRequestSteps.selectEndDate(18, "Nov", 2015);
//    	newVacationRequestSteps.selectHoliday();
//    	newVacationRequestSteps.selectVacationWithoutPayment();
//    	newVacationRequestSteps.selectSickleave();
//    	newVacationRequestSteps.selectSpecialvacation();
    	newVacationRequestSteps.selectMaternityleave();
    	newVacationRequestSteps.selectMaternityLeaveOption();
    	newVacationRequestSteps.clickAddComment();
    	newVacationRequestSteps.typeComment("Comentariuasdasd asd asd");
    	newVacationRequestSteps.clickSaveButton();
 
    	

    }
} 
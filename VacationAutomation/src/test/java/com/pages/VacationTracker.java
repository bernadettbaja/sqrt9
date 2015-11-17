package com.pages;



import java.text.SimpleDateFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import jxl.write.DateFormat;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://172.22.4.88:9090/vacation?p_p_id=evovacation_WAR_EvoVacationportlet&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_evovacation_WAR_EvoVacationportlet_backURL=%2Fvacation%3Fp_p_id%3Devovacation_WAR_EvoVacationportlet%26p_p_lifecycle%3D0%26p_p_state%3Dnormal%26p_p_mode%3Dview%26p_p_col_id%3Dcolumn-1%26p_p_col_count%3D1%26_evovacation_WAR_EvoVacationportlet_backURL%3D%252Fvacation%253Fp_p_id%253Devovacation_WAR_EvoVacationportlet%2526p_p_lifecycle%253D0%2526p_p_state%253Dnormal%2526p_p_mode%253Dview%2526p_p_col_id%253Dcolumn-1%2526p_p_col_count%253D1%2526_evovacation_WAR_EvoVacationportlet_backURL%253D%25252Fvacation%2526_evovacation_WAR_EvoVacationportlet_menuItem%253Dnew-request%26_evovacation_WAR_EvoVacationportlet_menuItem%3Dnew-request&_evovacation_WAR_EvoVacationportlet_menuItem=vacation-tracker")
public class VacationTracker extends PageObject
{
	private WebDriver driver;
	private WebElementFacade webElement;

	public String insert_StartDate()
	{
		driver = null;
		driver.findElement(By.name("trackerStartDate")).click();
		driver.findElement(By.className("dp_caption dp_hoover")).click();
		driver.findElement(By.xpath("dp_caption dp_hoover")).click();
		return null;		
	}
	
	public String insert_endDate()
	{
		return null;
	}
	
}

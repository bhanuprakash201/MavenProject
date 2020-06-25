package com.dyt.ors.screenpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class Home extends WebLibrary{
	
	
	

	@FindBy(xpath="//a[text()='Login']")
	public static WebElement link_Login;
	
	@FindBy(xpath="//a[text()='Register']")
	public static WebElement link_Register;
	
	@FindBy(xpath="//input[@name='searchRecord']")
	public static WebElement searchRecord;
	
	@FindBy(xpath="//input[class='btn btn-secondary']")
	public static WebElement Search_button;	

	
	
	
	//===========================================
	public static void navLoginpage() {		
		boolean bStatus = clickElement(link_Login);
		Reporter.log(bStatus, "Login link clicked", "Login link not clicked");
	}	
	public static void navRegisterpage() {		
		boolean bStatus = clickElement(link_Register);
		Reporter.log(bStatus, "Register link clicked", "Register link not clicked");
	}	
	
	public static void EditSearchRecord(WebElement searchRecord,String SearchbyNameSynonymsCASNoCATNo)
	{
		boolean bStatus;
		
		bStatus =setEditValue(searchRecord, SearchbyNameSynonymsCASNoCATNo);
		Reporter.log(bStatus, "Product Name Entered", "Product Name not Entered");
		
		bStatus = clickElement(Search_button);
		Reporter.log(bStatus, "Search button clicked", "Search button not clicked");
		
	}
	

}
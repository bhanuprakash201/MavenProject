package com.dyt.ors.screenpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class EditMaincategory extends WebLibrary {
	@FindBy(xpath="//input[@name='ors_mc_category_name']")
	public static WebElement edit_Maincategory;	
	
	@FindBy(xpath="//input[@name='ors_order']")
	public static WebElement edit_Assignedorder;
	
	@FindBy(xpath="//input[@name='catgImage']")
	public static WebElement edit_Image;		
	
	@FindBy(xpath="//input[@class='btn btn-success']")
	public static WebElement Submit_button;	

	
	
	//=================Login methods=========================
	
	public static void EditMainCategoryPage(String user, String OrderValue , WebElement Choose_Image ,WebElement elementupload,String filepath) {			
		
		boolean bStatus;
		bStatus = setEditValue(edit_Maincategory, user);
		Reporter.log(bStatus, "Username entered", "Username not entered");
				
		bStatus = selectListItemByValue(edit_Assignedorder, OrderValue);
		Reporter.log(bStatus, "Order Value Selected", "Order Value not Selected");
		
		
		
		bStatus = uploadFile(Choose_Image,elementupload, filepath);
		Reporter.log(bStatus, "Image Uploaded", "Image not Uploaded");
		
		
		bStatus = clickElement(Submit_button);
		Reporter.log(bStatus, "Login button clicked", "Login button not clicked");
	}


}

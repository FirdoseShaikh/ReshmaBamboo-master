
package AdminTS;

/*import com.cync.base.BaseTest;*/

import base.BaseTest;

public class AdjustmentReasonTC extends BaseTest
{

}

/*
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify the Navigation.")
	public void navigateAdjustmentReason(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify the Navigation.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify the breadcrumb in Adjustment Reasons screen .")
	public void breadcrumbVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify the breadcrumb in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.BreadcrumbVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified breadcrumb in Adjustment Reasons screen");
}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify the header in Adjustment Reasons screen.")
	public void headerVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify the header in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.HeaderVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified header in Adjustment Reasons screen");
}
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify name label in Adjustment Reasons screen.")
	public void nameLabelVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify name label in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyLabelName());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified name label in Adjustment Reasons screen");
}	
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify description label in Adjustment Reasons screen.")
	public void descriptionLabelVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify description label in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyLabelDescription());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified description label in Adjustment Reasons screen");
}
	
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify dilution label in Adjustment Reasons screen.")
	public void dilutionLabelVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify dilution label in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyLabelDilution());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified dilution label in Adjustment Reasons screen");
}

	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify add label in Adjustment Reasons screen.")
	public void addLabelVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify add label in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyLabelAdd());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified add label in Adjustment Reasons screen");
}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify edit label in Adjustment Reasons screen.")
	public void editLabelVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify edit label in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyLabelEdit());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified edit label in Adjustment Reasons screen");
}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify delete label in Adjustment Reasons screen.")
	public void deleteLabelVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify delete label in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyLabelDelete());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified delete label in Adjustment Reasons screen");
}
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify export label in Adjustment Reasons screen.")
	public void exportLabelVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify export label in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyLabelExport());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified export label in Adjustment Reasons screen");
}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify name search in Adjustment Reasons screen.")
	public void nameSearchlVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify name search in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyNameSearch());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified name search in Adjustment Reasons screen");
}
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify description search in Adjustment Reasons screen.")
	public void descriptionSearchlVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify description search in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyDescriptionSearch());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified description search in Adjustment Reasons screen");
}
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify click on check box and Edit icon in Adjustment Reasons screen.")
	public void CheckBoxAndEditIconVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify click on check box and Edit icon in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.SelectCheckBox());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified check box click in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.VerifyLabelEdit());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified edit icon after check box is ON in Adjustment Reasons screen");

	
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify click on check box and delete icon  in Adjustment Reasons screen.")
	public void CheckBoxAndDeleteIconVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify click on check box and delete icon in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.SelectCheckBox());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified check box click in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.VerifyLabelDelete());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified delete icon after check box is ON in Adjustment Reasons screen");

	}

	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify click on multiple check box and verify delete icon in Adjustment Reasons screen.")
	public void verifyDeleteBtnCheckOnMultipleRecords(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify click on multiple check box and verify delete icon in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.SelectCheckBox());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified check box click in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.SelectCheckBoxTwo());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified multiple check box is ON in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.VerifyLabelDelete());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified delete icon after multiple check box is ON in Adjustment Reasons screen");

	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify click on multiple check box and verify edit icon in Adjustment Reasons screen.")
	public void verifyEditBtnCheckOnMultipleRecords(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify click on multiple check box and verify edit icon in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.SelectCheckBox());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified check box click in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.SelectCheckBoxTwo());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified multiple check box is ON in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.VerifyLabelEdit());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified edit icon after multiple check box is ON in Adjustment Reasons screen");

	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify click on add button and verify Adjustment Reasons - Add label in Adjustment Reasons screen.")
	public void verifyClickOnAdd(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify click on add button and verify Adjustment Reasons - Add label in Adjustment Reasons screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyAddBtnFunctionality());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified check on Add button in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.HeaderVerifyInAddScreen());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Adjustment Reasons - Add label in Adjustment Reasons screen");

		 
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify name text box in Adjustment Reasons - Add  screen.")
	public void verifyNameTextBoxOnAdd(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify name text box in Adjustment Reasons - Add  screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyAddBtnFunctionality());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified check on Add button in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.NameTextBoxVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Name text box in Adjustment Reasons - Add screen");

		 
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify description text box in Adjustment Reasons - Add  screen.")
	public void verifyDescriptionTextBoxOnAdd(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify description text box in Adjustment Reasons - Add  screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyAddBtnFunctionality());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified check on Add button in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.DescriptionTextBoxVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified description text box in Adjustment Reasons - Add screen");
	 
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify dilution check box in Adjustment Reasons - Add  screen.")
	public void verifyDilutionChkBoxOnAdd(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify dilution check box in Adjustment Reasons - Add  screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyAddBtnFunctionality());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified check on Add button in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.DilutionCheckBoxVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified dilution check box in Adjustment Reasons - Add screen");
	 
	}	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify Name field mandatory in Adjustment Reasons - Add  screen.")
	public void verifyNameMandatoryOnAdd(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify Name field mandatory in Adjustment Reasons - Add  screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyAddBtnFunctionality());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified check on Add button in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.NameFieldMandatoryLabelVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Name field mandatory in Adjustment Reasons - Add screen");
	 
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify cancel button in Adjustment Reasons - Add  screen.")
	public void verifyCancelBtnOnAdd(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify cancel button in Adjustment Reasons - Add  screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyAddBtnFunctionality());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified check on Add button in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.CancelBtnVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified cancel button in Adjustment Reasons - Add screen");
	 
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify save and new button in Adjustment Reasons - Add  screen.")
	public void verifyCSaveAndNewBtnOnAdd(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify save and new  button in Adjustment Reasons - Add  screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyAddBtnFunctionality());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified check on Add button in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.SaveAndNewBtnVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified save and new  button in Adjustment Reasons - Add screen");
	 
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify save button in Adjustment Reasons - Add  screen.")
	public void verifyCSaveBtnOnAdd(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify save  button in Adjustment Reasons - Add  screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyAddBtnFunctionality());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified check on Add button in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.SaveBtnVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified save button in Adjustment Reasons - Add screen");
	 
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify save button functionality without data in Adjustment Reasons - Add  screen.")
	public void verifyCSaveBtnFunction(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify save  button functionality in Adjustment Reasons - Add  screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyAddBtnFunctionality());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified check on Add button in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.SaveBtnFunctionalityVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified save functionality in Adjustment Reasons - Add screen");
	
		 Assert.assertTrue(adjust.NameTextBoxVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Name text box in Adjustment Reasons - Add screen");

		 
	}
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify functionality for duplicate value in Adjustment Reasons - Add  screen.")
	public void verifyDuplicateDataFunction(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify functionality for duplicate data in Adjustment Reasons - Add  screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyAddBtnFunctionality());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified check on Add button in Adjustment Reasons screen");

			String nameData="testautomationduplicate";
			String messageOnAdjustmentReason="Name has already been taken";

		 Assert.assertEquals(adjust.addValueToNameTextBox(nameData),"testautomationduplicate");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing duplicate data to the name text box in Adjustment Reasons screen");
			
		 Assert.assertTrue(adjust.SaveBtnFunctionalityVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified save functionality in Adjustment Reasons - Add screen");
	
		 Assert.assertEquals(adjust.verifyMessageOnAdjustmentReasonAfterSave(messageOnAdjustmentReason),"Name has already been taken");
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successful verified Adjustment Reasons add with duplicate value ");	
	    
	}
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify functionality for huge value in Adjustment Reasons - Add  screen.")
	public void verifyHugeDataFunction(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify functionality for huge data in Adjustment Reasons - Add  screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyAddBtnFunctionality());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified check on Add button in Adjustment Reasons screen");

			String nameData="realmadridrealmadridrealmadridrealmadridrealmadridrealmadridrealmadridrealmadridrealmadridrealmadrid";
			String messageOnAdjustmentReason="Name is too long (maximum is 50 characters)";

		 Assert.assertEquals(adjust.addValueToNameTextBox(nameData),"realmadridrealmadridrealmadridrealmadridrealmadridrealmadridrealmadridrealmadridrealmadridrealmadrid");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing duplicate data to the name text box in Adjustment Reasons screen");
			
		 Assert.assertTrue(adjust.SaveBtnFunctionalityVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified save functionality in Adjustment Reasons - Add screen");
	
		 Assert.assertEquals(adjust.verifyMessageOnAdjustmentReasonAfterSave(messageOnAdjustmentReason),"Name is too long (maximum is 50 characters)");
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successful verified Adjustment Reasons add with huge value ");	
	    
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify for < or = 10 charecter in Adjustment Reasons - Add  screen.")
	public void verifyfor10CharecterData(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify for < or = 10 charecter in Adjustment Reasons - Add  screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyAddBtnFunctionality());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified check on Add button in Adjustment Reasons screen");

			String nameData="realmadrid";

		 Assert.assertEquals(adjust.addValueToNameTextBox(nameData),"realmadrid");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing < or = 10 charecter in name text box in Adjustment Reasons screen");
			
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify for < or = 50 charecter in Adjustment Reasons - Add  screen.")
	public void verifyfor50CharecterData(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify for < or = 50 charecter in Adjustment Reasons - Add  screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyAddBtnFunctionality());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified check on Add button in Adjustment Reasons screen");

			String nameData="realmadridrealmadridrealmadridrealmadridrealmadrid";

		 Assert.assertEquals(adjust.addValueToNameTextBox(nameData),"realmadridrealmadridrealmadridrealmadridrealmadrid");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing < or = 50 charecter in name text box in Adjustment Reasons screen");
			
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify save and new functionality in Adjustment Reasons - Add  screen.")
	public void verifySaveAndNewFunction(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify  save and new functionality in Adjustment Reasons - Add  screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyAddBtnFunctionality());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified check on Add button in Adjustment Reasons screen");

			String nameData="madrid";
			String descriptionData="real";

		 Assert.assertEquals(adjust.addValueToNameTextBox(nameData),"madrid");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing valid data in name field in Adjustment Reasons screen");
			
		Assert.assertEquals(adjust.addValueToDescriptionTextBox(descriptionData),"real");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing valid data in description field in Adjustment Reasons screen");
			
		
		 Assert.assertTrue(adjust.SaveAndNewBtnFunctionalityVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified save and new functionality in Adjustment Reasons - Add screen");
	
		 Assert.assertTrue(adjust.HeaderVerifyInAddScreen());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Adjustment Reasons - Add label after save and new");

	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify save functionality with valid data and verify in Adjustment Reasons screen.")
	public void verifySaveFunctionality(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify save functionality with valid data ans verify in Adjustment Reasons screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyAddBtnFunctionality());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified check on Add button in Adjustment Reasons screen");

			String nameData="real";
			String descriptionData="madrid";

		 Assert.assertEquals(adjust.addValueToNameTextBox(nameData),"real");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing valid data in name field in Adjustment Reasons screen");
			
		Assert.assertEquals(adjust.addValueToDescriptionTextBox(descriptionData),"madrid");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing valid data in description field in Adjustment Reasons screen");

		String messageOnAdjustmentReason="Record saved successfully.";
		
		 Assert.assertTrue(adjust.SaveBtnFunctionalityVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified save functionality in Adjustment Reasons - Add screen");
		 
		 Assert.assertEquals(adjust.verifyMessageOnAdjustmentReasonAfterSave(messageOnAdjustmentReason),"Record saved successfully.");
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successful verified message Record saved successfull in Adjustment Reasons screen ");	
	    
	}
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify cancel functionality after entering data in Adjustment Reasons screen.")
	public void verifyCancelFunctionality(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify cancel functionality after entering data in Adjustment Reasons screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyAddBtnFunctionality());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified check on Add button in Adjustment Reasons screen");

			String nameData="real";
			String descriptionData="madrid";

		 Assert.assertEquals(adjust.addValueToNameTextBox(nameData),"real");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing valid data in name field in Adjustment Reasons screen");
			
		Assert.assertEquals(adjust.addValueToDescriptionTextBox(descriptionData),"madrid");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing valid data in name and  description field in Adjustment Reasons screen");
		
		 Assert.assertTrue(adjust.CancelFunctionalityVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified cancel functionality in Adjustment Reasons screen");
		 
		 Assert.assertTrue(adjust.HeaderVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified header in Adjustment Reasons screen after cancel");
	 
}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify search here functionality after entering false data in Adjustment Reasons screen.")
	public void verifySearchFunctionality_FalseValue(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify search here functionality after entering false data in Adjustment Reasons screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();

		String value="zzzzzz";

		 Assert.assertEquals(adjust.VerifySearchHereFunctionality(value),"zzzzzz");
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing Invalid data in Search here field in Adjustment Reasons screen");
	
			 Assert.assertTrue(adjust.NoRecordFoundlVerify());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified No record found label in Adjustment Reasons screen for invalid input");
		 	
}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify search here functionality after entering true data in Adjustment Reasons screen.")
	public void verifySearchFunctionality_TrueValue(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify search here functionality after entering true data in Adjustment Reasons screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();

		String value="duster";

		 Assert.assertEquals(adjust.VerifySearchHereFunctionality(value),"duster");
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing Valid data in Search here field in Adjustment Reasons screen");
	
			Assert.assertTrue(adjust.RecordFoundlVerify());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified rearch Record in Adjustment Reasons screen for Valid input");
		 	
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify Name search functionality after entering false data in Adjustment Reasons screen.")
	public void verifyNameSearchFunctionality_FalseValue(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify Name search  functionality after entering false data in Adjustment Reasons screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();

		String value="zzzzzz";

		 Assert.assertEquals(adjust.VerifyNameSearchFunctionality(value),"zzzzzz");
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing Invalid data in Name Search  field in Adjustment Reasons screen");
	
		Assert.assertTrue(adjust.NoRecordFoundlVerify());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified No record found label in Adjustment Reasons screen for invalid input");
		 	
}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify Name search functionality after entering true data in Adjustment Reasons screen.")
	public void verifyNameSearchFunctionality_TrueValue(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify Name search  functionality after entering true data in Adjustment Reasons screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();

		String value="duster";

		 Assert.assertEquals(adjust.VerifyNameSearchFunctionality(value),"duster");
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing valid data in Name Search  field in Adjustment Reasons screen");
	
		Assert.assertTrue(adjust.RecordFoundlVerify());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified serched record in Adjustment Reasons screen for Valid input");
		 	
}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify Description search functionality after entering false data in Adjustment Reasons screen.")
	public void verifyDescriptionSearchFunctionality_FalseValue(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify Description search  functionality after entering false data in Adjustment Reasons screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();

		String value="zzzzzz";

		 Assert.assertEquals(adjust.VerifyDescriptionSearchFunctionality(value),"zzzzzz");
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing Invalid data in Description Search  field in Adjustment Reasons screen");
	
		Assert.assertTrue(adjust.NoRecordFoundlVerify());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified No record found label in Adjustment Reasons screen for invalid input");
		 	
}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify Description search functionality after entering true data in Adjustment Reasons screen.")
	public void verifyDescriptionSearchFunctionality_TrueValue(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify Description search  functionality after entering true data in Adjustment Reasons screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();

		String value="mustard";

		 Assert.assertEquals(adjust.VerifyDescriptionSearchFunctionality(value),"mustard");
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing valid data in Description Search  field in Adjustment Reasons screen");
	
		Assert.assertTrue(adjust.RecordFoundlVerify());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified serched record in Adjustment Reasons screen for Valid input");
		 	
}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify page header in Adjustment Reasons Edit screen")
	public void verifyPageHeaderInEditScreen(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify page header in Adjustment Reasons Edit screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();

		Assert.assertTrue(adjust.RecordClickVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on existing record in Adjustment Reasons screen");
	 	
		Assert.assertTrue(adjust.VerifyEditHeaderNameUI());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified  page header in Adjustment Reasons Edit screen");
		 	
}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify name text box in Adjustment Reasons - Edit screen.")
	public void verifyNameTextBoxOnEdit(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify name text box in Adjustment Reasons - edit  screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.RecordClickVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on existing record in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.NameTextBoxVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Name text box in Adjustment Reasons - edit screen");

		 
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify description text box in Adjustment Reasons - Edit screen.")
	public void verifyDescriptionTextBoxOnEdit(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify description text box in Adjustment Reasons - edit  screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.RecordClickVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on existing record in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.DescriptionTextBoxVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified description text box in Adjustment Reasons - edit screen");

	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify cancel button in Adjustment Reasons - edit  screen.")
	public void verifyCancelBtnOnEdit(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify cancel button in Adjustment Reasons - edit  screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.RecordClickVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on existing record in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.CancelBtnVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified cancel button in Adjustment Reasons - edit screen");
	 
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify save button in Adjustment Reasons - edit  screen.")
	public void verifyCSaveBtnOnEdit(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify save  button in Adjustment Reasons - edit  screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.RecordClickVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on existing record in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.SaveBtnVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified save button in Adjustment Reasons - edit screen");
	 
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify save functionality in Adjustment Reasons - edit  screen.")
	public void verifyCSaveFunctionalityOnEdit(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify save  functionality in Adjustment Reasons - edit  screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.RecordClickVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on existing record in Adjustment Reasons screen");
		
		 String nameData="duster";
		 String descriptionData="mustard";
		 String messageOnAdjustmentReason="Record Updated successfully.";

		 Assert.assertEquals(adjust.addValueToNameTextBox(nameData),"duster");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to name text box in Adjustment Reasons edit screen");
			
		Assert.assertEquals(adjust.addValueToDescriptionTextBox(descriptionData),"mustard");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to description field in Adjustment Reasons edit screen");
		
		 Assert.assertTrue(adjust.SaveBtnFunctionalityVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified save functionality in Adjustment Reasons - edit screen");
	
		 Assert.assertEquals(adjust.verifyMessageOnAdjustmentReasonAfterEdit(messageOnAdjustmentReason),"Record Updated successfully.");
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successful verified save functionality in Adjustment Reasons edit screen");	
	    
	        Assert.assertTrue(adjust.HeaderVerify());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified header name in Adjustment Reasons screen");
	
		 
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify cancel functionality in Adjustment Reasons - edit  screen.")
	public void verifyCancelFunctionalityOnEdit(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify cancel  functionality in Adjustment Reasons - edit  screen");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.RecordClickVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on existing record in Adjustment Reasons screen");
		
		 String nameData="duster";
		 String descriptionData="mustard";

		 Assert.assertEquals(adjust.addValueToNameTextBox(nameData),"duster");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to name text box in Adjustment Reasons edit screen");
			
		Assert.assertEquals(adjust.addValueToDescriptionTextBox(descriptionData),"mustard");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to description field in Adjustment Reasons edit screen");
		
		 Assert.assertTrue(adjust.CancelFunctionalityVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified cancel functionality in Adjustment Reasons - edit screen");
	
	     Assert.assertTrue(adjust.HeaderVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified header name in Adjustment Reasons screen");
		 
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify click on check box and Edit function in Adjustment Reasons screen.")
	public void CheckBoxAndEditFunctionVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify click on check box and Edit function in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.SelectCheckBox());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified check box click in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.VerifyEditIconFunction());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified edit function after check box is ON in Adjustment Reasons screen");
		
		 Assert.assertTrue(adjust.VerifyEditHeaderNameUI());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified  page header in Adjustment Reasons Edit screen");
	 	
	
	}
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify click on check box also Edit function and UI in Adjustment Reasons edit screen.")
	public void CheckBoxAndEditFunctionVerifyUI(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify click on check box also Edit function and UI in Adjustment Reasons edit screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.SelectCheckBox());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified check box click in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.VerifyEditIconFunction());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified edit function after check box is ON in Adjustment Reasons screen");
		
		 Assert.assertTrue(adjust.NameTextBoxVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Name text box in Adjustment Reasons - edit screen");

		 Assert.assertTrue(adjust.DescriptionTextBoxVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified description text box in Adjustment Reasons - edit screen");

		 Assert.assertTrue(adjust.CancelBtnVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified cancel button in Adjustment Reasons - edit screen");
	 
		 Assert.assertTrue(adjust.SaveBtnVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified save button in Adjustment Reasons - edit screen");
	 
		 
	}
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify click on check box, Edit and save function in Adjustment Reasons screen.")
	public void CheckBoxAndEditFunctionWithSaveVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify click on check box , Edit and save function in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 String nameData="duster";
		 String descriptionData="mustard";
		 String messageOnAdjustmentReason="Record Updated successfully.";
		 
		 String value="duster";
		 
		 Assert.assertEquals(adjust.VerifySearchHereFunctionality(value),"duster");
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing Valid data in Search here field in Adjustment Reasons screen");
		 
		 Assert.assertTrue(adjust.SelectCheckBox());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified check box click in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.VerifyEditIconFunction());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified edit function after check box is ON in Adjustment Reasons screen");

		 Assert.assertEquals(adjust.addValueToNameTextBox(nameData),"duster");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to name text box in Adjustment Reasons edit screen");
			
		Assert.assertEquals(adjust.addValueToDescriptionTextBox(descriptionData),"mustard");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to description field in Adjustment Reasons edit screen");
		
		 Assert.assertTrue(adjust.SaveBtnFunctionalityVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified save functionality in Adjustment Reasons - edit screen");
	
		 Assert.assertEquals(adjust.verifyMessageOnAdjustmentReasonAfterEdit(messageOnAdjustmentReason),"Record Updated successfully.");
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successful verified save functionality in Adjustment Reasons edit screen");	
	    
	        Assert.assertTrue(adjust.HeaderVerify());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified header name in Adjustment Reasons screen");
	
	
	}
	

	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify click on check box, Edit and cancel function in Adjustment Reasons screen.")
	public void CheckBoxAndEditFunctionWithCancelVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify click on check box , Edit and cancel function in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 String nameData="duster";
		 String descriptionData="mustard";
		 
		 String value="duster";
		 
		 Assert.assertEquals(adjust.VerifySearchHereFunctionality(value),"duster");
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing Valid data in Search here field in Adjustment Reasons screen");
		 
		 Assert.assertTrue(adjust.SelectCheckBox());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified check box click in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.VerifyEditIconFunction());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified edit function after check box is ON in Adjustment Reasons screen");

		 Assert.assertEquals(adjust.addValueToNameTextBox(nameData),"duster");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to name text box in Adjustment Reasons edit screen");
			
		Assert.assertEquals(adjust.addValueToDescriptionTextBox(descriptionData),"mustard");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to description field in Adjustment Reasons edit screen");
		
		 Assert.assertTrue(adjust.CancelFunctionalityVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified cancel functionality in Adjustment Reasons - edit screen");
	
	        Assert.assertTrue(adjust.HeaderVerify());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified header name in Adjustment Reasons screen");
	
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify export function in Adjustment Reasons screen.")
	public void exportFunctionVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify export function in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyExportClick());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified export function in Adjustment Reasons screen");
}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify export pop up header name in Adjustment Reasons screen.")
	public void exportHeaderVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify export pop up header name in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();

		 Assert.assertTrue(adjust.VerifyExportClick());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified export function in Adjustment Reasons screen");
	
		 Assert.assertTrue(adjust.VerifyExportHearderName());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified export pop up header name in Adjustment Reasons screen");
}	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify export pop up name label in Adjustment Reasons screen.")
	public void exportNameLabelVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify export pop up name label in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();

		 Assert.assertTrue(adjust.VerifyExportClick());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified export function in Adjustment Reasons screen");
	
		 Assert.assertTrue(adjust.VerifyExportNameLabel());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified in export pop up name label in Adjustment Reasons screen");
}	
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify export pop up Description label in Adjustment Reasons screen.")
	public void exportDescriptionLabelVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify export pop up Description label in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();

		 Assert.assertTrue(adjust.VerifyExportClick());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified export function in Adjustment Reasons screen");
	
		 Assert.assertTrue(adjust.VerifyExportDescriptionLabel());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified in export pop up Description label in Adjustment Reasons screen");
}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify export pop up Dilution label in Adjustment Reasons screen.")
	public void exportDilutionLabelVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify export pop up Dilution label in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();

		 Assert.assertTrue(adjust.VerifyExportClick());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified export function in Adjustment Reasons screen");
	
		 Assert.assertTrue(adjust.VerifyExportDilutionLabel());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified in export pop up Dilution label in Adjustment Reasons screen");
}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify export pop up, export btn label in Adjustment Reasons screen.")
	public void exportBtnLabelInPopupVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify export pop up export btn label in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();

		 Assert.assertTrue(adjust.VerifyExportClick());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified export function in Adjustment Reasons screen");
	
		 Assert.assertTrue(adjust.VerifyLabelExport());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified in export pop up export btn label in Adjustment Reasons screen");
}
	

	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify export pop up, close btn label in Adjustment Reasons screen.")
	public void exportCloseBtnLabelInPopupVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify export pop up close btn label in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();

		 Assert.assertTrue(adjust.VerifyExportClick());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified export function in Adjustment Reasons screen");
	
		 Assert.assertTrue(adjust.VerifyOnExportCloseIconLabel());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified in export pop up close btn label in Adjustment Reasons screen");
}
	

	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify export pop up, close btn function in Adjustment Reasons screen.")
	public void exportCloseBtnFunctionInPopupVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify export pop up close btn function in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();

		 Assert.assertTrue(adjust.VerifyExportClick());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified export function in Adjustment Reasons screen");
	
		 Assert.assertTrue(adjust.VerifyOnExportCloseIconFunction());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified in export pop up close btn function in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.HeaderVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified header in Adjustment Reasons screen");

	}
	

	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify export functionality in Adjustment Reasons screen.")
	public void exportFunctionalityVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify export functionality in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();

		 Assert.assertTrue(adjust.VerifyExportClick());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified export function in Adjustment Reasons screen");
	
		 Assert.assertTrue(adjust.VerifyExportBtnFunctionality());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified in export btn functionality in Adjustment Reasons screen");

	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify delete pop up in Adjustment Reasons screen.")
	public void deletePopUpVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify delete pop up in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		Assert.assertTrue(adjust.SelectAnyCheckBox());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified click on check box in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.VerifyDeleteBtnFunctionality());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified delete click in Adjustment Reasons screen");
	
		 Assert.assertTrue(adjust.VerifyMsgOnDelete());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified delete pop up warning msg in Adjustment Reasons screen");

	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify Yes btn on delete pop up in Adjustment Reasons screen.")
	public void deletePopUpYesLabelVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify Yes btn on delete pop up in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		Assert.assertTrue(adjust.SelectAnyCheckBox());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified click on check box in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.VerifyDeleteBtnFunctionality());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified delete click in Adjustment Reasons screen");
		 
		 Assert.assertTrue(adjust.VerifyMsgOnDelete());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified delete pop up warning msg in Adjustment Reasons screen");
		 
		 Assert.assertTrue(adjust.VerifyYesbtnOnDelete());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Yes btn on delete pop up in Adjustment Reasons screen");
	
	
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify NO btn on delete pop up in Adjustment Reasons screen.")
	public void deletePopUpNoLabelVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify NO btn on delete pop up in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		Assert.assertTrue(adjust.SelectAnyCheckBox());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified click on check box in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.VerifyDeleteBtnFunctionality());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified delete click in Adjustment Reasons screen");
	
		 Assert.assertTrue(adjust.VerifyMsgOnDelete());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified delete pop up warning msg in Adjustment Reasons screen");
		 
		 Assert.assertTrue(adjust.VerifyNobtnOnDelete());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified NO btn on delete pop up in Adjustment Reasons screen");
	
	
	}
	

	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify NO btn functionality on delete pop up in Adjustment Reasons screen.")
	public void deletePopUpNoFunctionlityVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify NO btn functionality on delete pop up in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		Assert.assertTrue(adjust.SelectAnyCheckBox());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified click on check box in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.VerifyDeleteBtnFunctionality());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified delete click in Adjustment Reasons screen");
	
		 Assert.assertTrue(adjust.VerifyMsgOnDelete());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified delete pop up warning msg in Adjustment Reasons screen");
		 
		 Assert.assertTrue(adjust.VerifyNobtnFunctionalityOnDelete());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified NO btn functionality on delete pop up in Adjustment Reasons screen");
	
		 Assert.assertTrue(adjust.HeaderVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified header name in Adjustment Reasons screen");

		 
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify Yes btn functionality on delete pop up in Adjustment Reasons screen.")
	public void deletePopUpYesFunctionlityVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify Yes btn functionality on delete pop up in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		String value="real";
		 
		 Assert.assertEquals(adjust.VerifySearchHereFunctionality(value),"real");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing Valid data in Search here field in Adjustment Reasons screen");
		
		Assert.assertTrue(adjust.SelectCheckBox());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified click on check box in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.VerifyDeleteBtnFunctionality());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified delete click in Adjustment Reasons screen");
	
		 Assert.assertTrue(adjust.VerifyMsgOnDelete());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified delete pop up warning msg in Adjustment Reasons screen");
		 
		 Assert.assertTrue(adjust.VerifyYesbtnFunctionalityOnDelete());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Yes btn functionality on delete pop up in Adjustment Reasons screen");
	
		 String messageOnAdjustmentReason="Record deleted successfully";
		 
		 Assert.assertEquals(adjust.verifyMessageOnAdjustmentReasonAfterSave(messageOnAdjustmentReason),"Record deleted successfully");
	       ExtentTestManager.getTest().log(LogStatus.PASS, "Successful verified message Record deleted successfull in Adjustment Reasons screen ");	
 
	}
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify NO btn functionality on delete pop up for multiple records in Adjustment Reasons screen.")
	public void deletePopUpNoFunctionlityMultipleRecordVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify NO btn functionality on delete pop up for multiple records in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
		 Assert.assertTrue(adjust.VerifyAddBtnFunctionality());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified check on Add button in Adjustment Reasons screen");

			String nameData="real";
			String descriptionData="madrid";

		 Assert.assertEquals(adjust.addValueToNameTextBox(nameData),"real");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing valid data in name field in Adjustment Reasons screen");
			
		Assert.assertEquals(adjust.addValueToDescriptionTextBox(descriptionData),"madrid");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing valid data in description field in Adjustment Reasons screen");

		String messageOnAdjustmentReason="Record saved successfully.";
		
		 Assert.assertTrue(adjust.SaveBtnFunctionalityVerify());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified save functionality in Adjustment Reasons - Add screen");
		 
		 Assert.assertEquals(adjust.verifyMessageOnAdjustmentReasonAfterSave(messageOnAdjustmentReason),"Record saved successfully.");
	     ExtentTestManager.getTest().log(LogStatus.PASS, "Successful verified message Record saved successfull in Adjustment Reasons screen ");	
	    
String value="real";

		Assert.assertEquals(adjust.VerifySearchHereFunctionality(value),"real");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing Valid data in Search here field in Adjustment Reasons screen");
		
		
		Assert.assertTrue(adjust.SelectCheckBox());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified click on check box one in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.SelectCheckBoxTwo());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified click on check box two in Adjustment Reasons screen");
	
		 Assert.assertTrue(adjust.VerifyDeleteBtnFunctionality());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified delete click in Adjustment Reasons screen");
	
		 Assert.assertTrue(adjust.VerifyMsgOnDelete());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified delete pop up warning msg in Adjustment Reasons screen");
		 
		 Assert.assertTrue(adjust.VerifyNobtnFunctionalityOnDelete());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified NO btn functionality on delete pop up in Adjustment Reasons screen");
		 
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify YES btn functionality on delete pop up for multiple records in Adjustment Reasons screen.")
	public void deletePopUpYesFunctionlityMultipleRecordVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify YES btn functionality on delete pop up for multiple records in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();
		
String value="real";

		Assert.assertEquals(adjust.VerifySearchHereFunctionality(value),"real");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing Valid data in Search here field in Adjustment Reasons screen");
		
		Assert.assertTrue(adjust.SelectCheckBox());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified click on check box one in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.SelectCheckBoxTwo());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified click on check box two in Adjustment Reasons screen");
	
		 Assert.assertTrue(adjust.VerifyDeleteBtnFunctionality());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified delete click in Adjustment Reasons screen");
	
		 Assert.assertTrue(adjust.VerifyMsgOnDelete());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified delete pop up warning msg in Adjustment Reasons screen");
		 
		 Assert.assertTrue(adjust.VerifyYesbtnFunctionalityOnDelete());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Yes btn functionality on delete pop up in Adjustment Reasons screen");
		 
	}
	

	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify Name check functionality in export popup in Adjustment Reasons screen.")
	public void exportNameCheckBoxFunctionalityVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify Name check functionality in export popup in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();

		 Assert.assertTrue(adjust.VerifyExportClick());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified export function in Adjustment Reasons screen");
	
		 Assert.assertTrue(adjust.selectexportPopUpNameCheckbox(true));
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified in Name check functionality in export popup in Adjustment Reasons screen");

	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify Description  check functionality in export popup in Adjustment Reasons screen.")
	public void exportDescriptionCheckBoxFunctionalityVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify  Description  check functionality in export popup in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();

		 Assert.assertTrue(adjust.VerifyExportClick());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified export function in Adjustment Reasons screen");
	
		 Assert.assertTrue(adjust.selectexportPopUpDescriptionCheckbox(true));
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified in Description  check functionality in export popup in Adjustment Reasons screen");

	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify Dilution   check functionality in export popup in Adjustment Reasons screen.")
	public void exportDilutionCheckBoxFunctionalityVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify  Dilution   check functionality in export popup in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();

		 Assert.assertTrue(adjust.VerifyExportClick());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified export function in Adjustment Reasons screen");
	
		 Assert.assertTrue(adjust.selectexportPopUpDilutionCheckbox(true));
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified in Dilution   check functionality in export popup in Adjustment Reasons screen");

	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify enabled and disabled functionality of edit in Adjustment Reasons screen.")
	public void editAbleAndDisabledFunctionalityVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify enabled and disabled functionality of edit in Adjustment Reasons screen..");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();

		 Assert.assertTrue(adjust.VerifyEditBtnDisabled());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified edit disabled in Adjustment Reasons screen");
	
		 Assert.assertTrue(adjust.SelectCheckBox());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified  check box click functionality in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.VerifyLabelEdit());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified  edit enabled in Adjustment Reasons screen");

	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Adjustment Reasons: Verify enabled and disabled functionality of delete in Adjustment Reasons screen.")
	public void deleteAbleAndDisabledFunctionalityVerify(){
		
		ExtentTestManager.getTest().getTest().setName("Adjustment Reasons: Verify enabled and disabled functionality of delete in Adjustment Reasons screen.");
		ExtentTestManager.getTest().assignCategory("Module: Adjustment Reason");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		AdjustmentReasonPage adjust = cyncHomePage.getCyncMenus().openAdjustmentReason();

		 Assert.assertTrue(adjust.VerifyDeleteBtnDisabled());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified delete disabled in Adjustment Reasons screen");
	
		 Assert.assertTrue(adjust.SelectCheckBox());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified  check box click functionality in Adjustment Reasons screen");

		 Assert.assertTrue(adjust.VerifyLabelDelete());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified  delete enabled in Adjustment Reasons screen");

	}
	
}
*/
package kitetest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.ACTBC;
import pom_classes.ACT1;
import pom_classes.ACT2;
import utility.UtilityClass;
public class ACTTC extends ACTBC {
	//declare all useful members as global
	ACT1 login1;
	ACT2 home;
	
@BeforeClass
public void openBrowser() throws Throwable {
	initilizeBrowser();    
    //all objects of POM class
    login1=new ACT1(driver);
     home=new ACT2(driver);
}
@BeforeMethod
public void loginToApp() throws Throwable {
	//enter un	 
	 login1.enterUN(UtilityClass.getTD(2, 1));//DPG458
	 System.out.println((UtilityClass.getTD(2, 1)));	 
	 //enter pwd
	login1.enterPWD(UtilityClass.getTD(2, 3));
	//clck on login btn
	login1.clickLB();
	
}
@Test
public void verifyuserID() throws Throwable {
	Reporter.log("running verify user id",true);
	String actID = home.verifyUID();
	 String expID=UtilityClass.getTD(2, 5);
	Assert.assertEquals(expID,actID,"both are different tc is failed");
}
@AfterMethod
public void logoutApp() {
	Reporter.log("logout the application",true);
}
@AfterClass
public void closeBrowser() {
	Reporter.log("close the app",true);
}
}

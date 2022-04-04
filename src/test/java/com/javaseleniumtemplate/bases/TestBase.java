package com.javaseleniumtemplate.bases;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.ReportarBugPage;
import com.javaseleniumtemplate.utils.DriverUtils;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.ITestResult;
//import org.testng.annotations.*;


public class TestBase {

    @BeforeClass
    public static void beforeSuite(){
        new GlobalParameters();
    }

    @Before
    public void beforeTest(){
        DriverUtils.createInstance();
        DriverUtils.INSTANCE.manage().window().maximize();
        DriverUtils.INSTANCE.navigate().to(GlobalParameters.URL_DEFAULT);
    }

    @After
    public void afterTest(){
        DriverUtils.quitInstace();
    }

    @AfterClass
    public static void afterSuite(){
    }
}

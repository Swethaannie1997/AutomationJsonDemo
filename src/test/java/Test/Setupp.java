package Test;




import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Page.Config;
import Page.InputPage;
//import Page.Login;
import Page.LoginDetailsPage;
import Page.Jsonutilities;



@Listeners
	public class Setupp {
               
	           WebDriver driver ;
	           String url,path;
	         @BeforeTest
	           public void testt() throws Exception
	           {
	           driver=  new ChromeDriver();
	           url= Config.GetAppConfigg("url");
	           System.out.println("url");
	           driver.get(url);
	           }}
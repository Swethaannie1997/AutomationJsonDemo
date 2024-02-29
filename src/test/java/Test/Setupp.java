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
	           
	           public static JSONObject jObject;
	           
	           String url,path;
	           @Test
	           public void testt() throws Exception
	           {
	           driver=  new ChromeDriver();
	           url= Config.GetAppConfigg("url");
	           System.out.println("url");
	           driver.get(url);
	            InputPage inputsignuppage = new InputPage();
	       	    LoginDetailsPage signupdetails = new  LoginDetailsPage();  
	            InputPage inputpage= new InputPage();
	            LoginDetailsPage logindetailpage= new LoginDetailsPage();
	            InputPage inputsearchpage = new InputPage();
	        	LoginDetailsPage searchdetails = new  LoginDetailsPage();
	        	LoginDetailsPage cartdetails = new  LoginDetailsPage();
	        	//path
	        	JSONObject loginCartData = cartdetails.getCartDetails("src\\main\\java\\projectConfig\\Cartxpath.json");
	            JSONObject loginSearchData = searchdetails.getSearchDetails("src\\main\\java\\projectConfig\\Searchxpath.json");
	 	        	JSONObject inputsearchd = inputsearchpage.getSearchInputData("src\\main\\java\\projectConfig\\Searchdata.json");
	        	JSONObject loginDSignupData = signupdetails.getLoginDetails("src\\main\\java\\projectConfig\\Signupxpath.json");
	        	JSONObject inputsign = inputsignuppage.getInputData("src\\main\\java\\projectConfig\\Signupdata.json");
	           JSONObject loginDetailsData = logindetailpage.getLoginDetails("src\\main\\java\\projectConfig\\Loginxpath.json");
	           JSONObject inputdeta = inputpage.getInputData("src\\main\\java\\projectConfig\\testData.json");
	// Perform login using Selenium WebDriver based on the extracted data
	           
	        	//cart
		       	driver.findElement(By.xpath((String) loginCartData.get("cart"))).click();
		    	driver.findElement(By.xpath((String) loginCartData.get("add"))).click();
		    	driver.findElement(By.xpath((String) loginCartData.get("add2"))).click();
		    	driver.findElement(By.xpath((String) loginCartData.get("slct"))).click();
		    	driver.findElement(By.xpath((String) loginCartData.get("crtbtn"))).click();
		    	driver.findElement(By.xpath((String) loginCartData.get("qty"))).click();
		    	driver.findElement(By.xpath((String) loginCartData.get("prcdbtn"))).click();
	        	
		    	//Search
		           driver.findElement(By.xpath((String) loginSearchData.get("sdata"))).sendKeys((String) inputsearchd.get("sdata"));
		       	   driver.findElement(By.xpath((String) loginSearchData.get("search"))).click();// Click on the sign-up link
	            driver.findElement(By.xpath((String) loginDSignupData.get("signin"))).click();
	            driver.findElement(By.xpath((String) loginDSignupData.get("signup"))).click();
	            
	            // Fill in the sign-up form
	            driver.findElement(By.xpath((String) loginDSignupData.get("userid"))).sendKeys((String) inputsign.get("userid"));
	            driver.findElement(By.xpath((String) loginDSignupData.get("pswrd"))).sendKeys((String) inputsign.get("pswrd"));
	            driver.findElement(By.xpath((String) loginDSignupData.get("rpswrd"))).sendKeys((String) inputsign.get("pswrd"));
	            driver.findElement(By.xpath((String) loginDSignupData.get("firstname"))).sendKeys((String) inputsign.get("firstname"));
	            driver.findElement(By.xpath((String) loginDSignupData.get("lastname"))).sendKeys((String) inputsign.get("lastname"));
	            driver.findElement(By.xpath((String) loginDSignupData.get("email"))).sendKeys((String) inputsign.get("email"));
	            driver.findElement(By.xpath((String) loginDSignupData.get("phone"))).sendKeys((String) inputsign.get("phone"));
	            driver.findElement(By.xpath((String) loginDSignupData.get("add1"))).sendKeys((String) inputsign.get("add1"));
	            driver.findElement(By.xpath((String) loginDSignupData.get("add2"))).sendKeys((String) inputsign.get("add2"));
	            driver.findElement(By.xpath((String) loginDSignupData.get("city"))).sendKeys((String) inputsign.get("city"));
	            driver.findElement(By.xpath((String) loginDSignupData.get("state"))).sendKeys((String) inputsign.get("state"));
	            driver.findElement(By.xpath((String) loginDSignupData.get("zip"))).sendKeys((String) inputsign.get("zip"));
	            driver.findElement(By.xpath((String) loginDSignupData.get("country"))).sendKeys((String) inputsign.get("country"));
	            driver.findElement(By.xpath((String) loginDSignupData.get("signupbtn"))).click();
	          //Signin
	            driver.findElement(By.xpath((String) loginDetailsData.get("signin"))).click();
	            driver.findElement(By.name((String) loginDetailsData.get("username"))).sendKeys((String) inputsign.get("username"));
	           driver.findElement(By.name((String) loginDetailsData.get("password"))).sendKeys((String) inputdeta.get("password"));
	           driver.findElement(By.name((String) loginDetailsData.get("logbtn"))).click();
	           
	       	   
	       }
	   }
	   

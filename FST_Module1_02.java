	  
	       Forgot Password
	
1. Navigate to the dervice now instance
2. User should see the forgot password
3. Click the forgot password
4. User should see three tabs as Identify, Verify & Reset
5. User should see the username label and text filed
6. User should see the next button
7. Enter the username as admin
8. Click on the next button
9. User should see the Request in progress popup
10. User should see the Email field and email text box



package com.tkt.utils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.Properties;


public class ServiceNow
{
    public static void main (String[] args) throws Interruptedexception
	{
	System.setpropery ("Webdriver.gecko.driver","./softwares/geckodriver.exe ");
	
// Step1: Navigate to your service now instance

	webdriver driver = new Firefoxdriver();
	driver.get("Enter service now URL" );
	String Title = driver.getTitle();
	   System.out.println(Title);
	   
	   if (Title.equals(" ServiceNow "))
	   {
	      System.out.println("Displayed");
	   }
	   else
	   {
	      System.out.println("Not Displayed");
		  
	   }


// Step2: User should see the forgot password
// Step3: Click the forgot password
    
	
        driver.findelement(By.Xpath("//div[.='Identify']"));
	   Thread.sleep(3000);
	   String Title1 =  driver.getTitle1 ();
	   System.out.println(Title1);
	   
	   if (Title1.equals("Identify")
	   {
	      System.out.println("Displayed ");
	   }
	   else
	   {
	      System.out.println("Not Displayed");
		  
	   }
	   
	   
	   driver.findelement(By.Xpath("//div[.='Verify']"));
	   Thread.sleep(3000);
	   String Title2 =  driver.getTitle2 ();
	   System.out.println(Title2);
	   
	   if (Title2.equals("Verify")
	   {
	      System.out.println("Displayed");
	   }
	   else
	   {
	      System.out.println("Not Displayed");
		  
	   }
	   
	   
	   
	   driver.findelement(By.Xpath("//div[.='Reset']"));
	   Thread.sleep(3000);
	   String Title3 =  driver.getTitle3 ();
	   System.out.println(Title3);
	   
	   if (Title3.equals("Verify")
	   {
	      System.out.println("Displayed");
	   }
	   else
	   {
	      System.out.println("Not Displayed");
		  
	   }

	  
// Step4: Verify username text field has label of User name

	   driver.findelement(By.id("username").sendkeys("admin"));
	   Thread.sleep(3000);
	   
	   String Title4 =  driver.getTitle4();
	   System.out.println(Title4);
	   
	   if (Title4.equals("username")
	   {
	      System.out.println("Displayed");
	   }
	   else
	   {
	      System.out.println("Not Displayed");
		  
	   }

	   
// Step5: Enter username (admin)

	   driver.findelement(By.Xpath("//div[.='username']"));
	   Thread.sleep(3000);
	   String Title5 =  driver.getTitle5 ();
	   System.out.println(Title5);
	   
	   if (Title1.equals("username")
	   {
	      System.out.println("Displayed ");
	   }
	   else
	   {
	      System.out.println("Not Displayed");
		  
	   }
	   
	   driver.findelement(By.Xpath("//div[.='TextField']"));
	   Thread.sleep(3000);
	   String Title6 =  driver.getTitle6();
	   System.out.println(Title6 );
	   
	   if (Title1.equals("TextField")
	   {
	      System.out.println("Displayed");
	   }
	   else
	   {
	      System.out.println("Not Displayed");
		  
	   }
	   
	 
	 
// Step6: Verify passowrd text field has label of Password

	   driver.findelement(By.Xpath("//div[.='Next button']")).Click();
	   Thread.sleep(3000);
	   String Title4 =  driver.getTitle7();
	   System.out.println(Title7);
	   
	   if (Title7.equals("Next button")
	   {
	      System.out.println("Valid Password");
	   }
	   else
	   {
	      System.out.println("Invalid Password");
		  
	   }
	  
	  
// Step7: Enter password (instance password)

	   driver.findelement(By.id("username").sendkeys("admin"));
	   Thread.sleep(3000);
	   
	   String Title1 =  driver.getTitle1();
	   System.out.println(Title1);
	   
	   if (Title1.equals("username")
	   {
	      System.out.println("Displayed");
	   }
	   else
	   {
	      System.out.println("Not Displayed");
		  
	   }
	   

// Step8 : Click on the next button

	   driver.findelement(By.Xpath("//div[.='Next button']")).Click();
	   Thread.sleep(3000);
	   String Title4 =  driver.getTitle7 ();
	   System.out.println(Title7 );
	   
	   if (Title7.equals("Next button")
	   {
	      System.out.println("Valid Password");
	   }
	   else
	   {
	      System.out.println("Invalid Password");
		  
	   }
	   

// Step 9: User should see the Request in progress popup
	   
	   driver.findelement(By.id("Progress popup");
	   Thread.sleep(3000);
	   
	   String Title8 =  driver.getTitle8();
	   System.out.println(Title8);
	   
	   if (Title8.equals("Progress popup")
	   {
	      System.out.println("Displayed ");
	   }
	   else
	   {
	      System.out.println("Not Displayed");
		  
	   }
	   
	   
	   // Step 10 : User should see the Email field and email text box
	   
	   driver.findelement(By.id("Email field ");
	   Thread.sleep(3000);
	   
	   String Title9 =  driver.getTitle9();
	   System.out.println(Title8);
	   
	   if (Title9.equals("Email field ")
	   {
	      System.out.println("Displayed");
	   }
	   else
	   {
	      System.out.println("Not Displayed");
		  
	   }
	   
	   driver.findelement(By.id("email text box"));
	   Thread.sleep(3000);
	   
	   String Title10=  driver.getTitle10();
	   System.out.println(Title10);
	   
	   if (Title10.quals("email text box")
	   {
	      System.out.println("Displayed ");
	   }
	   else
	   {
	      System.out.println("Not Displayed");
		  
	   }
	   
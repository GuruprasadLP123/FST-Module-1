 Service now instance 
	
Login Positive:
1. Navigate to your service now instance
2. Verify title is ServiceNow
3. Verify username text field has label of User name
4. Enter username (admin)
5. Verify passowrd text field has label of Password
6. Enter password (instance password)
7. Verify language dropdown has label of Language
8. Verify language is selected as English by default
9. Verify forgot password is visible to the user
10. Verify user can see the login button
11. As user clicks on the login button
12. Verify the title as ServiceNow




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
	
// Step2 : Verify title is ServiceNow

	   String Title = driver.getTitle();
	   System.out.println(Title);
	   
	   if (Title.equals(" ServiceNow "))
	   {
	      System.out.println("Displayed ");
	   }
	   else
	   {
	      System.out.println("Not Displayed");
		  
	   }
	  
//Step3: Verify username text field has label of User name
//Step4: Enter username (admin)
//Step5: Verify passowrd text field has label of Password
//Step6: Enter password (instance password)


	            driver.findelement(By.id("username").sendkeys("admin"));
	   Thread.sleep(3000);
	   
	   String Title1 =  driver.getTitle1();
	   System.out.println(Title1);
	   
	   if (Title1.equals("username")
	   {
	      System.out.println("Displayed ");
	   }
	   else
	   {
	      System.out.println("Not Displayed");
		  
	   }
	   driver.findelement(By.id("Password).sendkeys("pwd");
	   Thread.sleep(3000);
	   String Title2 =  driver.Title2();
	   System.out.println(Title2);
	   
	   if (Title2.equals("Password")
	   {
	      System.out.println("Displayed");
	   }
	   else
	   {
	      System.out.println("Not Displayed");
		  
	   }
	   
//Step7: Verify language dropdown has label of Language
//Step8: Verify language is selected as English by default

	   webelement ele = driver.findelement(By.id("Language"));
	   select S = new select(ele);
	   S.select ByVisibleText("English");
	   System.out.println(S);
	   if (S.equals("English")
	   {
	      System.out.println("Displayed ");
	   }
	   else
	   {
	      System.out.println("Not Displayed");
		  
	   }
	 
	 
//Step9: Verify forgot password is visible to the user


        driver.findelement(By.id("Forgot Password"));
	   Thread.sleep(3000);
	   String Title3 =  driver.getTitle3 ();
	   System.out.println(Title3 );
	   
	   if (Title3.equals("Forgot Password"))
	   {
	      System.out.println("Displayed ");
	   }
	   else
	   {
	      System.out.println("Not Displayed");
		  
	   }
	   
//Step10: Verify user can see the login button
//Step11: As user clicks on the login button
//Step12: Verify the title as ServiceNow//

        driver.findelement(By.Xpath("//div[.='login']")).Click();
	   Thread.sleep(3000);
	   String Title4 =  driver.getTitle4 ();
	   System.out.println(Title4 );
	   
	   if (Title4.equals("ServiceNow"))
	   {
	      System.out.println("Displayed ");
	   }
	   else
	   {
	      System.out.println("Not Displayed");
		  
	   }
	   
	   
	   
	   
	   
	Login Negative:
1. Navigate to your service now instance
2. Verify title is Not ServiceNowiveNow
3. User clicks on the login button
4. Verify the error message as Invalid input in user name!
5. Enter the username as admin
6. User clicks on the login button
7. Verify the error message contains User name or password invalid



package com.tkt.utils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.Properties;


public class ServiceNow
{
    public static void main (String[] args) throws Interruptedexception
	{
	System.setproperty ("Webdriver.gecko.driver","./softwares/geckodriver.exe ");
	

// Step1: Navigate to your service now instance
	   webdriver driver = new Firefoxdriver();
	   driver.get("Enter service now URL" );
	   Thread.sleep(3000);
	
// Step2 : Verify title is ServiceNow
	   String Title = driver.getTitle();
	   System.out.printl(Title);
	   
	   if (Title.equals(" ServiceNow "))
	   {
	      System.out.println("Displayed ");
	   }
	   else
	   {
	      System.out.println("Not Displayed");
		  
	   }
	   
	   
// Step3: User clicks on the login button
// Step4: Verify the error message as Invalid input in user name!
// Step5: Enter the username as admin
// Step6: User clicks on the login button
// Step7: Verify the error message contains User name or  password invalid

        driver.findelement(By.Xpath("//div[.='login']")).Click();
	   Thread.sleep(3000);
	   String Title4 =  driver.getTitle4 ();
	   System.out.printl(Title4);
	   
	   if (Title4.equals("ServiceNow")
	   {
	      System.out.println("Valid Password");
	   }
	   else
	   {
	      System.out.println("Invalid Password");
		  
	   }
	  }
}
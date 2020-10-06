package com.cjc;







import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Facebook 
{
	public static void main(String[] args) throws FindFailed {
		
	
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
	   Screen sc=new Screen();
	   Pattern login=new   Pattern("C:\\Users\\dell\\Desktop\\Sikuli Snipping\\login.PNG");
	   Pattern email=new   Pattern("C:\\Users\\dell\\Desktop\\Sikuli Snipping\\email.PNG");
	   Pattern password=new   Pattern("C:\\Users\\dell\\Desktop\\Sikuli Snipping\\password.PNG");
	   Pattern login1=new   Pattern("C:\\Users\\dell\\Desktop\\Sikuli Snipping\\login1.PNG");
	   
	   sc.click(login);
	   sc.type(email, "archana.mahajan3194@gmail.com");
	   sc.type(password,"archana@3344");
	   sc.click(login1);
	 
}
}
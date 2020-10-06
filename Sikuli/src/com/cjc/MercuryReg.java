package com.cjc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class MercuryReg 
{
	public static void main(String[] args) throws FindFailed {
		
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("http://newtours.demoaut.com/mercuryregister.php");
		   driver.manage().window().maximize();
		   Screen sc=new Screen();
		   //firstname
		   Pattern fn=new   Pattern("C:\\Users\\dell\\Desktop\\fn.PNG");
		   sc.type(fn, "Archana");
		   //lastname
		   Pattern ln=new   Pattern("C:\\Users\\dell\\Desktop\\ln.PNG");
		   sc.type(ln, "mahajan");
		   //phone
		   Pattern ph=new   Pattern("C:\\Users\\dell\\Desktop\\pn.PNG");
		   sc.type(ph, "7868999034");
		   //email
		   Pattern em=new   Pattern("C:\\Users\\dell\\Desktop\\em.PNG");
		   sc.type(em, "Abc@123gmail.com");
		   //address
		   Pattern add=new   Pattern("C:\\Users\\dell\\Desktop\\add.PNG");
		   sc.type(add, "pune");
		   //city
		   Pattern cty=new   Pattern("C:\\Users\\dell\\Desktop\\Ct.PNG");
		   sc.type(cty, "mumbai");
		   //state
		   Pattern state=new   Pattern("C:\\Users\\dell\\Desktop\\ste.PNG");
		   sc.type(state, "maharshta");
		   //pincode
		   Pattern pn=new   Pattern("C:\\Users\\dell\\Desktop\\pnc.PNG");
		   sc.type(pn, "123456");
		  
		   //username
		   Pattern un=new   Pattern("C:\\Users\\dell\\Desktop\\un.PNG");
		   sc.type(un, "Archana");
		  		  
		driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(15) > td:nth-child(2) > input[type=password]")).sendKeys("Arch@123");
		driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(16) > td:nth-child(2) > input[type=password]")).sendKeys("Arch2123S");
		//button
		driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(18) > td > input[type=image]")).click();
		 
		   
		   
		   
		   
		   
		   
		   
		   
	}
}
		   
		   
		   
		   
		   
		   
		  /* Pattern lastname= new   Pattern("C:\\Users\\dell\\Desktop\\Sikuli Snipping\\Firstname.PNG");
		   Pattern address=  new   Pattern("C:\\Users\\dell\\Desktop\\Sikuli Snipping\\lastname.PNG");
		   Pattern pincode=  new   Pattern("C:\\Users\\dell\\Desktop\\Sikuli Snipping\\phone.PNG");
		   Pattern username= new   Pattern("C:\\Users\\dell\\Desktop\\phone.PNG");
		   Pattern phone=    new   Pattern("C:\\Users\\dell\\Desktop\\Cty.PNG");
		   Pattern state=    new   Pattern("C:\\Users\\dell\\Desktop\\state.PNG");
		   Pattern email=    new   Pattern("C:\\Users\\dell\\Desktop\\ps.PNG");
		  
		  
		   sc.type(lastname, "Abcde");
		   sc.type(address, "pune");
		   sc.type(pincode, "12345");
		   sc.type(username, "Archana");
		   sc.type(phone, "78977484949");
		   sc.type(state, "maharshtra");
		   sc.type(email, "Arch@123gmail.com");
		*/
		  

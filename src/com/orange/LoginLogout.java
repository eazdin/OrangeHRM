package com.orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogout {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(3000);
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//Input[@value='Add']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("txtEmpLastName")).sendKeys("patra");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("nihar");
		Thread.sleep(2000);
		driver.findElement(By.id("btnEdit")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout"));
		Thread.sleep(2000);
		driver.close();
		
	}

}

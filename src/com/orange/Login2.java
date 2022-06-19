package com.orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(3000);
driver.findElement(By.name("txtUserName")).sendKeys("admin");
driver.findElement(By.name("txtPassword")).sendKeys("admin");
driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
driver.switchTo().frame("rightMenu");
driver.findElement(By.xpath("//input[@value='Add']")).click();
Thread.sleep(3000);
driver.findElement(By.name("txtEmpLastName")).sendKeys("patra");
driver.findElement(By.name("txtEmpFirstName")).sendKeys("nihar");
Thread.sleep(2000);
driver.findElement(By.id("btnEdit")).click();
Thread.sleep(2000);
driver.findElement(By.name("EditMain")).click();
Thread.sleep(2000);
driver.findElement(By.name("txtEmpNickName")).sendKeys("papu");
Thread.sleep(2000);
Select s=new Select(driver.findElement(By.name("cmbMarital")));
s.selectByIndex(1);
Thread.sleep(3000);
driver.findElement(By.name("txtLicExpDate")).sendKeys("2021-04-10");
Thread.sleep(3000);
driver.findElement(By.className("savebutton")).click();
Thread.sleep(3000);
driver.findElement(By.className("backbutton")).click();
Thread.sleep(3000);
Select se = new Select (driver.findElement(By.name("loc_code")));
se.selectByValue("1");
Thread.sleep(2000);
driver.findElement(By.name("loc_name")).sendKeys("mitra");
Thread.sleep(2000);
driver.findElement(By.className("plainbtn")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='0290']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='Delete']")).click();
Thread.sleep(2000);
driver.findElement(By.linkText("Employee Id							")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='Add']")).click();
Thread.sleep(2000);
driver.findElement(By.linkText("Logout")).click();
driver.switchTo().defaultContent();
Thread.sleep(3000);
	}

}

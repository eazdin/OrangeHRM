package com.orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Adactin2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub	
		
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http://adactinhotelapp.com/HotelAppBuild2/");
				//Thread.sleep(2000); 
				driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("MitraNiharRanjan");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Mitra@1991");
				driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
				//Thread.sleep(2000);
				Select lo = new Select (driver.findElement(By.xpath("//*[@id=\"location\"]")));
				lo.selectByValue("Brisbane");
				//Thread.sleep(2000);
				Select ho = new Select (driver.findElement(By.xpath("//*[@id=\"hotels\"]")));
				ho.selectByValue("Hotel Sunshine");
				//Thread.sleep(2000);
				Select rt = new Select (driver.findElement(By.xpath("//*[@id=\"room_type\"]")));
				rt.selectByValue("Deluxe");
				Select ro = new Select (driver.findElement(By.xpath("//*[@id=\"room_nos\"]")));
				ro.selectByValue("3");
				//Thread.sleep(2000);
				driver.findElement(By.name("datepick_in")).sendKeys("18/05/2022");
				driver.findElement(By.name("datepick_out")).sendKeys("20/05/2022");
				//Thread.sleep(2000);
				Select ad = new Select (driver.findElement(By.xpath("//*[@id=\"adult_room\"]")));
				ad.selectByValue("2");
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"Submit\"]")).click();
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/input[1]")).click();
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("Nihar");
				driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Patra");
				driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("bbsr");
				driver.findElement(By.xpath("//*[@id=\"cc_num\"]")).sendKeys("1234567891234567");
				Select ct = new Select (driver.findElement(By.xpath("//*[@id='cc_type']")));
				ct.selectByValue("VISA");
				//Thread.sleep(2000);
				Select sm = new Select (driver.findElement(By.xpath("//*[@id=\"cc_exp_month\"]")));
				sm.selectByValue("8");
				Select sy = new Select (driver.findElement(By.xpath("//*[@id=\"cc_exp_year\"]")));
				sy.selectByValue("2022");
				driver.findElement(By.xpath("//*[@id='cc_cvv']")).sendKeys("123");
				driver.findElement(By.xpath("//*[@id='book_now']")).click();
				
				WebElement element = driver.findElement(By.xpath("//*[@id='search_hotel']"));
				Actions action = new Actions(driver);
				action.moveToElement(element).perform();
				driver.findElement(By.xpath("//*[@id='search_hotel']")).click();
				
				driver.findElement(By.xpath("//*[@id='logout']")).click();
				Thread.sleep(2000);

		
	}

			}



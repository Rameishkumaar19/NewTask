package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/challenging_dom");

		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		for (int i = 0; i < rows.size(); i++) {
			
			WebElement row = rows.get(i);
			
			List<WebElement> datas = row.findElements(By.tagName("td"));
			
			for (int j = 0; j < datas.size(); j++) {
				
				if (!(j==6)) {
					
					WebElement data = datas.get(j);
					
					String text = data.getText();
					
					System.out.println(text);
					
				}
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

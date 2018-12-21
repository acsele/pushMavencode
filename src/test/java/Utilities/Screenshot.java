package Utilities;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	public static void Screenshot(WebDriver driver , String filename){
		TakesScreenshot snap = (TakesScreenshot ) driver;
		File src = snap.getScreenshotAs(OutputType.FILE);
		
	System.out.println(src.getAbsolutePath());
	
	File dest = new File("D:\\AutomationScreenshot" + filename);
	
	
		
		
	}

}
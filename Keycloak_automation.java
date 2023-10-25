package keycloak;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Keycloak_automation {
	
public static void main(String[] args) throws InterruptedException {
		
		
		System.getProperty("webdriver.chrome.driver");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
		driver.get("http://localhost:9000");
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/h3/a")).click();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
	    driver.findElement(By.id("password")).sendKeys("d376f7bd9257a0d73006f1514bb316ed"+Keys.ENTER);
	    
	    //naviagtion-wworking
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));	    
	   driver.findElement(By.tagName("path")).click();
	    
	   
	    
	    //master-working
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));	  
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/div[1]/button[1]")).click();
	  //jenkins-working   
	  //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));	  	    
	    driver.findElement(By.xpath("//*[@id='realm-select']/ul/li[1]/a/div/div[1]")).click();
	    //users-working
	    driver.findElement(By.xpath("//*[@id=\'nav-item-users\']")).click();
	    //add users-working
	    driver.findElement(By.xpath("//*[@id=\'pf-random-id-1\']/div[1]/div[1]/div[2]/button")).click();
	    //email
	    driver.findElement(By.xpath("//*[@id=\"kc-email\"]")).sendKeys("testuser302@gmail.com");
	    //yes or no toggle button
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
	    
	   
	    driver.findElement(By.xpath("//*[@id=\'kc-user-email-verified-off\']")).click();
	  
	
	  //firstname
	    driver.findElement(By.xpath("//*[@id=\'kc-firstName\']")).sendKeys("test");
	  //lastname
	    driver.findElement(By.xpath("//*[@id=\'kc-lastName\']")).sendKeys("user");
	   //create
	    driver.findElement(By.xpath("//*[@id=\"kc-main-content-page-container\"]/section[3]/section/form/div[7]/div/div/button[1]")).click();
	//save
	//    driver.findElement(By.xpath("//*[@id=\"pf-tab-section-/jenkins/users/7300f860-5810-408b-b585-5bc14cecb6dd/settings-pf-3008070943120tdr2owxkg7\"]/section/form/div[8]/div/div/button[1]")).click();
	
	 //credential-working
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
	    driver.findElement(By.xpath("//span[.='Credentials']")).click();
	    //set password -working
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
	  	   driver.findElement(By.xpath("//button[normalize-space()='Set password']")).click();
	  	//password	  	   
	  	 driver.findElement(By.id("password")).sendKeys("testuser302");
	  	 //password confirmation
	  	driver.findElement(By.id("passwordConfirmation")).sendKeys("testuser302");
	  	//temporary toggle button
	 // 	driver.findElement(By.xpath("//*[@id=\'kc-user-email-verified-off\']")).click();	  	
	  	driver.findElement(By.xpath("//*[@id=\'userCredentials-form\']/div[3]/div[2]/label/span[2]")).click();
	  	//save
	  	driver.findElement(By.xpath("//*[@id=\'modal-confirm\']")).click();
	  	//save passwordin red highlight
	  	driver.findElement(By.xpath("//*[@id=\'modal-confirm\']")).click();
	  //button[@id='modal-confirm']
	  	
	  	System.getProperty("webdriver.chrome.driver");
		WebDriver driver1 = new ChromeDriver();
	  	driver1.get("http://localhost:8080"); 
	  	//login
	  	driver1.findElement(By.xpath("//*[@id=\"page-header\"]/div[3]/a/b")).click();
	  	//backToApplication  	
	  	driver1.findElement(By.id("backToApplication")).click();
	  //login
	  	driver1.findElement(By.xpath("//*[@id=\"page-header\"]/div[3]/a/b")).click();
	  	driver1.findElement(By.id("username")).sendKeys("testuser302@gmail.com");
	    driver1.findElement(By.id("password")).sendKeys("testuser302"+Keys.ENTER);
	    //java__pp_new_1 job
	    driver1.findElement(By.xpath("//span[normalize-space()='java_pp_new_1']")).click();
	  //Configure
	    driver1.findElement(By.linkText("Configure")).click();
	  	//pipeline script from SCM    
	   WebElement pipelinescript=driver1.findElement(By.xpath("//*[@id=\'main-panel\']/form/div[1]/section[3]/div[2]/div[2]/select"));
	    		Select select = new Select(pipelinescript);
	    		select.selectByIndex(1);
	    //none
	    	//	driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
	    	//	WebElement nonebox=driver1.findElement(By.xpath("//*[@id=\"main-panel\"]/form/div[1]/section[3]/div[3]/div/div/div[8]/div[3]/select"));
	    	//	Select select1 = new Select(nonebox);
	    	//  select1.selectByIndex(0);  	
	    		//git    		  
	    		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
	    		driver1.findElement(By.xpath("//input[@name='_.url']")).clear();
	   driver1.findElement(By.xpath("//input[@name='_.url']")).sendKeys("https://github.com/VeronicaJeya/pipeline_projects1.git");
	   //credential
	   driver1.findElement(By.xpath(".//option[@value = 'pipelineproject']")).click();
	   
	   //master to main
	   driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(120)); 
	   driver1.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/section[3]/div[3]/div[1]/div[1]/div[7]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).clear();
		driver1.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/section[3]/div[3]/div[1]/div[1]/div[7]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("main");	
	   //save
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(120)); 
		//driver1.findElement(By.xpath("//*[@name='Submit']")).click();
		driver1.findElement(By.name("Submit")).click();
		//build now
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(120)); 
		driver1.findElement(By.xpath("//div[@id='tasks']//div[3]//span[1]//a[1]")).click();
	  	
}

}

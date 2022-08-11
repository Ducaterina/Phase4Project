package com.simplilearn.Phase4Project;



	import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
	import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;


	public class AddToCart {

	  private AndroidDriver driver;

	  @BeforeTest
	  public void setUp() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("appium:platformVersion", "10");
	    desiredCapabilities.setCapability("appium:deviceName", "Android SDK built for x86");
	    desiredCapabilities.setCapability("appium:appPackage", "com.flipkart.android");
	    desiredCapabilities.setCapability("appium:appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");
	    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
	    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
	    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
	    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	  }
	  
	  public MobileElement getId (String IdEnd) {
		  return (MobileElement) driver.findElementById("com.flipkart.android:id/"+IdEnd+"");
	  }
	  
	  public MobileElement getByText (String text) {
		  return (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='"+text+"']");
	  }

	  
	  
	  @Test
	  public void testLaptop() throws InterruptedException {
		  	Thread.sleep(20000);
		  	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.RelativeLayout/android.widget.ImageView[1]");
		    el1.click();
		    Thread.sleep(3000);
		    getId("select_btn").click();
		   
		    Thread.sleep(8000);
		    getId("custom_back_icon").click();
		    
		    Thread.sleep(3000);
		    getId("search_widget_textbox").click();
		    
		    MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Search grocery products");
		    el5.sendKeys("laptop");
		    Thread.sleep(5000);
		    MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]");
		    el6.click();
		    Thread.sleep(7000);
		    getId("not_now_button").click();
		    
		    
		    
		    
		    getByText("Sort").click();
		    Thread.sleep(5000);
		    
		    getByText("Popularity").click();
		    Thread.sleep(5000);
		    
		    getByText("Filter").click();
		    Thread.sleep(7000);
		    
		    getByText("Brand").click();
		    Thread.sleep(5000);
		    
		    getByText("ASUS").click();
		    Thread.sleep(3000);
		    
		    getByText("Processor").click();
		    Thread.sleep(3000);
		    
		    getByText("Core i7").click();
		    Thread.sleep(5000);
		    
		    getByText("Operating System").click();
		    Thread.sleep(3000);
		    
		    getByText("Windows 10").click();
		    Thread.sleep(5000);
		    
		    (new TouchAction(driver))
		    .longPress(PointOption.point(280, 1550))
		    .moveTo(PointOption.point(280, 450))
		    .release()
		    .perform();
		    
		    (new TouchAction(driver))
		    .longPress(PointOption.point(280, 1550))
		    .moveTo(PointOption.point(280, 1000))
		    .release()
		    .perform();
		    
		   	    
		    Thread.sleep(7000);
		    
		    getByText("RAM Capacity").click();
		    Thread.sleep(5000);
		    
		    getByText("16 GB").click();
		    	    
		    Thread.sleep(3000);
		    
		    MobileElement applyButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]");
		    applyButton.click();
		    
		    Thread.sleep(5000);
		    
		    MobileElement laptop = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup");
		    laptop.click();
		  
		    Thread.sleep(5000);
		    
		    MobileElement addToCart = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']");
		    addToCart.click();
		    
		    Thread.sleep(8000);
		    
		    (new TouchAction(driver))
		    .longPress(PointOption.point(700, 550))
		    .moveTo(PointOption.point(700, 1000))
		    .release()
		    .perform();
		    
		    Thread.sleep(5000);
		    
		    MobileElement cart = (MobileElement) driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Shopping Cart\"]/android.widget.LinearLayout");
		    cart.click();
		    
		    Thread.sleep(10000);
		    
//		    MobileElement check = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView[1]");
//		    String name = check.getAttribute("text");
//		    assertEquals(name, "ASUS Vivobook Gaming Core i7 10th Gen - (16 GB/1 TB HDD/256 GB SSD/Windows 10 Home/4 GB Graphics/NVIDIA GeForce GTX 1650/120 Hz) F571LH-AL434T Gaming Laptop ");
//		    
//		    Thread.sleep(5000);
	  }
	  
	 

	  @AfterTest
	  public void tearDown() {
	    driver.quit();
	  }
	}
		
package com.compare.au.common;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public abstract class TestBase {
	public static Properties config=null;
	private static boolean isInitalized=false;
	public static Logger log = null;
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;
	public static String TargetWebEndPoint;


	protected TestBase() {
		if(!isInitalized){
			initLogs();
			initConfig();
			initDriver();
		}
	}

	/**
	 * Initialize Logger.
	 */
	private static void initLogs(){
		if (log == null){
			// Initialize Log4j logs
			DOMConfigurator.configure(System.getProperty("user.dir")+ File.separator+"config"+ File.separator+"log4j.xml");
			log = Logger.getLogger("MyLogger");
			log.info("Logger is initialized..");
		}
	}


	private static void initConfig() {
		if (config == null) {
			try {
				//initialize config properties file
				config = new Properties();
				String config_fileName = "config.properties";
				String config_path = System.getProperty("user.dir") + File.separator+ "config" + File.separator + config_fileName;
				FileInputStream config_ip = new FileInputStream(config_path);
				config.load(config_ip);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static String getWebEndPoint() {
		if (TargetWebEndPoint == null) {
			try {
				TargetWebEndPoint = config.getProperty("env.url");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return TargetWebEndPoint;
	}



	/**
	 * Initialize Driver.
	 */
	private static void initDriver(){

		FirefoxProfile profile = new FirefoxProfile();

		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("disable-popup-blocking", false);
		dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,UnexpectedAlertBehaviour.ACCEPT);
		dc.setCapability(FirefoxDriver.PROFILE, profile);

		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		profile.setPreference("browser.download.dir", System.getProperty("user.dir")+ File.separator +"Download");
		profile.setPreference("browser.download.downloadDir", System.getProperty("user.dir")+ File.separator +"Download");
		profile.setPreference("browser.download.defaultFolder", System.getProperty("user.dir")+ File.separator +"Download");
		profile.setPreference("browser.download.manager.closeWhenDone", true);
		profile.setPreference("pdfjs.disabled", true);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip,text/csv,application/msword,application/excel,application/pdf," +
				"application/vnd.ms-excel,application/msword,application/unknown,application/vnd.openxmlformats-officedocument.wordprocessingml.document");

		if(config.getProperty("browser").equalsIgnoreCase("Firefox") ||config.getProperty("browser").equalsIgnoreCase("FF") ){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ File.separator+"drivers"+ File.separator  +"geckodriver");
			driver = new FirefoxDriver(profile);
			log.info(config.getProperty("browser")+" driver is initialized..");
		}
		else if (config.getProperty("browser").equals("InternetExplorer")||config.getProperty("browser").equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+ File.separator+"drivers"+ File.separator  +"IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			log.info(config.getProperty("browser")+" driver is initialized..");
		}
		else if (config.getProperty("browser").equals("GoogleChrome")||config.getProperty("browser").equalsIgnoreCase("CHROME")){

			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ File.separator +"drivers"+ File.separator +"chromedriver.exe");
			// To remove message "You are using an unsupported command-line flag: --ignore-certificate-errors.
			// Stability and security will suffer."
			// Add an argument 'test-type'
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("test-type");
			options.addArguments("--disable-notifications");
			options.addArguments("--headless", "window-size=1280,1024", "--no-sandbox"); // Enable for headless option
//			capabilities.setCapability("chrome.binary",System.getProperty("user.dir")+ File.separator +"drivers"+ File.separator +"chromedriver.exe");
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new ChromeDriver(capabilities);
			log.info(config.getProperty("browser")+" driver is initialized..");
		}else if (config.getProperty("browser").equalsIgnoreCase("htmlunit")) {
			// http://sourceforge.net/projects/htmlunit/files/htmlunit/
			driver = new HtmlUnitDriver();
//			driver = new HtmlUnitDriver(true);
			log.info(config.getProperty("browser")+" driver is initialized..");
		} else if(config.getProperty("browser").equalsIgnoreCase("phantomjs")||config.getProperty("browser").equalsIgnoreCase("PHANTOMJS")) {
			// Requires Phantomjs to be installed and available on PATH
			//driver = new PhantomJSDriver();
			log.info(config.getProperty("browser")+" driver is initialized..");
		}


		String waitTime = "30";
		driver.manage().timeouts().implicitlyWait(Long.parseLong(waitTime), TimeUnit.SECONDS);
		driver.manage().window().setPosition(new Point(0, 0));
		driver.manage().window().maximize();

		//Explicit Wait + Expected Conditions
		wait=new WebDriverWait(driver, 120);
	}
	
	@AfterSuite
	public void tearDown() {
		quitDriver();
	}

	/**
	 * Read Properties.
	 */
	protected static String getPropertyValue(String PropertyKey){
		Properties props=null;
		FileInputStream fin =null;
		String PropertyValue = null;

		try {
			File f = new File(System.getProperty("user.dir")+ File.separator+"config"+ File.separator+"env.properties");
			fin = new FileInputStream(f);
			props = new Properties();
			props.load(fin);
			PropertyValue = props.getProperty(PropertyKey);
		} catch(Exception e){
			System.out.println(e.getMessage());
		} 

		return PropertyValue;
	}


	/**
	 * Define path for Screenshot file.
	 */
	protected String getScreenshotSavePath() {
		String packageName = this.getClass().getPackage().getName();
		File dir = new File(System.getProperty("user.dir")+ File.separator+"screenshot"+ File.separator + packageName + File.separator);
		dir.mkdirs();
		return dir.getAbsolutePath();
	}


	/**
	 * Take Screenshot on failure.
	 */
	protected void getScreenshot() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String date = sdf.format(new Date());
		String url = driver.getCurrentUrl().replaceAll("[\\/:*\\?\"<>\\|]", "_");
		String ext = ".png";
		String path = getScreenshotSavePath() + File.separator + date + "_" + url + ext;

		try {
			if (driver instanceof TakesScreenshot) {
				File tmpFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				org.openqa.selenium.io.FileHandler.copy(tmpFile, new File(path));
				log.error("Captured Screenshot for Failure: "+path);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}


	/**
	 * Assert Actual and Expected Strings
	 */

	protected void assertStrings(String actual, String expected){


		try{
			Assert.assertEquals(actual, expected);
			log.info("Actual string: [ "+actual+" ] does match with Expected string: [ "+expected+" ]");		

		}catch(AssertionError e){
			log.error("Actual string: [ "+actual+" ] does not match with Expected string: [ "+expected+" ]");
			getScreenshot();
			Assert.fail();

		}

	} 

	/**
	 * Quit Driver.
	 */
	public static void quitDriver() {
		driver.quit();
		driver = null;
		log.info("Closing Browser.");

	}

}

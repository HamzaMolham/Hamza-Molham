package com.SauceDemo.base;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {

   public static WebDriver driver;
   public static Properties probes = new Properties();


   public static void launchBrowser() throws IOException {
       File file = new File("src/main/java/com/SauceDemo/proprities/config.proprities");
       FileInputStream fis = new FileInputStream(file);
       probes.load(fis);
       if(probes.getProperty("browser").equalsIgnoreCase("chrome")){
           WebDriverManager.chromedriver().setup();
           driver= new ChromeDriver();
       } else if (probes.getProperty("browser").equalsIgnoreCase("edge")) {
           WebDriverManager.edgedriver().setup();
           driver= new EdgeDriver();

       }

       driver.manage().window().maximize();
       driver.get(probes.getProperty("url"));
       driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);



   }
}

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
//import org.junit.*;
//import org.testng.Assert;
//import org.testng.annotations.Test;

public class AppiumBasics {

    @Test
    public void AppiumTest() throws MalformedURLException {

//        Map<String, String> env = new HashMap<>(System.getenv());
//        env.put("ANDROID_HOME", "C://Users//ShubhamT.INTERRAIT//AppData//Local//Android//Sdk");
//        env.put("JAVA_HOME", "C://Program Files//Java//jdk-17.0.5");

//        String nodeJsMainPath = "C://Users//ShubhamT.INTERRAIT//AppData//Roaming//npm//node_modules//appium//lib//main.js";
//        String nodeExePath = "C://Program Files//nodejs//node.exe";
//        String logFIle = "C://Users//ShubhamT.INTERRAIT//IdeaProjects//Appium2.0//src//test//resources//logs//log.text";


//        AppiumDriverLocalService service;
//
//        AppiumServiceBuilder builder = new AppiumServiceBuilder();
//        builder
//                .withAppiumJS(new File(nodeJsMainPath))
//                .usingDriverExecutable(new File(nodeExePath))
//                .withIPAddress("127.0.0.1")
//                .usingPort(4723)
//                .withArgument(GeneralServerFlag.LOCAL_TIMEZONE)
//                .withLogFile(new File(logFIle));
//
//        service = AppiumDriverLocalService.buildService(builder);
//        service.start();



        UiAutomator2Options options = new UiAutomator2Options();

        options.setDeviceName("Pixel 4 API 32");
        options.setApp(System.getProperty("user.dir")+"//src//test//resources//ApiDemos.apk");


        //  options.setCapability("browserName", "Chrome");

        // Create an AndroidDriver instance
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        driver.findElement(By.id("android:id/checkbox")).click();
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
       // Assert.assertEquals(alertTitle, "WiFi settings");
        driver.findElement(By.id("android:id/edit")).sendKeys("Rahul Wifi");

        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();




    }
}

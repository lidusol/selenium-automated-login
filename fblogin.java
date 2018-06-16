package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogin {
    public static void main(String[] args){
        method2();
    }
    public static void method2(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();

        driver.get("http://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("email@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("password");
        driver.findElement(By.id("loginbutton")).click();

        String notificationCount = driver.findElement(By.id("notificationsCountValue")).getText();
        System.out.println("You have " + notificationCount + " notifications");

        try{
            Thread.sleep(2000);
        }catch (Exception e){
        }



        driver.close();
    }

}

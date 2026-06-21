package org.example.class10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E3Poly {
    static void main() throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        Thread.sleep(2000);
        driver.get("https://ebay.com");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().to("https://facebook.com");
        Thread.sleep(2000);
        driver.close();
    }
}

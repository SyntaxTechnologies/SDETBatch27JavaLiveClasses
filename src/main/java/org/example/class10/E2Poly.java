package org.example.class10;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E2Poly {
    static void main() throws InterruptedException {

        ChromeDriver chromeDriver=new ChromeDriver();
        Thread.sleep(2000);
        chromeDriver.get("https://ebay.com");
        Thread.sleep(2000);
        chromeDriver.manage().window().maximize();
        Thread.sleep(2000);
        chromeDriver.navigate().refresh();
        Thread.sleep(2000);
        chromeDriver.navigate().to("https://facebook.com");
        Thread.sleep(2000);
        chromeDriver.close();

        FirefoxDriver firefoxDriver=new FirefoxDriver();
        Thread.sleep(2000);
        firefoxDriver.get("https://ebay.com");
        Thread.sleep(2000);
        firefoxDriver.manage().window().maximize();
        Thread.sleep(2000);
        firefoxDriver.navigate().refresh();
        Thread.sleep(2000);
        firefoxDriver.navigate().to("https://facebook.com");
        Thread.sleep(2000);
        firefoxDriver.close();

        EdgeDriver edgeDriver=new EdgeDriver();
        Thread.sleep(2000);
        edgeDriver.get("https://ebay.com");
        Thread.sleep(2000);
        edgeDriver.manage().window().maximize();
        Thread.sleep(2000);
        edgeDriver.navigate().refresh();
        Thread.sleep(2000);
        edgeDriver.navigate().to("https://facebook.com");
        Thread.sleep(2000);
        edgeDriver.close();






    }
}

package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("Test");

        Thread.sleep(2000);



        String title= driver.getTitle();
        System.out.println(title);
        if (title.equals("Web Orders Login")){
            System.out.println("title is correct");
        }else {
            System.out.println("title in not correct");
        }

        driver.quit();
    }
}

package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.findElement(By.id("customer.firstName")).sendKeys("Boris");


        driver.findElement(By.id("customer.lastName")).sendKeys("Komatina");

        driver.findElement(By.id("customer.address.street")).sendKeys("11111 Pere Perica");

        driver.findElement(By.id("customer.address.city")).sendKeys("Rome");

        driver.findElement(By.id("customer.address.state")).sendKeys("Italy");

        driver.findElement(By.id("customer.address.zipCode")).sendKeys("12345");

        driver.findElement(By.id("customer.phoneNumber")).sendKeys("000-111-222-33");

        driver.findElement(By.id("customer.ssn")).sendKeys("000000000");

        driver.findElement(By.id("customer.username")).sendKeys("Boris123");
        driver.findElement(By.id("customer.password")).sendKeys("987654321");
        driver.findElement(By.id("repeatedPassword")).sendKeys("987654321");

        Thread.sleep(2000);

        driver.quit();


    }
}

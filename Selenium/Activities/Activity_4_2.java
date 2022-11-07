import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_2 {
    public static void main(String[] args){

        WebDriver driver =new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        String title= driver.getTitle();
        System.out.println("Title of the page is :"+ title);

       WebElement FN= driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
       WebElement LN= driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
       WebElement email= driver.findElement(By.xpath("//*[@id=\"email\"]"));
       WebElement contact= driver.findElement(By.xpath("//*[@id=\"number\"]"));

       FN.sendKeys("Shailee");
       LN.sendKeys("Sharma");
       email.sendKeys("abc123@gmail.com");
       contact.sendKeys("2342342345");

       driver.findElement(By.xpath("//*[@id=\"simpleForm\"]/div/div[6]/div[1]/input")).click();


    }
}

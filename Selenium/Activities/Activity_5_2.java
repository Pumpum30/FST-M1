import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5_2 {
    public static void main(String[] args){

        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/dynamic-controls");

        String Title= driver.getTitle();
        System.out.println("Title of the page is :"+ Title);

        WebElement checkbox= driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input"));
        System.out.println("The checkbox input is Selected "+checkbox.isSelected());
        checkbox.click();
        System.out.println("The checkbox input is Selected "+checkbox.isSelected());



    }
}

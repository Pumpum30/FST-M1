import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_3 {
    public static void main(String[] args){

        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
        String title= driver.getTitle();
        System.out.println("Title of the page is :"+title);

        String ThirdHeader =driver.findElement(By.xpath("//*[@id=\"third-header\"]")).getText();
        System.out.println("The Third header is "+ ThirdHeader);

        String FifthHeader = driver.findElement(By.xpath("//h5")).getCssValue("color");
        System.out.println("Color of FifthHeader is :"+FifthHeader);

        String VioletButton=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/button[3]")).getAttribute("class");
        System.out.println("Violet Button classes are :"+ VioletButton);

        String GreyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println("Text of Grey Button :"+GreyButton);


    }
}

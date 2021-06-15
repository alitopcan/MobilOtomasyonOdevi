import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;

public class StepImplementation extends BaseTest{

    @Step("<key> id li elemente tıkla")
    public void clickBYid(String key){
        appiumDriver.findElement(By.id(key)).click();
    }
    @Step("<key> id li elemente <text>  değerini yaz")
    public void sendkeyBYid(String key,String text){
        appiumDriver.findElement(By.id(key)).sendKeys(text);
    }
    @Step("<key> xpath li elemente tıkla")
    public void clickBYxpath(String key){
        appiumDriver.findElement(By.xpath(key)).click();
    }
    @Step("<number> saniye bekle")
    public void waitForSeceond(int number) throws InterruptedException {
        Thread.sleep(number*1000);
    }
}
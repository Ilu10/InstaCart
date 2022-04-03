import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchLocation extends LaunchCloseBrowser{

    @Test
    public void validateCurrentLocation() throws InterruptedException {
        //clicking on location btn
        WebElement Location =driver.findElement(By.xpath("//h2[contains(text(),'Choose')]/child::span"));
        Location.click();

        //clicking on currentLocation
        WebElement selectCurrentLocation=driver.findElement(By.xpath("//span[contains(text(),'Use current location')]"));
        selectCurrentLocation.click();

        //clicking on submit btn
        WebElement btn_Submit=driver.findElement(By.xpath("//button[@aria-label='Submit Address']"));
        btn_Submit.click();

        //refreshing page
        driver.navigate().refresh();

        //getting text from address btn
        WebElement btn_Address= driver.findElement(By.xpath(" //span[@class='css-1r0o67d-AddressButton']"));
        String text_Address =btn_Address.getText();

        //validating actual address and expected address is matching
        Assert.assertEquals("385 Fairway Road South",text_Address);
    }
}

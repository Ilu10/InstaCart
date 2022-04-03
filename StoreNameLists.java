import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class StoreNameLists extends LaunchCloseBrowser{

        @Test
        public void validateStoreList() throws InterruptedException {

            //Scrolling down
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            WebElement element =driver.findElement(By.xpath("//h2[contains(text(),'Choose')]"));
            jse.executeScript("arguments[0].scrollIntoView(true);",element);

            //storing all store name in a list and printing out
            List<WebElement> storeNameList = driver.findElements(By.className("css-3w8d2s"));

            if(storeNameList.size() != 0)
            {
                System.out.println(storeNameList.size() + " List of StoreNames found \n");
                for(WebElement inputElement : storeNameList)
                {
                    System.out.println(inputElement.getText());
                }
            }
        }
}






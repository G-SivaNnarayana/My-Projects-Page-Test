import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MyProjectPageTesting {
    public static void main(String[] args){
        //Set from the path to the Chrome Driver instance
        System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\SELENIUM_SUITES\\chromedriver-win32\\chromedriver.exe");

        //open Chrome Browser
        WebDriver driver = new ChromeDriver();

        //Navigate the Home page Url
        driver.get("https://qamyprojects.ccbp.tech/");

        //Find and Click the first project input element
        WebElement firstProjectEl = driver.findElement(By.cssSelector("div[class^='my-projects'] div:first-of-type>:first-child"));
        firstProjectEl.click();

        //Find and Print the title (<h1> element) of the project
        WebElement firstProjectTitle = driver.findElement(By.cssSelector("div[class^='advance']>:first-child>h1"));
        System.out.println(firstProjectTitle.getText());

        //Find and Print the description (<p> element) of the project
        WebElement firstProjectdesc = driver.findElement(By.cssSelector("div[class^='advance']>:nth-child(2)"));
        System.out.println(firstProjectdesc.getText());

        //Find and Click the "Back" button
        WebElement backButton = driver.findElement(By.cssSelector("div[class^='advance']>button:last-of-type"));
        backButton.click();

        //Find and Click the second project input element
        WebElement secondProjectEl = driver.findElement(By.cssSelector("div[class^='my-project']>div:first-of-type>:last-child"));
        secondProjectEl.click();

        //Find and Print the title (<h1> element) of the project
        WebElement secondProjectTitle = driver.findElement(By.cssSelector("div[class*='top-section'] h1"));
        System.out.println(secondProjectTitle.getText());

        //Find and print the Diwali items and their Prices
        int i;
        for(i=0;i<4;i++){
            List<WebElement> diwaliItemsList = driver.findElements(By.cssSelector("div[class$='card-item']>:nth-child(1)+h1"));
            String  items = diwaliItemsList.get(i).getText();

            List<WebElement> diwaliPricesList = driver.findElements(By.cssSelector("div[class$='card-item']>:last-child"));
            String prices = diwaliPricesList.get(i).getText();

            System.out.println("The Price of " + items + " is: " + prices + ".");
        }

        //Find and Click the "Back" button
        WebElement diwaliBackBtn = driver.findElement(By.cssSelector("div>:last-child button"));
        diwaliBackBtn.click();

        //Find and Click the third project input element
        WebElement thirdProjectEl = driver.findElement(By.cssSelector("div[class^='my-project']>div:last-of-type>:first-child"));
        thirdProjectEl.click();

        //Find and Print the title (<h1> element) of the project
        WebElement thirdProjectTitle = driver.findElement(By.cssSelector("div[class^='order']>:first-child"));
        System.out.println(thirdProjectTitle.getText());

        //Find and Print the Description (<p> element) of the project
        WebElement thirdProjectDesc = driver.findElement(By.cssSelector("div[class^='order']>:nth-child(2)"));
        System.out.println(thirdProjectDesc.getText());

        //Find and Click the "Back" button
        WebElement orderBackBtn = driver.findElement(By.cssSelector("div[class^='order']>button:last-of-type"));
        orderBackBtn.click();

        //Find and Click the fourth project input element
        WebElement fourthProjectEl = driver.findElement(By.cssSelector("div[class^='my']>div:last-of-type>:last-child"));
        fourthProjectEl.click();

        //Find and Print the category (<p> element) of the project
        WebElement fourthProectCategory = driver.findElement(By.cssSelector("div[class$='card']>:first-child"));
        System.out.println(fourthProectCategory.getText());

        //Find and Print the title (<h1> element) of the project
        WebElement fourthProjectTitle = driver.findElement(By.cssSelector("div[class$='card']>:nth-child(2)"));
        System.out.println(fourthProjectTitle.getText());

        //Find and Print the Description (<p> element) of the project
        WebElement fourthProjectDesc = driver.findElement(By.cssSelector("div[class$='card']>p:nth-of-type(2)"));
        System.out.println(fourthProjectDesc.getText());

        //Find and Click the "Back" button
        WebElement categoryBackBtn = driver.findElement(By.cssSelector("div[class$='card']>button:last-of-type"));
        categoryBackBtn.click();

        //Quit the Web Driver instance
        driver.quit();

    }
}

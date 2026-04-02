import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;

@Listeners(TestListener.class)
public class SeleniumTestNG {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        //System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); // make sure chromedriver is in src
        driver = new ChromeDriver();
    }

    @Test
    public void quizTest() {
        driver.get("http://localhost:5000/quiz"); // replace if your URL is different

        List<WebElement> questions = driver.findElements(By.className("question"));

        for (WebElement question : questions) {
            List<WebElement> options = question.findElements(By.tagName("input"));
            if (!options.isEmpty()) {
                options.get(0).click(); // selects the first option
            }
        }

        WebElement submitButton = driver.findElement(By.id("submitQuiz"));
        submitButton.click();

        try { Thread.sleep(2000); } catch (InterruptedException e) {}

        WebElement result = driver.findElement(By.id("result"));
        System.out.println("Quiz Result: " + result.getText());
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

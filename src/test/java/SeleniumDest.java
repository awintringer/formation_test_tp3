import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDest
{

    WebDriver driver;

    @Before
    public void setup()
    {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }

    @After
    public void closeBrowser()
    {
        driver.quit();
    }

    @Test
    public void test_premier()
    {
        HomePage homePage = new HomePage(driver);
        homePage.recherche("Bordeaux");

        ResultPage resultPage = new ResultsPage();
        Assert.assertThat(resultPage.getResult(0), is("Site officiel de la ville de Bordeaux | Bordeaux"));
    }
}

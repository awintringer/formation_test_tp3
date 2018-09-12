import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.hamcrest.core.Is.is;

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
    public void testEntree()
    {
        //Arrange
        String expectedResult = "Site officiel de la ville de Bordeaux | Bordeaux";
        int resultNumber = 0;

        //Act
        HomePage homePage = new HomePage(driver);
        homePage.rechercheEntree("Bordeaux");
        ResultPage resultPage = new ResultPage(driver);
        String result = resultPage.getResult(resultNumber);

        //Assert
        Assert.assertThat(result, is(expectedResult));
    }
}

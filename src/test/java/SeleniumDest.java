import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SeleniumDest
{

    @Before
    public void setup()
    {

    }

    @After
    public void closeBrowser()
    {
        driver.quit();
    }

    @Test
    public void test_premier()
    {
        HomePage homePage = new HomePage();
        homepage.recherche("Bordeaux");
        ResultPage resultPage = new ResultPage();

        Assert.assertThat(resultPage.getResult(0), is("Site officiel de la ville de Bordeaux | Bordeaux"));
    }
}

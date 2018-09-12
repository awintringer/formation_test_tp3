import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class HomePage
{

    WebDriver driver;

    @FindBy(id = "hplogo");
    WebElement logo;

    @FindBy(name = "q");
    WebElement barreRecherche;

    @FindBy(css = ".lsb");
    WebElement boutonRecherche;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void recherche(String text)
    {

    }
}

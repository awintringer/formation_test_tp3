import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class HomePage
{

    WebDriver driver;

    @FindBy(id = "hplogo")
    WebElement logo;

    @FindBy(name = "q")
    WebElement barreRecherche;

    @FindBy(className = "lsb")
    WebElement boutonRecherche;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void rechercheClic(String text)
    {
        barreRecherche.sendKeys(text);
        boutonRecherche.click();
    }

    public void rechercheEntree(String text)
    {
        barreRecherche.sendKeys(text);
        barreRecherche.sendKeys(Keys.ENTER);
    }
}

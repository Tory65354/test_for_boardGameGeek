import io.cucumber.java.da.Men;
import org.junit.Assert;
import org.junit.Test;
import pages.BaseFunc;
import pages.HomePage;
import pages.MenuPage;

public class BoardGameGeekTestsOnPages {
    private final String URL = "http://boardgamegeek.com/";

    @Test
    public void selectionOfTheTopGame() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openUrl(URL);

        HomePage homePage = new HomePage(baseFunc);
        homePage.clickMenu();

        Assert.assertTrue("The menu window didn't open", homePage.getWindow());

        MenuPage menuPage = new MenuPage(baseFunc);
        menuPage.clickOneOfTheTopGame(3);

        Assert.assertTrue("navigation to the page of the game failed", menuPage.getGameDescription());
    }
}

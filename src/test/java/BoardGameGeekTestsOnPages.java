
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
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

        Assertions.assertTrue(homePage.getWindow(), "The menu window didn't open");

        MenuPage menuPage = new MenuPage(baseFunc);
        menuPage.clickOneOfTheTopGame();

       Assertions.assertTrue(menuPage.getGameDescription(), "navigation to the page of the game failed");
    }
}

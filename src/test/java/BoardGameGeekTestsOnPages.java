import io.cucumber.java.da.Men;
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

        MenuPage menuPage = new MenuPage(baseFunc);
        menuPage.clickOneOfTheTopGame2(1);
    }


}

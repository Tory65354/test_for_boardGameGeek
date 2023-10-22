package stepdefs;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.Information;
import model.Rating;
import org.junit.jupiter.api.Assertions;
import pages.BaseFunc;
import pages.HomePage;
import pages.MenuPage;
import requesters.TheWhiteCastleGameInformationRequester;
import java.util.List;
public class BoardGameGeekStepDefs {
    private BaseFunc baseFunc = new BaseFunc();
    private HomePage homePage;
    private MenuPage menuPage;
    private List<Information> information;
    private Rating ratingFromApi;

    @Given("home page is opened")
    public void open_home_page() {
        baseFunc.openUrl("http://boardgamegeek.com/");
        homePage = new HomePage(new BaseFunc());
    }

    @When("we click on the menu button")
    public void press_button_menu() {
        homePage.clickMenu();
        menuPage = new MenuPage(baseFunc);
    }

    @Then("list of games appears in opened window")
    public void list_of_games_appears_check() {
        Assertions.assertTrue(homePage.getWindow(), "The menu window didn't open");
    }

    @When("we are selecting game with increasing rank")
    public void selecting_game() {
        menuPage.clickOneOfTheTopGame();
    }

    @Then("the browser navigates to the page with the description of the selected game")
    public void navigates_on_the_next_page_check() {
        Assertions.assertTrue(menuPage.getGameDescription(), "navigation to the page of the game failed");
    }

    @When("we are requesting information about the game White Castle via API")
    public void request_the_white_castle() throws JsonProcessingException {
        TheWhiteCastleGameInformationRequester requester = new TheWhiteCastleGameInformationRequester();
        information = requester.getGameInformation();
        System.out.println("Information:" + information);
    }

    @Then("we get the average rating of the game")
    public double average_rating() {
        Assertions.assertNotNull(ratingFromApi, "Rating is null");
        double average = ratingFromApi.getAverage();
        System.out.println("Average Rating:" + average);
        return average;
    }

    @Then("the average game rating matches the value obtained")
    public void average_rating_check() {
        double averageRatingFromApi = average_rating();
        double averageRatingFromWebPage = menuPage.getAverageRating();
        Assertions.assertEquals(averageRatingFromWebPage, averageRatingFromApi, "Average ratings don't match");
    }
}





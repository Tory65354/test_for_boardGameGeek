package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import pages.BaseFunc;
import pages.HomePage;
import pages.MenuPage;

public class BoardGameGeekStepDefs {
    private BaseFunc baseFunc = new BaseFunc();
    private HomePage homePage;
    private MenuPage menuPage;
    private String ratingFromApi;

    @Given("home page is opened")
    public void open_home_page() {
        baseFunc.openUrl("http://boardgamegeek.com/");
        homePage = new HomePage(baseFunc);
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
    public void request_the_white_castle() {
        Response response = RestAssured.get("https://boardgamegeek.com/xmlapi/game/371942?stats=1");
        if (response.getStatusCode() != 200) {
            System.out.println("Error" + response.getStatusCode());
            System.out.println("Error message:" + response.getBody().asString());
        }
        ratingFromApi = response.getBody().asString();

        System.out.println("It is work" + ratingFromApi);
    }

    @Then("we get the average rating of the game")
    public double average_rating(String xmlResponse) {
        XmlPath xmlPath = new XmlPath(xmlResponse);
        String averageRating = xmlPath.get("boardgames.boardgame.statistics.ratings.average");
       return Double.parseDouble(averageRating);
    }

    @Then("the average game rating matches the value obtained")
    public void average_rating_check() {
        double averageRatingFromApi = average_rating(ratingFromApi);
        double averageRatingFromWebPage = menuPage.getAverageRating();
        Assertions.assertEquals(averageRatingFromWebPage,averageRatingFromApi, "Average ratings don't match");
    }
}





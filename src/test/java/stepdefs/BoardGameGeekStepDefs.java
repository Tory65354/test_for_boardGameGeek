package stepdefs;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.Information;
import org.junit.Assert;
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
    private Information informationFromApi;

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
        Assert.assertTrue("The menu window didn't open", homePage.getWindow());
    }

    @When("we are selecting game with increasing rank")
    public void selecting_game() {
        menuPage.clickOneOfTheTopGame(3);
    }

    @Then("the browser navigates to the page with the description of the selected game")
    public void navigates_on_the_next_page_check() {
        Assert.assertTrue("navigation to the page of the game failed", menuPage.getGameDescription());
    }

    @When("we are requesting information about the game White Castle via API")
    public void request_the_white_castle() throws JsonProcessingException {
        TheWhiteCastleGameInformationRequester requester = new TheWhiteCastleGameInformationRequester();
        information = requester.getGameInformation();
    }

    @Then ("we get the average rating of the game")
    public void average_rating() {
        for (Information i : information) {
            if (){}
        }

    }

}

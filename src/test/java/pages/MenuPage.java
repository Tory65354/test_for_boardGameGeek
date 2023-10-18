package pages;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuPage {
    private final By LIST_GAMES = By.xpath(".//div[@class = 'tw-flex-1']");
    private final By ARROW_UP = By.xpath(".//fa-icon[@class= 'ng-fa-icon tw-text-base tw-text-green']");
    private final By GAME_DESCRIPTION = By.xpath(".//div[@class = 'game-primary ng-scope']");

    private BaseFunc basefunc;

    public MenuPage(BaseFunc basefunc) {
        this.basefunc = basefunc;
    }

    public void clickOneOfTheTopGame(int index) {
        List<WebElement> topGames = basefunc.findElements(LIST_GAMES);
        for (WebElement game : topGames) {
            List<WebElement> arrowUp = basefunc.findElements(ARROW_UP);
            game.click();
            break;
        }
    }

    public boolean getGameDescription () {return basefunc.findElement(GAME_DESCRIPTION).isDisplayed();}

   // public void clickOneOfTheTopGam1 (int index) {
     // if(!basefunc.findElements(LIST_GAMES).isEmpty()) {

    //     //Я выбираю 0 элемент по индексу
    //       } else {
      //  }
   //  }


}

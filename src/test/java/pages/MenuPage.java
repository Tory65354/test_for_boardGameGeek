package pages;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuPage {
    private final By LIST_GAME = By.xpath(".//li[@class = 'hotness-item tw-relative tw-flex tw-justify-between']");
    private final By ARROW_UP = By.xpath(".//span[@_ngcontent-ng-c4027013425]//fa-icon[@_ngcontent-ng-c4027013425 and contains(@class, 'ng-fa-icon') and contains(@class, 'tw-text-base') and contains(@class, 'tw-text-green')]");
    private final By GAME_TITLE = By.xpath(".//div[@class = 'tw-flex-1']");
    private final By GAME_DESCRIPTION = By.xpath(".//div[@class = 'game-primary ng-scope']");
    private final By AVERAGE_RATING = By.xpath(".//span[@class = 'ng-binding']");

    private BaseFunc basefunc;

    public MenuPage(BaseFunc basefunc) {
        this.basefunc = basefunc;
    }

    public void clickOneOfTheTopGame() {
        basefunc.waitForElementsCountToBeAtLeast(LIST_GAME, 10);
        List<WebElement> allGames = basefunc.findElements(LIST_GAME);
        Assertions.assertFalse(allGames.isEmpty(), "There is no games at all");
        boolean isGameFound = false;
        for (WebElement game : allGames) {
            List<WebElement> arrowUp = game.findElements(ARROW_UP);
            if (!arrowUp.isEmpty()) {
                WebElement gameTitle = game.findElement(GAME_TITLE);
                gameTitle.click();
                isGameFound = true;
                break;
            }
        }
        Assertions.assertTrue(isGameFound, "No game with an up arrow found ");
    }

    public boolean getGameDescription() {
        return basefunc.findElement(GAME_DESCRIPTION).isDisplayed();
    }

    public double getAverageRating() {
        WebElement averageRating = basefunc.findElement(AVERAGE_RATING);
        String averageRatingText = averageRating.getText();
        return Double.parseDouble(averageRatingText);
    }
}

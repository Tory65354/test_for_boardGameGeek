package pages;

import org.openqa.selenium.By;

public class HomePage {
    private final By MENU_BTN = By.xpath(".//button[@class = 'btn btn-empty header-icon tw-mr-2 tw-hidden tw-self-center tw-rounded tw-p-1.5 tw-leading-none tw-outline-none hover:tw-bg-purple-dark hover:tw-text-white focus:tw-bg-purple-dark focus:tw-text-white xl:tw-block']");
    private final By MENU_WINDOW = By.xpath(".//div[@class = 'dropdown']");

    private BaseFunc baseFunc;

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void clickMenu() {
        baseFunc.click(MENU_BTN);
    }

    public boolean getWindow() {
        return baseFunc.findElement(MENU_WINDOW).isDisplayed();
    }
}

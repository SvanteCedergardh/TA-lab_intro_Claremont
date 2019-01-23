package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RepoListPage {

    WebDriver driver;

    By firstRepoIdentifier = By.cssSelector("#user-repositories-list > ul > li > div.col-9.d-inline-block > div.d-inline-block.mb-1 > h3 > a");

    public RepoListPage(WebDriver browser) {
        this.driver = browser;
    }
    public String getNameOfFirstRepo() {

        return driver.findElement(firstRepoIdentifier).getText();
    }
}

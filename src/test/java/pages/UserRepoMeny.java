package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserRepoMeny {

    WebDriver driver;

    By repositoriesLinkIdentifier = By.cssSelector("#js-pjax-container > div > div.col-9.float-left.pl-2 > div.UnderlineNav.user-profile-nav.js-sticky.top-0 > nav > a:nth-child(2)");

    public UserRepoMeny(WebDriver browser) {
        this.driver = browser;
    }

    public RepoListPage showRepositoryListPage() {

        driver.findElement(repositoriesLinkIdentifier).click();
        return new RepoListPage(driver);
    }
}

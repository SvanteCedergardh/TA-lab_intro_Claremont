package se.claremont.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.RepoListPage;
import pages.UserRepoMeny;

import java.util.concurrent.TimeUnit;

public class SeleniumTesting {

    WebDriver browser;

    @Before
    public void setUp() {

        browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        browser.get("https://www.github.com/SvanteCedergardh");
    }

    @After
    public void tearDown() {

        browser.quit();
    }
    @Test
    public void simpleSeleniumTest() {

        UserRepoMeny menu = new UserRepoMeny(browser);

        RepoListPage listPage = menu.showRepositoryListPage();

        Assert.assertEquals("TA-lab_intro_Claremont", listPage.getNameOfFirstRepo());
    }
}

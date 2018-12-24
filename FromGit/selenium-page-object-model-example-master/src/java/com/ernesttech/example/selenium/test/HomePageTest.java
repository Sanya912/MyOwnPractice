package com.ernesttech.example.selenium.test;

import com.ernesttech.example.selenium.page.HomePage;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class HomePageTest extends AbstractPageTest {

    private HomePage homePage;

    public HomePageTest(final WebDriver webDriver, HomePage pageModel) {

        super(webDriver, pageModel);

        this.homePage = pageModel;
    }

    @Override
    public void executeTests() {
        checkDeveloperJobsTitle();
        checkQuestionsTabTitle();
        checkTagsTabTitle();
        checkUsersTabTitle();
    }

    private void checkDeveloperJobsTitle() {
        assertThat(homePage.getNavBarDeveloperJobsButton().getText(), is("Developer Jobs"));
    }

    private void checkQuestionsTabTitle() {
        assertThat(homePage.getNavBarQuestionsButton().getText(), is("Questions"));
    }

    private void checkTagsTabTitle() {
        assertThat(homePage.getNavBarTagsButton().getText(), is("Tags"));
    }

    private void checkUsersTabTitle() {
        assertThat(homePage.getNavBarUsersButton().getText(), is("Users"));
    }

}

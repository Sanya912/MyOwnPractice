package com.ernesttech.example.selenium.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage implements PageModel {

    @FindBy(id = "nav-questions")
    private WebElement navBarQuestionsButton;

    @FindBy(id = "nav-jobs")
    private WebElement navBarDeveloperJobsButton;

    @FindBy(id = "nav-tags")
    private WebElement navBarTagsButton;

    @FindBy(id = "nav-users")
    private WebElement navBarUsersButton;

    public WebElement getNavBarQuestionsButton() {
        return navBarQuestionsButton;
    }

    public WebElement getNavBarDeveloperJobsButton() {
        return navBarDeveloperJobsButton;
    }

    public WebElement getNavBarTagsButton() {
        return navBarTagsButton;
    }

    public WebElement getNavBarUsersButton() {
        return navBarUsersButton;
    }


    @Override
    public String getUrl() {

        return "https://stackoverflow.com";
    }

}

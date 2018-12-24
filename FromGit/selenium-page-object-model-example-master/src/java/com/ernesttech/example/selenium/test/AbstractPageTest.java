package com.ernesttech.example.selenium.test;

import com.ernesttech.example.selenium.page.PageModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPageTest implements PageTest {

    private final WebDriver webDriver;

    public AbstractPageTest(WebDriver webDriver, PageModel pageModel) {

        this.webDriver = webDriver;

        navigateToPage(pageModel);

        initPage(webDriver, pageModel);
    }

    protected void initPage(WebDriver webDriver, PageModel pageModel) {
        System.out.println("Initializing elements on page: " + pageModel.getUrl());
        PageFactory.initElements(webDriver, pageModel);
    }

    protected void navigateToPage(PageModel pageModel) {
        System.out.println("Navigating to: " + pageModel.getUrl());

        webDriver.navigate().to(pageModel.getUrl());
    }

}

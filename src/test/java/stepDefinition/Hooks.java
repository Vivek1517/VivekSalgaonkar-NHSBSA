package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import nhs.webPages.BasePage;


public class Hooks extends BasePage {

    @Before
    public void openBrowser(){
        startBrowser(browserType);
    }

    @After
    public void quitBrowser(){
        exit();
    }

}

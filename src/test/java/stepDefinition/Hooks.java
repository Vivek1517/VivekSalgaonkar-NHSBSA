package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import nhs.webPages.BasePage;
import nhs.webPages.HelpWithNHSCost;

public class Hooks extends BasePage {
    HelpWithNHSCost help = new HelpWithNHSCost();
    @Before
    public void openBrowser(){
        startBrowser(browserType);
    }

    @After
    public void quitBrowser(){
        exit();
    }

}

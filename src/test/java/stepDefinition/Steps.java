package stepDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nhs.webPages.NHSCostPage;
import org.junit.Assert;
public class Steps {
    NHSCostPage costPage = new NHSCostPage();
    @Given("user is on what help you can get to pay page")
    public void user_is_on_what_help_you_can_get_to_pay_page() {
        Assert.assertTrue(costPage.isUserOnHelpPayingNHSCostPage());
    }
    @When("user clicks on the start button")
    public void user_clicks_on_the_start_button() {
    costPage.clickStart();
    }
    @Then("user should navigate to select a country")
    public void user_should_navigate_to_select_a_country() {
    Assert.assertTrue(costPage.isUserOnCountryPage());
    }
    @When("user selects {string} and clicks next")
    public void user_selects_and_clicks_next(String country) {
    costPage.selectCountry(country);
    }
    @When("user enters {string}, {string} and {string} and clicks next")
    public void user_enters_and_and_clicks_next(String date, String month, String year) {
    costPage.selectDOB(date,month,year);
    }
    @When("user chooses do you leave with a patner and {string} and clicks next")
    public void user_chooses_do_you_leave_with_a_patner_and_and_clicks_next(String partner) {
    costPage.reUsableMethod(partner);
    }
    @When("user chooses do your partner claim any benefits or tax credits and {string} and click on next")
    public void user_chooses_do_your_partner_claim_any_benefits_or_tax_credits_and_and_click_on_next(String benefit) {
    costPage.reUsableMethod(benefit);
    }
    @When("user choose do you or your partner get universal credit {string} and click on next")
    public void user_choose_do_you_or_your_partner_get_universal_credit_and_click_on_next(String universalC) {
    costPage.doYourPartnerGetUniversalCredit(universalC);
    }
    @When("user chooses as a part of your joint universal credit {string} and click on next")
    public void user_chooses_as_a_part_of_your_joint_universal_credit_and_click_on_next(String universalOption) {
    costPage.reUsableMethod(universalOption);
    }
    @When("user chooses combined take home pay option as {string} and click on next")
    public void user_chooses_combined_take_home_pay_option_as_and_click_on_next(String takeHomePay) {
    costPage.reUsableMethod(takeHomePay);
    }
    @Then("user should navigate to the result page")
    public void user_should_navigate_to_the_result_page() {
    Assert.assertTrue(costPage.isUserOnResultPage());
    costPage.pageContent();
    }
    @And("user choose are you pregnat or have given birth {string} and click on next")
    public void userChooseAreYouPregnatOrHaveGivenBirthAndClickOnNext(String pregnant) {
    costPage.reUsableMethod(pregnant);
    }
    @And("user chooses have any injuries or ilness by working in arm forces {string}, {string} and {string}click on next")
    public void userChoosesHaveAnyInjuriesOrIlnessByWorkingInArmForcesAndClickOnNext(String ilness, String diabetes, String glacoma) {
    costPage.reUsableMethod(ilness);
    costPage.reUsableMethod(diabetes);
    costPage.reUsableMethod(glacoma);
    }
    @And("user chooses does your partner live in a care home {string} and click on next")
    public void userChoosesDoesYourPartnerLiveInACareHomeAndClickOnNext(String careHome) {
    costPage.reUsableMethod(careHome);
    }
    @And("user chooses if they have saving or investements {string} and click on next")
    public void userChoosesIfTheyHaveSavingOrInvestementsAndClickOnNext(String investment) {
    costPage.reUsableMethod(investment);
    }
    @And("user chooses do you get help from council for care home {string} and click on next")
    public void userChoosesDoYouGetHelpFromCouncilForCareHomeAndClickOnNext(String councilHelp) {
    costPage.reUsableMethod(councilHelp);
    }
}

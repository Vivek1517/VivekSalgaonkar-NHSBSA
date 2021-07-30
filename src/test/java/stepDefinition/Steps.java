package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nhs.webPages.HelpWithNHSCost;
import org.junit.Assert;

public class Steps {
    HelpWithNHSCost help = new HelpWithNHSCost();
    @Given("user is on what help you can get to pay page")
    public void user_is_on_what_help_you_can_get_to_pay_page() {
        Assert.assertTrue(help.isUserOnHelpPayingNHSCostPage());
    }
    @When("user clicks on the start button")
    public void user_clicks_on_the_start_button() {
    help.clickStart();
    }
    @Then("user should navigate to select a country")
    public void user_should_navigate_to_select_a_country() {
    Assert.assertTrue(help.isUserOnCountryPage());
    }
    @When("user selects {string} and clicks next")
    public void user_selects_and_clicks_next(String country) {
    help.selectCountry(country);
    }
    @When("user enters {string}, {string} and {string} and clicks next")
    public void user_enters_and_and_clicks_next(String date, String month, String year) {
    help.selectDOB(date,month,year);
    }
    @When("user chooses do you leave with a patner and {string} and clicks next")
    public void user_chooses_do_you_leave_with_a_patner_and_and_clicks_next(String partner) {
    help.reUsableMethod(partner);
    }
    @When("user chooses do your partner claim any benefits or tax credits and {string} and click on next")
    public void user_chooses_do_your_partner_claim_any_benefits_or_tax_credits_and_and_click_on_next(String benefit) {
    help.doYourPartnerClaimBenefit(benefit);
    }
    @When("user choose do you or your partner get universal credit {string} and click on next")
    public void user_choose_do_you_or_your_partner_get_universal_credit_and_click_on_next(String universalC) {
    help.doYourPartnerGetUniversalCredit(universalC);
    }
    @When("user chooses as a part of your joint universal credit {string} and click on next")
    public void user_chooses_as_a_part_of_your_joint_universal_credit_and_click_on_next(String universalOption) {
    help.reUsableMethod(universalOption);
    }
    @When("user chooses combined take home pay option as {string} and click on next")
    public void user_chooses_combined_take_home_pay_option_as_and_click_on_next(String takeHomePay) {
    help.reUsableMethod(takeHomePay);
    }
    @Then("user should navigate to the result page")
    public void user_should_navigate_to_the_result_page() {
    Assert.assertTrue(help.isUserOnResultPage());
    }

    @And("user choose are you pregnat or have given birth {string} and click on next")
    public void userChooseAreYouPregnatOrHaveGivenBirthAndClickOnNext(String pregnant) {
    help.reUsableMethod(pregnant);
    }

    @And("user chooses have any injuries or ilness by working in arm forces {string}, {string} and {string}click on next")
    public void userChoosesHaveAnyInjuriesOrIlnessByWorkingInArmForcesAndClickOnNext(String ilness, String diabetes, String glacoma) {
    help.reUsableMethod(ilness);
    help.reUsableMethod(diabetes);
    help.reUsableMethod(glacoma);
    }

    @And("user chooses does your partner live in a care home {string} and click on next")
    public void userChoosesDoesYourPartnerLiveInACareHomeAndClickOnNext(String careHome) {
    help.reUsableMethod(careHome);
    }

    @And("user chooses if they have saving or investements {string} and click on next")
    public void userChoosesIfTheyHaveSavingOrInvestementsAndClickOnNext(String investment) {
    help.reUsableMethod(investment);
    }

    @And("user chooses do you get help from council for care home {string} and click on next")
    public void userChoosesDoYouGetHelpFromCouncilForCareHomeAndClickOnNext(String councilHelp) {
    help.reUsableMethod(councilHelp);
    }

    @And("user chooses do your partner claim any benefits or tax credits and {string}")
    public void userChoosesDoYourPartnerClaimAnyBenefitsOrTaxCreditsAnd(String benefit) {
    help.doYourPartnerClaimBenefit(benefit);
    }
}

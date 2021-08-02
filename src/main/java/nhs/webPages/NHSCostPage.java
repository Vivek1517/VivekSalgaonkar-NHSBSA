package nhs.webPages;
import nhs.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NHSCostPage extends BasePage{
    public NHSCostPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="next-button")
    WebElement next;
    @FindBy(className="heading-group")
    WebElement verifyPage;
    @FindBy(css = "#label-wales")
    WebElement selectWales;
    @FindBy(css="#dob-day")
    WebElement inputDate;
    @FindBy(css="#dob-month")
    WebElement inputMonth;
    @FindBy(css="#dob-year")
    WebElement inputYear;
    @FindBy(css="#label-yes")
    WebElement yes;
    @FindBy(css="#label-no")
    WebElement no;
    @FindBy(className = "column-two-thirds")
    WebElement resultPage;
    @FindBy(id="question-heading")
    WebElement userOnCountryPage;
    @FindBy(css="label[for=yes-universal]")
    WebElement universalCredit;
    @FindBy(css="label[for=not-yet]")
    WebElement notYetUniversalCredit;

    public boolean isUserOnHelpPayingNHSCostPage(){
        return Util.isDisplayed(verifyPage);
    }
    public void clickStart(){
        Util.click(next);
    }
    public boolean isUserOnCountryPage(){
        return Util.isDisplayed(userOnCountryPage);
    }
    public void selectCountry(String country){
        if(country.equalsIgnoreCase("Wales")){
            Util.click(selectWales);
            Util.click(next);
        }
        else{
            System.out.println("Country not found");
        }
    }
    public void selectDOB(String date, String month, String year){
        Util.sendKeys(inputDate,date);
        Util.sendKeys(inputMonth,month);
        Util.sendKeys(inputYear, year);
        Util.click(next);
    }
    public void selectOption(String text){
        if(text.equalsIgnoreCase("yes")) {
            Util.click(yes);
            Util.click(next);
        }
        else if(text.equalsIgnoreCase("no")){
            Util.click(no);
            Util.click(next);
        }
    }
    public void doYourPartnerGetUniversalCredit(String text){
        if(text.equalsIgnoreCase("yes")) {
            Util.click(universalCredit);
            Util.click(next);

        }
        else if(text.equalsIgnoreCase("not")){
            Util.click(notYetUniversalCredit);
            Util.click(next);
        }
    }
    public boolean isUserOnResultPage(){
       return Util.isDisplayed(resultPage);
    }
    public void pageContent(){
        String page = driver.findElement(By.className("column-two-thirds")).getText();
        System.out.println(page);
    }

}

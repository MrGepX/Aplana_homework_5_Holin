import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.util.ArrayList;

public class HomeWorkTestClass extends DriverController {
    @Test
    public void homeWorkTest() {
        clickElementByPath(HomeworkData.insuranceXpath);
        clickElementByPath(HomeworkData.touristsInsuranceXpath);
        clickElementByPath(HomeworkData.bannerXpath);

        checkTheTitle(HomeworkData.expectedTitle);

        ArrayList<String> tabs = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(1));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomeworkData.polisCheckForWaitingXpath)));
        clickElementByPath(HomeworkData.chooseTypeOfInsuranceXpath);
        clickElementByPath(HomeworkData.toIssueButtonXpath);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomeworkData.continueButtonXpath)));

        inputData(HomeworkData.insuredNameXpath, HomeworkData.insuredName);
        inputData(HomeworkData.insuredSurNameXpath, HomeworkData.insuredSurName);
        inputData(HomeworkData.insuredBirthdateXpath, HomeworkData.insuredBirthdate);
        inputData(HomeworkData.policyHolderNameXpath, HomeworkData.policyHolderName);
        inputData(HomeworkData.policyHolderSurnameXpath, HomeworkData.policyHolderSurname);
        inputData(HomeworkData.policyHolderMiddleNameXpath, HomeworkData.policyHolderMiddleName);
        inputData(HomeworkData.getPolicyHolderBirthDateXpath, HomeworkData.getPolicyHolderBirthDate);
        inputData(HomeworkData.passportSerialXpath, HomeworkData.passportSerial);
        inputData(HomeworkData.passportNumberXpath, HomeworkData.passportNumber);
        inputData(HomeworkData.dateXpath, HomeworkData.date);
        inputData(HomeworkData.byXpath, HomeworkData.by);

        element = getDriver().findElement(By.xpath(HomeworkData.genderSelecterXpath));
        element.click();

        checkData(HomeworkData.insuredNameXpath, HomeworkData.insuredName);
        checkData(HomeworkData.insuredSurNameXpath, HomeworkData.insuredSurName);
        checkData(HomeworkData.insuredBirthdateXpath, HomeworkData.insuredBirthdate);
        checkData(HomeworkData.policyHolderNameXpath, HomeworkData.policyHolderName);
        checkData(HomeworkData.policyHolderSurnameXpath, HomeworkData.policyHolderSurname);
        checkData(HomeworkData.policyHolderMiddleNameXpath, HomeworkData.policyHolderMiddleName);
        checkData(HomeworkData.getPolicyHolderBirthDateXpath, HomeworkData.getPolicyHolderBirthDate);
        checkData(HomeworkData.passportSerialXpath, HomeworkData.passportSerial);
        checkData(HomeworkData.passportNumberXpath, HomeworkData.passportNumber);
        checkData(HomeworkData.dateXpath, HomeworkData.date);
        checkData(HomeworkData.byXpath, HomeworkData.by);

        element = getDriver().findElement(By.xpath(HomeworkData.continueButtonXpath));
        element.click();

        Assert.assertEquals(getDriver().findElement(By.xpath(HomeworkData.warningXpath)).getText(), HomeworkData.warningText);
    }
}

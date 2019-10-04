public final class HomeworkData {

    static String insuranceXpath = "//span [contains(text(), 'Страхование')]";
    static String touristsInsuranceXpath = "//a [contains(@class, 'sub-link') and contains(text(), 'Страхование путешественников')]";
    static String bannerXpath = "//img [contains(@src,'banner-zashita')]";
    static String polisCheckForWaitingXpath = "//span [contains(@class, 'b-form-profitably-btn')]";
    static String chooseTypeOfInsuranceXpath = "//div [contains(@class, 'b-form-box') and contains(text(), 'Минимальная')]";
    static String toIssueButtonXpath = "//span [contains(@class, 'b-continue-btn')]";
    static String continueButtonXpath = "//span [contains(@class, 'b-continue-btn') and contains(text(), 'Продолжить')]";

    static String expectedTitle = "Страхование путешественников";
    static String insuredNameXpath = "//input [@name = 'insured0_name']";
    static String insuredSurNameXpath = "//input [@name = 'insured0_surname']";
    static String insuredBirthdateXpath = "//input [@name = 'insured0_birthDate']";
    static String policyHolderNameXpath = "//input [@name = 'surname']";
    static String policyHolderSurnameXpath = "//input [@name = 'name']";
    static String policyHolderMiddleNameXpath = "//input [@name = 'middlename']";
    static String getPolicyHolderBirthDateXpath = "//input [@name = 'birthDate']";
    static String passportSerialXpath = "//input [@name = 'passport_series']";
    static String passportNumberXpath = "//input [@name = 'passport_number']";
    static String dateXpath = "//input [@name = 'issueDate']";
    static String byXpath = "//textarea [@name = 'issuePlace']";
    static String insuredName = "PETR";
    static String insuredSurName = "PETROV";
    static String insuredBirthdate = "10.05.1992";
    static String policyHolderName = "Петров";
    static String policyHolderSurname = "Вася";
    static String policyHolderMiddleName = "Петрович";
    static String getPolicyHolderBirthDate = "10.02.1985";
    static String passportSerial = "2515";
    static String passportNumber = "033345";
    static String date = "19.03.2019";
    static String by = "ОУФМС России по области в жигаловском районе";

    static String warningXpath = "//div [contains(@ng-show, 'invalid') and contains(text(), 'Заполнены не все обязательные поля')]";
    static String warningText = "Заполнены не все обязательные поля";


    static String genderSelecterXpath = "//input [@name = 'female']";
}

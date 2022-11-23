package tests;

import driver.DriverFactory;
import models.components.global.footer.*;
import models.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import url.Urls;

public class DemoHomePageTest implements Urls {

    @Test

    public void testFooter() {
        WebDriver driver = DriverFactory.getChromeDriver();

        try {
            // navigate to the target page
            driver.get(Urls.BASE_URL);

            HomePage homePage = new HomePage(driver);
            FooterComponent footerComp = homePage.footerComponent();
            InformationColumn informationColumn = footerComp.informationColumn();
            CustomerServiceColumn customerServiceColumn = footerComp.customerServiceColumn();
            MyAccountColumn myAccountColumn = footerComp.myAccountColumn();
            FollowUsColumn followUsColumn = footerComp.followUsColumn();

            System.out.println(informationColumn.headerElem().getText());
            System.out.println(customerServiceColumn.headerElem().getText());
            System.out.println(myAccountColumn.headerElem().getText());
            System.out.println(followUsColumn.headerElem().getText());

            // input login creds
//            HerokuLoginPage loginPage = new HerokuLoginPage(driver);
//           System.out.println(loginPage.footerComponent().getLinkText());

            //Debug purpose only
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
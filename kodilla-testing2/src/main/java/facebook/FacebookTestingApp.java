package facebook;

import config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_WAIT_FOR = "//div[@class=\"_5k_5\"]";
    public static final String XPATH_SELECT_DAY = "//span[@class=\"_5k_4\"]/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//span[@class=\"_5k_4\"]/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//span[@class=\"_5k_4\"]/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");


        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed()) ;

        WebElement selectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectBoardDay = new Select(selectDay);
        selectBoardDay.selectByValue("9");

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectBoardMonth = new Select(selectMonth);
        selectBoardMonth.selectByValue("3");

        WebElement selectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectBoardYear = new Select(selectYear);
        selectBoardYear.selectByValue("1989");
    }

}

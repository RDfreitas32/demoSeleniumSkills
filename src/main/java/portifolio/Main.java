package portifolio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rodrigofreitas\\OneDrive - Sistran\\Documentos\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        Duration maxWait = Duration.ofSeconds(60);
        WebDriverWait wait = new WebDriverWait(driver, maxWait);

        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Register.html");

        // Verifying if the page is ready:
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section/div/h2"))).getAttribute("Register");

        System.out.println("Everything Working Well, lets Start!!");

        driver.findElement(By.cssSelector("input[ng-model='FirstName']")).sendKeys("Tom");
        driver.findElement(By.cssSelector("input[ng-model='LastName'")).sendKeys("Hanks");
        driver.findElement((By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea"))).sendKeys("""
                123 Main Street
                Anytown, CA 12345
                USA""");

        driver.findElement(By.cssSelector("input[ng-model='EmailAdress']")).sendKeys("hankstom@gmail.com");
        driver.findElement(By.cssSelector("input[ng-model='Phone']")).sendKeys("4085551234");

        driver.findElement(By.cssSelector("input[ng-model='radiovalue'")).click();


        //Hobbies
        driver.findElement((By.id("checkbox2"))).click();

        driver.findElement((By.xpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[1]"))).click();
        Thread.sleep(1000);
        driver.findElement((By.xpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[2]/ul/li[8]/a"))).click();

        //choosing Java Skill
        WebElement selectElementSkill = driver.findElement((By.cssSelector("select[ng-model='Skill']")));
        Select selectSkill = new Select(selectElementSkill);
        selectSkill.selectByVisibleText("Java");

        //driver.findElement(By.cssSelector(""));

        /*WebElement selectElementCounty = driver.findElement(By.cssSelector("select[ng-model='country'"));
        Select selectCountry = new Select(selectElementCounty);
        selectCountry.selectByVisibleText("Select Country");*/

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        driver.findElement(By.cssSelector("span.select2-selection.select2-selection--single")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input"))).sendKeys("United States of America");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[2]/ul/li"))).click();

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        WebElement selectElementYear = driver.findElement(By.cssSelector("select[ng-model='yearbox']"));
        Select selectYear = new Select((selectElementYear));
        selectYear.selectByVisibleText("1980");

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        WebElement selectElementMonth = driver.findElement(By.cssSelector("select[ng-model='monthbox']"));
        Select selectMonth = new Select((selectElementMonth));
        selectMonth.selectByVisibleText("February");

        WebElement selectElementDay = driver.findElement(By.cssSelector("select[ng-model='daybox']"));
        Select selectDay = new Select((selectElementDay));
        selectDay.selectByVisibleText("4");

        driver.findElement(By.id("firstpassword")).sendKeys("code1234");
        driver.findElement(By.id("secondpassword")).sendKeys("code1234");

        Thread.sleep(5000);
        driver.findElement(By.id("submitbtn")).click();








        System.out.println("Everything Working Well, lets Continue!!");
        Thread.sleep(10000);
        driver.quit();
    }
}
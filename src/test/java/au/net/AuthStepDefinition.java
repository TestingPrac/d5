package au.net;

import io.appium.java_client.windows.WindowsDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
public class AuthStepDefinition {
    public static String code = "";
    public static WindowsDriver driver = null;

    public static void main(String[] args) throws Exception {
//        DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setCapability("app", "C:\\my files\\WinAuth-3.5.1\\WinAuth.exe");
//        driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), cap);
//        driver.findElementByClassName("WindowsForms10.EDIT.app.0.2a125d8_r17_ad1").sendKeys("ajiAMMU13@BABY");
//        driver.findElementByName("OK").click();
//        Thread.sleep(2000);
//        Actions actions = new Actions(driver);
//        actions.contextClick(driver.findElementByName("WinAuth.AuthenticatorListitem")).perform();
//        driver.findElementByName("Show Code").click();
//        Thread.sleep(2000);
//        actions.contextClick(driver.findElementByName("WinAuth.AuthenticatorListitem")).perform();
//        driver.findElementByName("Copy Code").click();
//        code = Keys.chord(Keys.CONTROL, "v");
//        driver.quit();

        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
//        driver1.get("https://www.myatos.net/irj/portal");
//        driver1.get("https://gitlab.com/groups/atosbps/-/saml/sso?redirect=%2Fatosbps&token=_nuQ8gLU");
        driver1.get("https://atosbps.gitlab.io/dev-teams/nest-portal/nest-portal-ui-frontend/?path=/story/pages-deathdetermination-contactdetails--default");
//        driver1.findElement(By.xpath("//button[@form='formTotp']")).click();
//        driver1.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("A842074");
//        driver1.findElement(By.xpath("//input[@type='password']")).sendKeys("AJIAMMU13@baby");
//        driver1.findElement(By.xpath("//input[@type='text'][2]")).sendKeys(code);
//        String getCode = driver1.findElement(By.xpath("//input[@type='text'][2]")).getAttribute("value");
//        System.out.println(getCode);
//        if(getCode.length()!=6){
//            driver1.findElement(By.xpath("//input[@type='text'][2]")).sendKeys(Keys.BACK_SPACE);
//        }
//       driver1.findElement(By.xpath("//input[@value='Login']")).click();
      //  driver1.quit();
        //Reporter.addStepLog("<textarea>" + response.asString() + "</textarea>");












     /*   StringBuffer alpha = new StringBuffer(), num = new StringBuffer(), special = new StringBuffer();

        for (int i=0; i<Keys.chord(Keys.CONTROL, "v").length(); i++)
        {
            if (Character.isDigit(Keys.chord(Keys.CONTROL, "v").charAt(i)))
                num.append(Keys.chord(Keys.CONTROL, "v").charAt(i));
            else if(Character.isAlphabetic(code.charAt(i)))
                alpha.append(Keys.chord(Keys.CONTROL, "v").charAt(i));
            else
                special.append(Keys.chord(Keys.CONTROL, "v").charAt(i));
        }

        System.out.println(alpha);
        System.out.println(num);
        System.out.println(special);*/



        /*byte[] bytes = code.getBytes(StandardCharsets.US_ASCII);
        String utf = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(utf);*/


/*
        DesiredCapabilities cap1 = new DesiredCapabilities();
        cap1.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
        driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), cap1);
        Thread.sleep(2000);
        driver.findElementByName("Text Editor").sendKeys(code);
        String editor = driver.findElementByName("Text Editor").getAttribute("Value.Value");
        System.out.println(editor);*/

/*

        FileWriter file=new FileWriter("src\\test\\resources\\data.txt");
        BufferedWriter writer=new BufferedWriter(file);
        writer.write(code);
         writer.close();

        String fileName = "src\\test\\resources\\data.txt";
        File file1 = new File(fileName);
        FileReader fr = new FileReader(file1);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            //process the line
            System.out.println(line);
        }*/


    }
}
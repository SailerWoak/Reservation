package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseFunk {
   private WebDriver browser;

   public BaseFunk() {
       System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
       browser = new ChromeDriver();
       browser.manage().window().maximize();
   }

    public void goToPage(String url){
        if (!url.contains("http://")&& !url.contains("https://")){ //проверка есть ли http &&-and or =
            url = "http://" + url;
        }
        browser.get(url);
    }
}

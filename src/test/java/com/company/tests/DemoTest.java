package com.company.tests;

import com.company.config.ConfigFactory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class DemoTest {

    protected WebDriver driver;

    @Test
    public void testLogin(){
        System.out.println(ConfigFactory.getConfig().browser());

      /*  driver = WebDriverManager.chromedriver().create();
        driver.get("http://teststore.automationtesting.co.uk/");
        driver.quit();*/
    }

}

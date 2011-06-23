package org.seleniumhq;

/**
 * @author <a href="mailto:kristian@zenior.no">Kristian Rosenvold</a>
 */

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import org.junit.Test;


public class NewTest {

    @Test
    public void testNew() throws Exception {
        Selenium selenium = new DefaultSelenium("localhost", 4444, "*opera", "http://www.google.com/");
        selenium.start();
        selenium.open("/");
        selenium.type("q", "selenium rc");
        selenium.click("btnG");
        selenium.close();
        selenium.stop();
    }
}

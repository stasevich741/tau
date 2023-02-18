package first_block;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
public class WithConfigurationTest {
    private WebDriver driver;

    @BeforeEach
    public void beforeAll() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

    @Test
    public void justAtest() {
        driver.get("https://example.com");
        assertEquals("Example domain",driver.getTitle());
    }
}

package runetologyselenide;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

class SelenideTest {

    @Test
    void validTest() {
        Configuration.holdBrowserOpen = true;
        open("http://localhost:9999");
        $("[placeholder=\"Город\"]").setValue("Москва");
        $x("input[placeholder=\"Дата встречи\"]");
        $("[name=\"name\"]").setValue("Иван Петров-Иванов");
        $("[name=\"phone\"]").setValue("+79119526138");
        $("[data-test-id='agreement']").click();
        $x("//span[@class=\"button__text\"]").click();
        String texts = $("[data-test-id=\"notification\"]").getText();
    }
}

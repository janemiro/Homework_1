import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class AutoSearch {
    @Test
    void selenideSearchTest() {
        open("https://yandex.ru/");

        $(byId("text")).setValue("попячтса").pressEnter();

        $("#search-result").shouldHave(text("Упячка"));
    }
}

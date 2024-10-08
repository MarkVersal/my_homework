package secondHomework_GitHub;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.files.DownloadActions.click;

public class GitHubPractice {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com/";
    }

    @Test
    void gitHubPractice() {
        open("/selenide/selenide");
$("#wiki-tab").click();
$("#wiki-pages-filter").setValue("SoftAssertions");
$(".filterable-active").shouldHave(text("SoftAssertions"));
$(byText("SoftAssertions")).click();
$(".markdown-body").shouldHave(text("Using JUnit5 extend test class:"));
    }
}

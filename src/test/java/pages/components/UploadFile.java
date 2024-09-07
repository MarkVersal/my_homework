package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class UploadFile {
    public void chooseFile() {
        $("#uploadPicture").uploadFromClasspath("pictures/test.png");
    }
}

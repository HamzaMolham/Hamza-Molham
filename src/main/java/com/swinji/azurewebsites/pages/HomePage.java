package pages;

import com.swinji.azurewebsites.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;

public class HomePage extends Base {

    @FindBy(css = "[title=\" Courses\"]")
    WebElement CourseButton;

    public CoursesPage ClickCourseButton () {
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        CourseButton.click();
        return new CoursesPage();
    }
}

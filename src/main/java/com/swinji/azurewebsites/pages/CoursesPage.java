package pages;

import com.swinji.azurewebsites.base.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;

public class CoursesPage extends Base {

    @FindBy(id = "btnListAddCourse")
    WebElement AddCourse;

    @FindBy(id = "courseSubject")
    WebElement Subject;

    @FindBy(id = "courseGrade")
    WebElement Grade;

    @FindBy(id = "txtCourseName")
    WebElement CourseName;

    @FindBy(css = "[placeholder=\"Course Teacher\"]")
    WebElement Teacher;

    @FindBy(css = "[title=\"Test Teacher\"]")
    WebElement SelectTecher;

    @FindBy(className = "lms-position-relative-imp")
    WebElement Radiobuttons;

    @FindBy(id = "btnSaveAsDraftCourse")
    WebElement Create;

    @FindBy(id = "btnMyCoursesList")
    WebElement CourseButton;

    @FindBy(id = "txtCourseSearch")
    WebElement Search;

    @FindBy(linkText = "Poca")
    WebElement Assertion;

    public void clickAddCourse(){

        AddCourse.click();
    }
public void FillCourseData(String course){
        CourseName.sendKeys(course);
    Select subjectValue = new Select(Subject);
    subjectValue.selectByVisibleText("Mathematics");
    Select grade = new Select(Grade);
    grade.selectByIndex(8);
    Teacher.click();
    SelectTecher.click();
    Radiobuttons.click();
    Create.click();
}
public void Assertions(String course){
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        CourseButton.click();
        Search.sendKeys(course);
        Search.sendKeys(Keys.ENTER);
    Assert.assertTrue(Assertion.isDisplayed());
    driver.quit();

}


}

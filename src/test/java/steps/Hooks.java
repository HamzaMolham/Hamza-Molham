package steps;

import com.SauceDemo.base.Base;
import io.cucumber.java.After;

public class Hooks extends Base {

    @After
    public void runsAfterAnyScenario(){

        driver.quit();

    }
}

package pages;

import org.testng.annotations.Test;

public class DashboardPage extends BaseTest{
    @Test
    public void testDashboardPage(){
        startTest().login();
    }
}

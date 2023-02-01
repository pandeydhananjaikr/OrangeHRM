import com.orangeHRM.DriverUtility.BrowserManager;
import com.orangeHRM.Pages.*;

import static com.orangeHRM.DriverUtility.BrowserManager.driverQuit;
import static com.orangeHRM.Pages.SignInPage.*;


public class test extends BrowserManager{
    public static void main(String[] args) throws InterruptedException {

        driverInit("chrome");
        SignInPage signinpage = new SignInPage();
        HomePage homepage = signinpage.enterUsername("Admin").enterPassword("admin123").clickLogin();

        homepage.selectPIM();
        PIM_Page pimpage = new PIM_Page();
        pimpage.SearchByEmpName("Anthony").searchButton();

        homepage.selectLeave();
        Leave_Page leavepage = new Leave_Page();
        leavepage.searchButton();

        homepage.selectTime();
        TimeSheetpage timeSheetpage = new TimeSheetpage();
        //timeSheetpage.ViewByEmpName("Anthony").viewButton();
        timeSheetpage.viewButton();

        Thread.sleep(5000);
        driverQuit();
    }
}

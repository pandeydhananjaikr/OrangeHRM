import com.orangeHRM.Constants.ConfigConstant;
import com.orangeHRM.DriverUtility.BrowserManager;
import com.orangeHRM.Pages.*;
import com.orangeHRM.Utilities.ReadConfig;
import java.io.IOException;

public class TestRunner extends BrowserManager {
    public static void main(String[] args) throws InterruptedException, IOException {

        driverInit();
        SignInPage signinpage = new SignInPage();
        HomePage homepage = signinpage
                .enterUsername(ReadConfig.readConfigFile(ConfigConstant.USERNAME))
                .enterPassword(ReadConfig.readConfigFile(ConfigConstant.PASSWORD))
                .clickLogin();

        homepage.selectPIM();
        PIM_Page pimpage = new PIM_Page();
        pimpage.SearchByEmpName("Anthony").searchButton();

        homepage.selectLeave();
        Leave_Page leavepage = new Leave_Page();
        leavepage.searchButton();

        homepage.selectTime();
        TimeSheetpage timeSheetpage = new TimeSheetpage();
//     //   timeSheetpage.ViewByEmpName("Anthony").viewButton();
//        timeSheetpage.viewButton();

        Thread.sleep(5000);
        driverQuit();
    }
}

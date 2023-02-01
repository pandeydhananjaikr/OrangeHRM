import org.testng.annotations.*;


public class TestRunner {

    @BeforeMethod
    public void before(){
        System.out.println("@BeforeMethod annote");
    }

    @Test
    public void test(){
        System.out.println("@Test annote");


    }
}


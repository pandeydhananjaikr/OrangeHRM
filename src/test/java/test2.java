import org.testng.annotations.*;


public class test2 {

    @BeforeMethod
    public void before(){
        System.out.println("@BeforeMethod annotate");
    }

    @AfterMethod
    public void after(){
        System.out.println("@AfterMethod annotate");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("@AfterClass annotate");
    }


    @BeforeClass
    public void beforeclass(){
        System.out.println("@BeforeClass annotate");
    }

    @Test(priority = 1)
    public void test(){
        System.out.println("@Test annotate1");

    }

    @Test(priority = 3)
    public void test1(){
        System.out.println("@Test annotate3");

    }

    @Test(priority = 2)
    public void test2(){
        System.out.println("@Test annotate2");

    }


    }


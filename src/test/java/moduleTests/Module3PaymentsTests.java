package moduleTests;

import org.testng.annotations.Test;

public class Module3PaymentsTests {
    @Test(groups = {"smoke", "regression", "Payments"})
    public void module3PaymentsTestsTest1(){
        System.out.print("module3PaymentsTestsTest1...........");
        assert true;
    }

    @Test(groups = {"smoke", "regression", "Payments"})
    public void module3PaymentsTestsTest2(){
        System.out.print("module3PaymentsTestsTest2...........");
        assert true;
    }

    @Test(groups = {"smoke", "regression", "Payments"})
    public void module3PaymentsTestsTest3(){
        System.out.print("module3PaymentsTestsTest3...........");
        assert false;
    }

    @Test(groups = {"smoke", "regression", "Payments"},
            dependsOnMethods = "module3PaymentsTestsTest3")
    public void module3PaymentsTestsTest4(){
        System.out.print("module3PaymentsTestsTest4...........");
    }

    @Test(groups = {"smoke", "regression", "Payments"})
    public void module3PaymentsTestsTest5(){
        System.out.print("module3PaymentsTestsTest5...........");
    }

}

package moduleTests;

import org.testng.annotations.Test;

public class Module2AccountsTests {
    @Test(groups = {"smoke", "regression", "Accounts"})
    public void module2AccountsTestsTest1(){
        System.out.print("module2AccountsTestsTest1...........");
        assert true;
    }

    @Test(groups = {"smoke", "regression", "Accounts"})
    public void module2AccountsTestsTest2(){
        System.out.print("module2AccountsTestsTest2...........");
        assert true;
    }

    @Test(groups = { "regression", "Accounts"},
            dependsOnMethods = "module2AccountsTestsTest2")
    public void module2AccountsTestsTest3(){
        System.out.print("module2AccountsTestsTest3...........");
        assert false;
    }

    @Test(groups = {"smoke", "regression", "Accounts"},
            dependsOnMethods = "module2AccountsTestsTest3")
    public void module2AccountsTestsTest4(){
        System.out.print("module2AccountsTestsTest4...........");
        assert true;
    }

    @Test(groups = {"regression", "Payments"})
    public void module2AccountsTestsTest5(){
        System.out.print("module2AccountsTestsTest5...........");
        assert true;
    }

}

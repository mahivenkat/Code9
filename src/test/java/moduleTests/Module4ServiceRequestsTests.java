package moduleTests;

import org.testng.annotations.Test;

public class Module4ServiceRequestsTests {
    @Test(groups = {"smoke", "regression", "ServiceRequests"})
    public void module4ServiceRequestsTestsTest1(){
        System.out.print("module4ServiceRequestsTestsTest1...........");
        assert true;
    }

    @Test(groups = {"smoke", "regression", "ServiceRequests"})
    public void module4ServiceRequestsTestsTest2(){
        System.out.print("module4ServiceRequestsTestsTest2...........");
        assert true;
    }

    @Test(groups = {"smoke", "regression", "ServiceRequests"},
            dependsOnMethods = "module4ServiceRequestsTestsTest4")
    public void module4ServiceRequestsTestsTest3(){
        System.out.print("module4ServiceRequestsTestsTest3...........");
        assert true;
    }

    @Test(groups = {"smoke", "regression", "ServiceRequests"})
    public void module4ServiceRequestsTestsTest4(){
        System.out.print("module4ServiceRequestsTestsTest4...........");
        assert true;
    }

    @Test(groups = {"smoke", "regression", "ServiceRequests"})
    public void module4ServiceRequestsTestsTest5(){
        System.out.print("module4ServiceRequestsTestsTest5...........");
        assert true;
    }

}

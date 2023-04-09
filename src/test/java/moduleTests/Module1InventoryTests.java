package moduleTests;

import org.testng.annotations.Test;

public class Module1InventoryTests {

    @Test(groups = {"smoke", "regression", "inventory"})
    public void module1InventoryTestsTest1(){
        System.out.print("module1InventoryTestsTest1...........");
        assert true;
    }

    @Test(groups = {"smoke", "regression", "inventory"})
    public void module1InventoryTestsTest2(){
        System.out.print("module1InventoryTestsTest2...........");
        assert false;
    }

    @Test(groups = {"smoke", "regression", "inventory"},
            dependsOnMethods = "module1InventoryTestsTest2")
    public void module1InventoryTestsTest3(){
        System.out.print("module1InventoryTestsTest3...........");
    }

    @Test
    public void module1InventoryTestsTest4(){
        System.out.print("module1InventoryTestsTest4...........");
    }

    @Test
    public void module1InventoryTestsTest5(){
        System.out.print("module1InventoryTestsTest5...........");
    }

}

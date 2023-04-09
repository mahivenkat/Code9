package models;

import java.util.Date;
import java.util.List;

public class Inventory {
    private String inventoryId;
    private Date inventoryStartDate;

    @Override
    public String toString() {
        return "Inventory{" +
                "inventoryId='" + inventoryId + '\'' +
                ", inventoryStartDate=" + inventoryStartDate +
                ", inventoryEndDate=" + inventoryEndDate +
                ", listOfSubInventory=" + listOfSubInventory +
                '}';
    }

    private Date inventoryEndDate;
    private List<SubInventory> listOfSubInventory;


    public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Date getInventoryStartDate() {
        return inventoryStartDate;
    }

    public void setInventoryStartDate(Date inventoryStartDate) {
        this.inventoryStartDate = inventoryStartDate;
    }

    public Date getInventoryEndDate() {
        return inventoryEndDate;
    }

    public void setInventoryEndDate(Date inventoryEndDate) {
        this.inventoryEndDate = inventoryEndDate;
    }

    public List<SubInventory> getListOfSubInventory() {
        return listOfSubInventory;
    }

    public void setListOfSubInventory(List<SubInventory> listOfSubInventory) {
        this.listOfSubInventory = listOfSubInventory;
    }


}

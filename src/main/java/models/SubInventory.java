package models;

public class SubInventory {
    private String deviceName;
    private String internalMemory;
    private String externalMemory;
    private String color;

    private String companyName;
    private String manufacturedYear;

    public SubInventory(String deviceName, String internalMemory, String externalMemory, String color, String companyName, String manufacturedYear) {
        this.deviceName = deviceName;
        this.internalMemory = internalMemory;
        this.externalMemory = externalMemory;
        this.color = color;
        this.companyName = companyName;
        this.manufacturedYear = manufacturedYear;
    }


    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getInternalMemory() {
        return internalMemory;
    }

    public void setInternalMemory(String internalMemory) {
        this.internalMemory = internalMemory;
    }

    public String getExternalMemory() {
        return externalMemory;
    }

    public void setExternalMemory(String externalMemory) {
        this.externalMemory = externalMemory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(String manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }

    @Override
    public String toString() {
        return "SubInventory{" +
                "deviceName='" + deviceName + '\'' +
                ", internalMemory='" + internalMemory + '\'' +
                ", externalMemory='" + externalMemory + '\'' +
                ", color='" + color + '\'' +
                ", companyName='" + companyName + '\'' +
                ", manufacturedYear='" + manufacturedYear + '\'' +
                '}';
    }


}

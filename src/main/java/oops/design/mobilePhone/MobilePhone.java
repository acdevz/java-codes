package oops.design.mobilePhone;

public class MobilePhone {
    private int imeiNumber;
    private String brandName;

    public MobilePhone(int imeiNumber, String brand){
        this.imeiNumber = imeiNumber;
        this.brandName = brand;
    }

    public int getImeiNumber() {
        return imeiNumber;
    }
    public String getBrand() {
        return brandName;
    }

}

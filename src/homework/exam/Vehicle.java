package homework.exam;
public abstract  class Vehicle {
    private String num;
    private String brand;
    private double rent;
    private String type;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Vehicle() {
    }

    //含参构造
    public Vehicle(String num, String brand, double rent, String type) {
        this.num = num;
        this.brand = brand;
        this.rent = rent;
        this.type = type;
    }
}
package homework.exam;

public class Cars extends Vehicle {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Cars(String brand, String type) {
        this.type = type;
    }


    public Cars(String num, String brand, double rent, String type) {
        super(num, brand, rent, type);
        this.type = type;
    }
}

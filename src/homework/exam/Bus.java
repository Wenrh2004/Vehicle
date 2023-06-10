package homework.exam;

public class Bus extends Vehicle {
    private String seat;


    public String getSeat() {
        return seat;
    }


    public void setSeat(String seat) {
        this.seat = seat;
    }

    public Bus(String num, String brand, double rent, String seat, String type) {
        super(num, brand, rent, type);
        this.seat = seat;
    }
}
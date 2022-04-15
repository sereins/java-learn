package pers.sereins.design.create.generator;

public class CarProduct {

    private String color ;

    private int seat;

    private int wheelNumber;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    @Override
    public String toString() {
        return "CarProduct{" +
                "color='" + color + '\'' +
                ", seat=" + seat +
                ", wheelNumber=" + wheelNumber +
                '}';
    }
}

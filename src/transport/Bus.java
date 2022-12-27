package transport;

public class Bus extends Transport{
    public Bus(String mark, String model, int year, String country, String color, int maxSpeed) {
        super(mark, model, year, country, color, maxSpeed);
    }

    @Override
    public String toString() {
        System.out.println("mark: " + getMark() +
                ", model: " + getModel() +
                ", year: " + getYear() +
                ", country: " + getCountry() +
                ", color: " + getColor() +
                ", maxSpeed: " + getMaxSpeed());
        return null;
    }

    @Override
    public void refill() {
        System.out.println("заправляю ваш автобус бензином");
    }
}

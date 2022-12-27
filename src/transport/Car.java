package transport;

public class Car extends Transport{
    private final int type;
    // 0 = обычная машина, 1 = электрокар
    public Car(String mark, String model, int year, String country, String color, int maxSpeed,int type) {
        super(mark, model, year, country, color, maxSpeed);
        if (type <0 || type > 1){
            this.type = 0;
        }else{
            this.type = type;
        }
    }

    public int getType() {
        return type;
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
        if (getType() == 1){
            System.out.println("заряжаю ваш электрокар на специальной парковке");
        }else{
            System.out.println("заправляю ваш автомобиль бензином");
        }
    }
}


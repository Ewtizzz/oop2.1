package transport;

public class Train extends Transport{

    private int cost;
    private int time;
    private String fromStation;
    private String toStation;
    private int wagonsAmount;

    public Train(String mark, String model, int year, String country, String color, int maxSpeed, int cost, int time, String fromStation, String toStation, int wagonsAmount) {
        super(mark, model, year, country, color, maxSpeed);
        if(cost <= 0){
            this.cost = 0;
        }else{
            this.cost = cost;
        }
        if(time <= 0){
            this.time = 0;
        }else{
            this.time = time;
        }
        if(fromStation == null || fromStation.isEmpty()){
            this.fromStation = "DEFAULT_FROMSTATION";
        }else{
            this.fromStation = fromStation;
        }
        if(toStation == null || toStation.isEmpty()){
            this.toStation = "DEFAULT_FROMSTATION";
        }else{
            this.toStation = toStation;
        }
        if(wagonsAmount <= 0){
            this.wagonsAmount = 0;
        }else{
            this.wagonsAmount = wagonsAmount;
        }
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getFromStation() {
        return fromStation;
    }

    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }

    public String getToStation() {
        return toStation;
    }

    public void setToStation(String toStation) {
        this.toStation = toStation;
    }

    public int getWagonsAmount() {
        return wagonsAmount;
    }

    public void setWagonsAmount(int wagonsAmount) {
        this.wagonsAmount = wagonsAmount;
    }

    public String toString(){
        System.out.println("mark: " + getMark() +
                ", model: " + getModel() +
                ", year: " + getYear() +
                ", country: " + getCountry() +
                ", color: " + getColor() +
                ", maxSpeed: " + getMaxSpeed() +
                ", cost: " + getCost() +
                ", time: " + getTime() +
                ", fromStation: " + getFromStation() +
                ", toStation: " + getToStation() +
                ", wagonsAmount: " + getWagonsAmount());
        return null;
    }

    @Override
    public void refill() {
        System.out.println("заправляю ваш поезд дизелем");
    }
}

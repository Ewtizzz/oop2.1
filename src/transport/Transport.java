package transport;

public abstract class Transport {
    private String mark;
    private String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public Transport(String mark, String model, int year, String country, String color, int maxSpeed) {
        if(mark == null || mark.isEmpty()){
            this.mark = "DEFAULT_MARK";
        }else{
            this.mark = mark;
        }
        if(model == null || model.isEmpty()){
            this.model = "DEFAULT_MODEL";
        }else {
            this.model = model;
        }

        this.year = year;
        this.country = country;

        if(color == null || color.isEmpty()){
            this.color = "DEFAULT_COLOR";
        }else {
            this.color = color;
        }
        if(maxSpeed <= 0){
            this.maxSpeed = 100;
        }else{
            this.maxSpeed = maxSpeed;
        }
    }

    public Transport(int year, String country) {
        this("DEFAULT_MARK","DEFAULT_MODEL",year,country,"DEFAULT_COLOR",100);
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public abstract void refill();
}

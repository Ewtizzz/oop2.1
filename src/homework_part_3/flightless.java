package homework_part_3;

public class flightless extends birds{
    private String movementType;

    public flightless(String nickname, int years, String habitat, String movementType) {
        super(nickname, years, habitat);
        this.movementType = movementType;
    }

    @Override
    public String toString() {
        System.out.println("кличка: " + getNickname() +
                ",возраст: " + getYears() +
                ",среда проживания: " + getHabitat() +
                ",тип передвежения: " + getMovementType());
        return null;
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    public void walk(){
        System.out.println("гуляю");
    }

    @Override
    public void eat() {
        System.out.println("ем");
    }

    @Override
    public void sleep() {
        System.out.println("сплю");
    }

    @Override
    public void move() {
        System.out.println("двигаюсь");
    }

    @Override
    public void hunt() {
        System.out.println("охочусь");
    }
}

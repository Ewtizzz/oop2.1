package homework_part_3;

public class flying extends birds {
    private String movementType;

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

    public flying(String nickname, int years, String habitat, String movementType) {
        super(nickname, years, habitat);
        if (movementType == null || movementType.isEmpty()){
            this.movementType = "default movementType";
        }else{
            this.movementType = movementType;
        }
    }


    public void fly(){
        System.out.println("лечу");
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

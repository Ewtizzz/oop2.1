package homework_part_3;

public class predators extends mammals {
    private String foodType;

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public predators(String nickname, int years, String habitat, int movementSpeed, String foodType) {
        super(nickname, years, habitat, movementSpeed);
        if (foodType == null || foodType.isEmpty()){
            this.foodType = "default foodType";
        }else{
            this.foodType = foodType;
        }
    }

    public void graze(){
        System.out.println("я пащусь");
    }

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
    public void walk() {
        System.out.println("хожу");
    }

    @Override
    public String toString() {
        System.out.println("кличка: " + getNickname() +
                ",возраст: " + getYears() +
                ",среда проживания: " + getHabitat() +
                ",скорость: " + getMovementSpeed() +
                ",еда: " + getFoodType());
        return null;
    }
}

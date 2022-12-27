package homework_part_3;

public abstract class mammals extends Animals{
    private String habitat;
    private int movementSpeed;

    @Override
    public String toString() {
        System.out.println("кличка: " + getNickname() +
                ",возраст: " + getYears() +
                ",среда проживания: " + getHabitat() +
                ",скорость: " + getMovementSpeed());
        return null;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public mammals(String nickname, int years, String habitat, int movementSpeed) {
        super(nickname, years);
        if (habitat == null || habitat.isEmpty()){
            this.habitat = "default habitat";
        }else{
            this.habitat = habitat;
        }
        if(movementSpeed <=0){
            this.movementSpeed = 1;
        }else{
            this.movementSpeed = movementSpeed;
        }
    }

    public abstract void walk();
}

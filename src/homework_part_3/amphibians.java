package homework_part_3;

public class amphibians extends Animals {

    private String habitat;

    public amphibians(String nickname, int years, String habitat) {
        super(nickname, years);
        if (habitat == null || habitat.isEmpty()){
            this.habitat = "default habitat";
        }else{
            this.habitat = habitat;
        }
    }

    @Override
    public String toString() {
        System.out.println("кличка: " + getNickname() +
                ",возраст: " + getYears() +
                ",среда проживания: " + getHabitat());
        return null;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
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

    public void hunt() {
        System.out.println("охочусь");
    }
}

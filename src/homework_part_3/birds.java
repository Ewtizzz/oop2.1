package homework_part_3;

public abstract class birds extends Animals{
    private String habitat;

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

    public birds(String nickname, int years, String habitat) {
        super(nickname, years);
        if (habitat == null || habitat.isEmpty()){
            this.habitat = "default habitat";
        }else{
            this.habitat = habitat;
        }
    }

    public abstract void hunt();

}

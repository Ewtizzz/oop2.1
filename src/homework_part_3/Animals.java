package homework_part_3;

public abstract class Animals {
    private String nickname;
    private int years;

    public Animals(String nickname, int years) {
        if(nickname == null || nickname.isEmpty()){
            this.nickname = "клички нет";
        }else{
            this.nickname = nickname;
        }
        if(years <= 0){
            this.years = 1;
        }else{
            this.years = years;
        }
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public Animals() {
        this("клички нет",0);
    }

    public abstract void eat();
    public abstract void sleep();
    public abstract void move();

}

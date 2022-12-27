import homework_part_3.*;
import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {
        //1
        Car BMWI8 = new Car("BMW","I8",2014,"USA","white",250,0);
        BMWI8.toString();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        Train LASTOCHKA = new Train("Ласточка","В-901",2011,"RUSSIA","white",301,3500,0,"Белорусский вокзал","Минск-Пассажирский",11);
        Train LENINGRAD = new Train("Ленинград","D-125",2019,"RUSSIA","white",270,1700,0,"Ленинградский вокзал","Ленинград-Пассажирский",8);
        LASTOCHKA.toString();
        LENINGRAD.toString();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        Bus MERCEDESTOURISMO = new Bus("MERCEDES","Tourismo",2011,"USA","White",145);
        Bus LIAZ = new Bus("LIAZ","529265",2022,"RUSSIA","White",100);
        Bus PeugeotBoxer = new Bus("Peugeot","Boxer",2011,"RUSSIA","White",120);
        MERCEDESTOURISMO.toString();
        LIAZ.toString();
        PeugeotBoxer.toString();
        //2
        BMWI8.refill();
        LASTOCHKA.refill();
        LIAZ.refill();
        //3
        //млекопитающие
        //травоядные
        Animals gazelle = new herbivores("клички нет",1,"луг",5,"трава");
        Animals giraffe = new herbivores("клички нет",2,"саванна",4,"листва");
        Animals horse = new herbivores("клички нет",3,"степь",10,"трава");
        //хищники
        Animals hyena = new predators("клички нет",2,"саванна",15,"арбуз");
        Animals tiger = new predators("клички нет",3,"пустыня",20,"различные животные");
        Animals bear = new predators("клички нет",2,"лес",9,"ягоды");
        //земноводные
        Animals frog = new amphibians("клички нет",1,"озеро");
        Animals snake = new amphibians("клички нет",2,"лес");
        //птицы
        //нелетающие
        Animals peacock = new flightless("клички нет",2,"","ходит");
        Animals penguin = new flightless("клички нет",1,"","ходит");
        Animals dodo = new flightless("клички нет",2,"","ходит");
        //летающие
        Animals gull = new flying("клички нет",3,"море","летает");
        Animals albatross = new flying("клички нет",2,"океан","летает");
        Animals falcon = new flying("клички нет",3,"море","летает");

        Animals[] arr = new Animals[14];
        arr[0] = gazelle;
        arr[1] = giraffe;
        arr[2] = horse;
        arr[3] = hyena;
        arr[4] = tiger;
        arr[5] = bear;
        arr[6] = frog;
        arr[7] = snake;
        arr[8] = peacock;
        arr[9] = penguin;
        arr[10] = dodo;
        arr[11] = gull;
        arr[12] = albatross;
        arr[13] = falcon;
        for (int i = 0; i < arr.length; i++) {
            arr[i].toString();
        }
    }
}
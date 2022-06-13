package classroomFour;

import java.sql.Timestamp;

public class Rinkis {
    final double PI = 3.14; //final - nevar izmainīt
    double radius;
    double laukums;
    double rinkaLinijasGarums;
    Timestamp timestamp;

    //bezargumenta konstruktors
    Rinkis (){
        System.out.println("Mēs veidojam Riņķi..");
//        laukums = aprekinatLaukumu();
//        rinkaLinijasGarums = aprekinatRinkaLinijasGarumu();
        Long datetime = System.currentTimeMillis();
        timestamp = new Timestamp(datetime);

    }
    //Konstruktīvais
    Rinkis(double padotaisRadiuss){
        radius = padotaisRadiuss;
        laukums = aprekinatLaukumu();
        rinkaLinijasGarums = aprekinatRinkaLinijasGarumu();
    }


    public void printCreatedTime(){
        System.out.println(timestamp);
    }

    public double aprekinatLaukumu(){
        System.out.println("Aprēķina laukumu");
//        return (radius * radius) * PI;
        return Math.pow(radius, 2) * PI;
    }
    public double aprekinatRinkaLinijasGarumu(){
        System.out.println("Apreķinu līnijas garumu");
        return 2 * PI * radius;
    }
}

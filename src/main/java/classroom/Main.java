package classroom;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int vecumsSuns = 3;// Vesels skaitls
        String vardsSuns = "Reksis";//Teksts
        String vardsSunsDivi = "Lesija";
        //(mainīgā tips) (mainīgā nousaukums) = (vērtība);
        double svarsSuns = 15.8;//Daļskaitlis
        float augums = 60.2F;//Daļskaitlis
        boolean irIzsalcis=false; //true = 1 ; false = 0
        boolean irSkirnesSuns=true;


        char dzimums = 'V';
        char dzimumsDivi = 'S';
        char vaditajaKategorija = 'B';


        boolean isStringsTheSame = vardsSuns.equals(vardsSunsDivi);


        System.out.println("Mans suns");
        System.out.println("Vecums");
        System.out.println(vecumsSuns);
        System.out.println("Vārds");
        System.out.println(vardsSuns);
        System.out.println("Mana suņa svars");
        System.out.println(svarsSuns+" kg" + "\n");
        System.out.println("Mans suņa augstums" + " " + augums + " cm");
        System.out.println("Vai mans suns ir izsalcis?");
        System.out.println(irIzsalcis);
        System.out.println("Vai mans suns ir sķirnes");
        System.out.println(irSkirnesSuns);
        System.out.println();


        int vecumsKakis = 5;
        String vardsKakis = "Picis";
        System.out.println("Mans kaķis");
        System.out.println("Vecums");
        System.out.println(vecumsKakis);
        System.out.println("Vārds");
        System.out.println(vardsKakis);
        System.out.println("Kaķis un suņa vecums kopā");
        System.out.println(vecumsKakis+vecumsSuns);
        System.out.println(vardsSuns+" "+vardsKakis);

        System.out.println("Hello Marts");

        byte monthInYear = 12;
        short autoPrice = 13322;
        long netIncom = 21122223123L;
        System.out.println(netIncom + " " + autoPrice + "\n" + monthInYear);
        System.out.println();//Atstarpe
        System.out.println();
        System.out.println();

        //Aritmētika
        int summa;
        int starpiba;
        int reizinajums;
        double dalijums;

        int atlikums;

        double z = 5;
        double q = 10;
        double w = 12;

        int x = 5;
        int y = 10;


        summa = x + y;
        starpiba = x - y;
        reizinajums = x * y;
        dalijums = z / q;
        atlikums = 12%5;

        int skaitlis = 6;
        System.out.println("ja atbilde ir 0, šis ir pāra skaitlis " + skaitlis%2);


        System.out.println("SUMMA " + summa);
        System.out.println("Starpība " + starpiba);
        System.out.println("Reizinājums " + reizinajums);
        System.out.println("Dalījums " + dalijums);
        System.out.println("Atlikums " + atlikums);


    }
}

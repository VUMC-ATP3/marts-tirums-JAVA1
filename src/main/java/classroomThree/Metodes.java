package classroomThree;

import java.util.Scanner;

public class Metodes {

    public static void main(String[] args) {


        Scanner skeneris = new Scanner(System.in);

        int b = 9;
        int a = kvadrataLaukums(3);
        float c = taisnturaLaukums(3.4F, 5.3F);
        printetTekstu(a,c);
        printetTekstu(a,c);
        System.out.println(prettyPrint("###########"));

    }

    static String prettyPrint(String a){
        return "asdasd" + a + "asdasdasdsa";
    }

    static float taisnturaLaukums(float a, float b){
        float s = a * b;
        return s;
    }

    static void printetTekstu(int a, float c){
        System.out.println("Kvadrata Laukums " + a);
        System.out.println("Taisnstūra Laukums " + c);

    }

    //metode, kas aprēķina kvadrāta laukumu
    //int - tips ko atgriež
    //kvadrataLaukums - metodes nosaukums
    //int mala - arguments/parametrs

    static int kvadrataLaukums(int mala){
        int laukums = mala * mala;
        return laukums;
    }





}

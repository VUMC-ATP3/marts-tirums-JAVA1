package homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Uzrakstiet programmu, kas no lietotāja nolasa veselus skaitļus un apstājas, izvadot uz ekrānu tekstu:
        // “Gatavs”, kad šo vērtību summa pārsniedz 100
        int veselsSkaitlis;
        int x = 0;
        do {
            System.out.println("Ievadi veselu skaitli");
            veselsSkaitlis = scanner.nextInt();
            x = x + veselsSkaitlis;
        }while (x<100);
        System.out.println("GATAVS");

        //Lietotājs ievada skaitli un nosaka vai ir Pirmskaitlis
        int skaitlis, atlikums=0;
        System.out.println("### Pirmskaitļu pārbaude ###");
        System.out.println("Ievadi skaitli...");
        skaitlis= scanner.nextInt();
        for (int i = 2; i < skaitlis ; i++) {
            if (skaitlis % i == 0) {
                atlikums++;
                break;
                }
            }

        if (atlikums==0){
            System.out.println(skaitlis + " IR Pirmskaits");
        }else {
            System.out.println(skaitlis + " NAV Pirmskaitlis");
        }

        //Definēt trīs masīvus ar datu tipiem: int, String, char un jāizvada uz ekrāna visas vērtības izmantojot
        int[] skaitli = {9,45,8,69,44,2,104,420,606,112};
        String[] pcParts = {"MB", "CPU", "PSU", "RAM", "GPU", "Case", "Fan"};
        char[] diakritiskasZimes = {'ā','ē','ī','ū','ģ','ķ','ļ','ņ','č','š','ž'};

        int a = 0;
        while (a<skaitli.length) {
            System.out.println("skaitļi: " + skaitli[a]);
            a++;
        }

        int b = 0;
        while (b< pcParts.length) {
            System.out.println("PC detaļas: " + pcParts[b]);
            b++;
        }

        int c = 0;
        while (c< diakritiskasZimes.length){
            System.out.println("Diakritiskās zīmes: " + diakritiskasZimes[c]);
            c++;
        }

        int d = 0;
        do{
            System.out.println("Do while: " + skaitli[d]);
            d++;
        }while (d < skaitli.length);

        int e = 0;
        do{
            System.out.println("Do while: " + pcParts[e]);
            e++;
        }while (e < pcParts.length);

        int f = 0;
        do {
            System.out.println("Do while: " + diakritiskasZimes[f]);
            f++;
        }while (f < diakritiskasZimes.length);

        for (int i = 0; i < skaitli.length; i++) {
            System.out.println("For Loop: " + skaitli[i]);
        }
        for (int i = 0; i < pcParts.length; i++) {
            System.out.println("For Loop: " + pcParts[i]);
        }
        for (int i = 0; i < diakritiskasZimes.length; i++) {
            System.out.println("For Loop: " + diakritiskasZimes[i]);
        }

        for (int g : skaitli){
            System.out.println("For Each: " + g);
        }
        for (String h : pcParts){
            System.out.println("For Each: " + h);
        }
        for (char i : diakritiskasZimes){
            System.out.println("For Each: " + i);
        }

        //Definēt veselu skaitļu masīvu ar izmēru 100
        int[] skaitluMasivsSimts = new int [100];
        int paraSk = 2;
        for (int i = 0; i < skaitluMasivsSimts.length; i=i+2) {
            skaitluMasivsSimts[i] = paraSk;
            System.out.print(paraSk + " " );
            paraSk = paraSk + 2;

        }
//            skaitluMasivsSimts[i]=i;

        System.out.println();

        //Uzrakstiet Java programmu, lai aprēķinātu dotā skaitļa faktoriālo vērtību
        System.out.println(faktorials(4));
        System.out.println(faktorials(8));

        System.out.println();

        //Izstrāt kodu tā, lai lietotājam būtu tikai trīs mēģinājumi uzminēt pareizo konta PIN kodu
        final int pin = 6969;
        int pinKods;

        System.out.println("Ievadi PIN!...");
        for (int i = 0; i < 3; i++) {
            pinKods = scanner.nextInt();
            if (pinKods == pin){
                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ");
                break;
            } else if (pinKods != pin && i < 2) {
                System.out.println("Nepareizs PIN, mēģiniet vēlreiz...");
            }
            else {
                System.out.println("Atvainojiet, bet Jūs esat bloķēts!!!");
            }


        }


    }
    static int faktorials (int faktorials){
        int rezultats = 1;
        for (int i = 1; i <= faktorials; i++) {
            rezultats=rezultats*i;
        }
        return rezultats;
    }







}

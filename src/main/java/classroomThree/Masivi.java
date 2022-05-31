package classroomThree;

import java.util.Random;
import java.util.Scanner;

public class Masivi {
    public static void main(String[] args) {

        Random skaitluGenerators = new Random();
        for (int i = 0; i < 1000; i++) {
            System.out.println(skaitluGenerators.nextInt(1000));
        }
        int nejausSkaitlis = skaitluGenerators.nextInt(50);
        System.out.println(nejausSkaitlis);

//        int sakotnejs = 0;
//        while (sakotnejs<=1000){
//            System.out.println(sakotnejs);
//            //sakotnejs++;
//            sakotnejs = sakotnejs + 2;
//        }



        String pietura = "Centrālā stacija";

        String[] stacijas = {"Centrs", "Griziņš"};
        String[] pieturas = {"Centrālā stacija", "Marijas iela", "Bērnu pasaule", "Ziedoņdārzs"};

        printetTekstaMasivu(stacijas);
        printetTekstaMasivu(pieturas);
        //nodefinēta metode koda lejā


        int [] majuNumuri = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        for (int numuri : majuNumuri){
//            System.out.println(numuri);
//        }

       // printetIntegerMasivu(majuNumuri);
        int e = 0;
        while (e < majuNumuri.length){
            System.out.println("Mājas nr: " + majuNumuri[e]);
            e = e + 1;
        }

        char [] patskani = {'a', 'e', 'u', 'i'};

        System.out.println(pieturas[0] + pieturas[1] + pieturas[2] + pieturas[3]);
        pieturas[3] = "Zemitānu stacija";
        System.out.println(pieturas[0] + pieturas[1] + pieturas[2] + pieturas[3]);

        System.out.println("Cik pieturas ir masīvā? " + pieturas.length);
        System.out.println("Cik mājas ir uz ielas? " + majuNumuri.length);

        String [] hokejaCempioniTopTris = new String[3];
        System.out.println("cik vietas ir čempionātā? " + hokejaCempioniTopTris.length);
        String pirmaVieta = "Somija";
        String otraVieta = "Kanāda";
        String tresaVieta = "Čehija";

        hokejaCempioniTopTris[0] = pirmaVieta;
        hokejaCempioniTopTris[1] = otraVieta;
        hokejaCempioniTopTris[2] = tresaVieta;

        System.out.println(hokejaCempioniTopTris[0] + "\n" + hokejaCempioniTopTris[1] + "\n" + hokejaCempioniTopTris[2]);

        //Cikla operatori = while - kamer done, for - noteiktu skaitu reizi, do..while, for each - iterejam cauri sarakstam

        System.out.println("Cikls sākas");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i = i + 1;
            //kods kas izpildas ja nosacijums ir true
        }
        System.out.println("Cikls beidzās");

        majuParbaude(0,10);

        int y = 0;
        do{
            System.out.println(y);
            y = y + 1;
        }while (y < 10); //dara kamēr nonāk pie 10


//        Scanner scanner = new Scanner(System.in);
//        String parole = "Parole123";
//        String lietotajaIevaditaParole;
//        do {
//            System.out.println("Ievadi paroli!");
//            lietotajaIevaditaParole = scanner.nextLine();
//            System.out.println("Notiek paroles pārbaude...");
//        }while (!lietotajaIevaditaParole.equals(parole)); //kamer šis nav patiesiba neej no cikla un atkarto
//        System.out.println("Pareiza parole");


//        int number;
//        do {
//            System.out.println("Ievadi pozitīvu skaitli");
//            number = scanner.nextInt();
//        }while (number<=0);
//        System.out.println("Derīgs skaitlis " + number);


        for (int j = 0; j < 5; j++) {
            System.out.println("FOR cikls " + j);
        }
        for (int j = 0; j <=10 ; j = j + 2) {
            System.out.println(j);
        }

        String [] mansMasivs = {"Juris", "Anna", "Peteris", "Jānis"};
        for (int j = 0; j < mansMasivs.length; j++) {
            System.out.println(mansMasivs[j]);
        }

        for (int j = 0; j >= -10 ; j--) {
            System.out.println("Atskaitīt"+j);
        }

        String [] mansForEach = {"Jur", "Ana", "Pets", "Jāis"}; //katrams stringam mana masiva izdari kko
        for (String xxxx : mansForEach){
            System.out.println(xxxx);
        }

        System.out.println("Cikla Sākums");
        for (int j = 0; j < 10; j++) {
            if (j==5){
                System.out.println("J ir 5, laužam ciklu");
                break; //izlaužas no cikla
            }
            System.out.println("Print Brake Example " + j);

        }
        System.out.println("Cikla Beigas");

        int [] skaitluMasivs = {3,4,6,7,2,1,5,-4,2,6,4,3,3};
        for (int j = 0; j < skaitluMasivs.length ; j++) {
           // System.out.println("viss masīvs:" + skaitluMasivs[j]); //skaitluMasivs ar [] izvada tiehsi to kas ir
            if (skaitluMasivs[j] < 0) {
                System.out.println("Pirmais negatīvais skaitlis: " + skaitluMasivs[j]);
                System.out.println("Index ir: " + j);
                break;
            }
        }
        int[] skaitluMasivsDivi = {3, 4, 6, 7, 2, 1, -5, 4, 2, 6, -4, -3, 3};
        for (int j = 0; j < skaitluMasivsDivi.length; j++) {
            if (skaitluMasivsDivi[j]<0){
                continue;
            }
            System.out.println("Vertiba no masiva: " + skaitluMasivsDivi[j]);
        }


    }

    static void printetTekstaMasivu(String[] randomMasivs){
        int skaititajs = 0;
        while (skaititajs < randomMasivs.length){
            System.out.println(randomMasivs[skaititajs]);
            skaititajs = skaititajs + 1;
        }
    }
    static void printetIntegerMasivu(int[] kautKo){
        int i = 0;
        while (i < kautKo.length);
        System.out.println(kautKo[i]);
        i++; //i = i + 1
    }

    static void majuParbaude(int sakums, int beigas){
        int majuNumuri = sakums;
        while(majuNumuri<=beigas) {
        if(majuNumuri%3==0 || majuNumuri%5==0 || majuNumuri == 13){
            System.out.println("Šie māju nr neder" + majuNumuri);
        } else {
            System.out.println("Šie māju nr der " + majuNumuri);
        }
        majuNumuri = majuNumuri + 1;
       }
    }



}

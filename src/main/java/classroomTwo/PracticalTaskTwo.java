package classroomTwo;

import java.util.Scanner;

public class PracticalTaskTwo {







    //Lai palaistu JAVA programmu, jums klasē ir jāuzraksta main metode(psvm)
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ievaci savu vārdu!");
//        String name = scanner.nextLine();
//        System.out.println("Ievadi savu vecumu");
//        int age = scanner.nextInt();
//        System.out.println(String.format("Esi Sveicināts: %s !",name));
//        System.out.println("Jūsu vecums ir: " + age);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ievadi pirmo skaitli");
//        int a = scanner.nextInt();
//        System.out.println("Ievadi otro skaitli");
//        int b = scanner.nextInt();
//        int summa = a + b;
//        System.out.println("Summa = " + summa);

        int a = 5;
        int b = 10;
        int c = 5;
        int d = 11;

        //Lielāks >
        System.out.println(b > a); //true
        System.out.println(a > b); //false
        //Mazāks <
        System.out.println(a < b); //true
        System.out.println(b < a); //false
        //Vienāds ==
        System.out.println(a == c); //true
        System.out.println(a == b); //false
        System.out.println(b == c); //false
        //Nav Vienāds !=
        System.out.println(a != b); //true
        System.out.println(a != c); //false
        //Mazāks vienāds <=
        System.out.println(a <= c); //true
        System.out.println();
        //Lielāks vienāds >=
        System.out.println(b >= d); //false

        int vecums = 18;
        boolean vaiDrikstBalsot = (vecums >= 18);
        System.out.println("Vai cilvēks drīkst balsot? " + vaiDrikstBalsot);

        String name = "Juris";
        String secondName = "Juris";
        boolean vaiVardiSakrit = (name.equals(secondName));
        System.out.println("Vai vārdi sakrīt? " + vaiVardiSakrit);
        System.out.println();

        int e = 4;
        //&& abiem jābūt patiesiem
        boolean vaiItPatiess = ((e < 5) && (e<10));
        System.out.println(vaiItPatiess);
        // || vienam vajag būt patiesam
        vaiItPatiess = ((e < 5) || (e<10));
        System.out.println("||" + vaiItPatiess);

        e = 5;
        vaiItPatiess = (!(e < 5));
        System.out.println(vaiItPatiess);
        // Loģiskais nē - gaidam false un ir true
        System.out.println(!(false==true));

        int vecumsDivi = 17;

        if (vecumsDivi >= 18){
            System.out.println("Cilvēks drīkst balsot");

        } else
        {
            System.out.println("Cilvēks nedrīkst balsot");

        }

        System.out.println("Koda turpinājums");

        System.out.println("Ievadi savu vecumu...");
        int vecumsTris = scanner.nextInt();
        if(vecumsTris >= 18){
            System.out.println("Cilvēks drīkst balsot");
        } else {
            System.out.println("Cilvēks nedrīkst balsot");

        }



        System.out.println("Koda turpinājums");

        System.out.println("Ievadi skaitli..");
        int skaitlisViens = scanner.nextInt();
        if(skaitlisViens==10){
            System.out.println("Printējam skaitlis 10");
        } else if(skaitlisViens==15){
            System.out.println("Printējam skaitlis 15");
        } else if(skaitlisViens==20){
            System.out.println("Printējam skaitlis 20");
        } else {
            System.out.println("Skaitlis ir nezināms");
        }
        System.out.println("Koda turpinājums");

        //Janodefine cilveks
        //Cilveka vecums
        //cilveka dzimums - V vai S
        //Sieviete drikst doties pensija no 60 gadiem
        //Virietis driskt doties pensija no 65 gadiem


//        int vecumsPensija = 66;
//        char dzimums = 'V';
//
//        if (dzimums == 'V' && vecumsPensija >= 65){
//            System.out.println("Vīrieši drīkst doties pensijā no 65");
//        }
//        else if (dzimums == 'S' && vecumsPensija >= 60){
//            System.out.println("Sievietes drīkst doties pensijā no 60");
//        }
//        else{
//            System.out.println("Jūs nedrīkstat doties pensijā");
//        }

        int cilvekaVecums = 65;
        char cilvekaDzimums = 'V';
        boolean drikstDotiesPensija = false;

        if (cilvekaVecums >= 65 && cilvekaDzimums == 'V') {
            drikstDotiesPensija = true;
        }
        else if (cilvekaVecums >=60 && cilvekaDzimums == 'S'){
            drikstDotiesPensija = true;
        }

        if(drikstDotiesPensija){
            System.out.println("Cilveks drikst doties pensija!");
        }

        System.out.println("Koda turpinājums...........");

        int diena = 13;
        String dienasVards;

        switch (diena) {
            case 1:
                dienasVards="Pirmdiena";
                break;
            case 2:
                dienasVards="Otrdien";
                break;
            case 3:
                dienasVards="Trešdiena";
                break;
            case 4:
                dienasVards="Ceturtdiena";
                break;
            case 5:
                dienasVards="Piektdiena";
                break;
            case 6:
                dienasVards="Sestdiena";
                break;
            case 7:
                dienasVards="Svētdiena";
                break;
            default:
                dienasVards="Nezināma diena";
        }
        System.out.println(dienasVards);

        System.out.println("NEXT");

        System.out.println("Ievadi veselu skaitli...");


        int veselsSkaitlis = scanner.nextInt();
        if(veselsSkaitlis > 0){
            System.out.println("Lielāks par 0");
        } else {
            System.out.println("Mazāks par 0");
        }

        System.out.println("NEXT");
//inte
        int skaitlisA = 4;
            if(skaitlisA%2==0){
                System.out.println("Skaitlis ir pāra skaitlis");
            }else{
                System.out.println("Skaitlis it nepāra skaitlis");
            }








    }


}

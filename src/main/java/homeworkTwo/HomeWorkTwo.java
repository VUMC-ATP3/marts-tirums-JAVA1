package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 10;

        System.out.println("Vai ir pozitīvs? " + (x > 0));
        System.out.println("Vai ir negatīvs? " + (x < 0));
        System.out.println("Vai ir lielāks par 5 un mazāks vai vienāds par 10? " + ((x>=5)&&(x<=10)));

        x = 7;

        System.out.println("Nav vienāds ar 5 un ir mazāks par 10? " + ((x != 5)&&(x < 10)));
        System.out.println("Ir vienāds ar 0 un 10?" + ((x==0)&&(x==10)));
        System.out.println("Reizinājums lielāks par 10? " + ((x * x)>10));

        System.out.println("Ievadi mēneša kārtas skaitli...");

        int month = scanner.nextInt();
        String monthDay;

        switch (month){
            case 1:
                monthDay="Janvāris";
                break;
            case 2:
                monthDay="Februāris";
                break;
            case 3:
                monthDay="Marts";
                break;
            case 4:
                monthDay="Aprīlis";
                break;
            case 5:
                monthDay="Maijs";
                break;
            case 6:
                monthDay="Jūnijs";
                break;
            case 7:
                monthDay="Jūlijs";
                break;
            case 8:
                monthDay="Augusts";
                break;
            case 9:
                monthDay="Septembris";
                break;
            case 10:
                monthDay="Oktobris";
                break;
            case 11:
                monthDay="Novembris";
                break;
            case 12:
                monthDay="Decembris";
                break;
            default:
                monthDay="Mēnesis neeksistē";
        }
        System.out.println("Mēnesis = " + monthDay);

        System.out.println("Ievadi 1. veselo skaitli...");
        int a = scanner.nextInt();
        System.out.println("Ievadi 2. veselo skaitli...");
        int b = scanner.nextInt();
        System.out.println("Ievadi 3. veselo skaitli...");
        int c = scanner.nextInt();
        if((a > b)&&(a > c)) {
            System.out.println("1. skatlis ir lielākais");
        } else if ((b > a)&&(b > c)) {
            System.out.println("2. skatlis ir lielākais");
        } else if ((c > a)&&(c > b)) {
            System.out.println("3. skatlis ir lielākais");
        }

        System.out.println("Kāda krāsa deg luksaforā? ");
        String krasa = "Zaļa";
        if (krasa.equals("Zaļa")) {
            System.out.println("Deg zaļa. Pie zaļās gaismas drīkst šķērsot brauktuvi");
        } else if (krasa.equals("Dzeltena")) {
            System.out.println("Deg Dzeltena. Pie dzeltenās gaismas jābū uzmanīgam jo mainās gaismas");
        } else if (krasa.equals("Sarkana")) {
            System.out.println("Deg Sarkana. STOP! Sarkanā gaisma liedz kustību");
        } else {
            System.out.println("Luksafors nedarbojas. Izvērtēt situāciju un droši šķērsot brauktuvi");
        }

        System.out.println();

        printBusinessCard();
        printBusinessCard();
        printBusinessCard();

        System.out.println();

        printBusinessCardTwo("Jānis", "Balodis", 26351625, 1990);
        printBusinessCardTwo("Kate", "Ozoliņa", 20473353, 1999);

        System.out.println();

        int summa = aprekinatSummu(7, 14);
        System.out.println("Summa ir " + summa);

        System.out.println();


        System.out.println(average(10, 2, 4));

    }

    static void printBusinessCard(){
        System.out.println("Vizītkarte");
        System.out.println("##########");
        System.out.println("Vārds: Marts");
        System.out.println("Uzvārds: Tīrums");
        System.out.println("Telefona nr.: +371 298152444");
        System.out.println("Dzimšanas gads: 1989");
        System.out.println("##########");
    }
    static void printBusinessCardTwo(String name, String surname, int telephone, int dateOfBirth) {
        System.out.println("VizītkarteTwo");
        System.out.println("##########");
        System.out.println("Vārds: " + name);
        System.out.println("Uzvārds: " + surname);
        System.out.println("Telefona nr.:" + telephone);
        System.out.println("Dzimšanas gads: " + dateOfBirth);
        System.out.println("##########");
    }
    static int aprekinatSummu (int a, int b){
        int summa = a + b;
        return summa;

    }
    static double average (double a, double b, double c){
        double dec = (a + b + c) / 3;
        return dec;
    }
}

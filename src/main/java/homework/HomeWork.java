package homework;

public class HomeWork {
    public static void main(String[] args) {

        String valstsNosaukums = "Japāna";
        String valstsGalvaspilseta = "Tokija";
        String valstsValoda = "Japāņu valoda";
        int iedzivotajuSkaits = 125360000;
        int valstsPlatiba = 377975;
        double udensPlatiba = 1.4;
        boolean eiropasSavieniba = false;
        char valuta = '¥';

        System.out.println(valstsNosaukums);
        System.out.println("Iedzīvotāju skaits = " + iedzivotajuSkaits);
        System.out.println("Valsts platība = " + valstsPlatiba + "km^2");
        System.out.println("Ūdeņi = " + udensPlatiba + "% no valsts platības");
        System.out.println("Galvaspilsēta = " + valstsGalvaspilseta);
        System.out.println("Oficiālā valoda = " + valstsValoda);
        System.out.println("Vai "+ valstsNosaukums + " ir ES dalībvalsts = " + eiropasSavieniba);
        System.out.println(valstsNosaukums + "s" + " valūta = " + valuta + "\n");

        System.out.println(valstsNosaukums + " ir salu valsts Austrumāzijā, kas atrodas Klusā okeāna rietumos. " +
                "Valsts platība it " + valstsPlatiba + "km^2 no kuras " + udensPlatiba + "% " + "aizņem ūdens." +
                "\n" + valstsNosaukums + "s" + " galvaspilsēta ir " + valstsGalvaspilseta + " un valsts valūta ir " +
                valstsNosaukums + "s jena - " + valuta + " (YPN).");
        System.out.println("\n");





        System.out.println("Aritmētika + , - , * , /" + "\n");
        int summaViens; int summaDivi; int summaTris;
        int starpibaViens; int starpibaDivi; int starpibaTris;
        int reizinajumsViens; int reizinajumsDivi; int reizinajumsTris;
        double dalijumsViens; double dalijumsDivi; double dalijumsTris;
        double atlikumsViens; int atlikumsDivi; double atlikumsTris;

        int x = 50;
        int y = 15;
        int z = 23;
        int q = 17;
        double a = 1000;
        double b = 250;
        double c = 69000;

        summaViens = x + y; summaDivi = x + z; summaTris = z + q;
        starpibaViens = x - y; starpibaDivi = q - z; starpibaTris = z - y;
        reizinajumsViens = x * y; reizinajumsDivi = y * z; reizinajumsTris = q * z;
        dalijumsViens = a / y; dalijumsDivi = b / y; dalijumsTris = c / q;
        atlikumsViens = a%b; atlikumsDivi = z%q; atlikumsTris = c%q;

        System.out.println("1. summa " + summaViens );
        System.out.println("2. summa " + summaDivi);
        System.out.println("3. summa " + summaTris + "\n");
        System.out.println("1. starpība " + starpibaViens);
        System.out.println("2. starpība " + starpibaDivi);
        System.out.println("3. starpība " + starpibaTris + "\n");
        System.out.println("1. reizinājums " + reizinajumsViens);
        System.out.println("2. reizinājums " + reizinajumsDivi);
        System.out.println("3. reizinājums " + reizinajumsTris + "\n");
        System.out.println("1. dalījums " + dalijumsViens);
        System.out.println("2. dalījums " + dalijumsDivi);
        System.out.println("3. dalījums " + dalijumsTris + "\n");
        System.out.println("1. atlikums " + atlikumsViens);
        System.out.println("2. atlikums " + atlikumsDivi);
        System.out.println("3. atlikums " + atlikumsTris);











    }
}

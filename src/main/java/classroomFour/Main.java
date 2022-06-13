package classroomFour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        House majaViens = new House(4,true,false,"Zaļa","Brīvības",33);
//        majaViens.stavuSkaits = 4;
//        majaViens.majasNumurs = 33;
//        majaViens.ielasNosaukums = "Brīvības iela";
//        majaViens.irLifts = false;
//        majaViens.irAutoStavieta = true;
//        majaViens.krasa = "Zaļā";
        majaViens.printHouse();

        System.out.println("########################");

        House majaDivi = new House(5,true,false,"Brūna","Vārnu",100);
//        majaDivi.stavuSkaits = 5;
//        majaDivi.majasNumurs = 100;
//        majaDivi.ielasNosaukums = "Vārnu iela";
//        majaDivi.irLifts = true;
//        majaDivi.irAutoStavieta = false;
//        majaDivi.krasa = "Brūnā";
//        majaDivi.printHouse();
//        majaDivi.stavuSkaits = 55;
        majaDivi.printHouse();

        System.out.println("########################");

        Velosipeds zzk = new Velosipeds();
        zzk.bremzuTips = 'D';
//        System.out.println(zzk.atrums);
        zzk.printetAtrumu();
        System.out.println("Cilveks uzkāpj uz velo un min pedāļus");
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        System.out.println("Velo atrums ir " + zzk.atrums);
        System.out.println("Priekšā izlec kaķis. Vajag bremzēt");
        zzk.bremzet();
        zzk.bremzet();
//        System.out.println("Velo atrums ir " + zzk.atrums);
        zzk.printetAtrumu();

        Velosipeds merida = new Velosipeds();
        merida.bremzuTips = 'V';
//        System.out.println("Velo ātrums ir " + merida.atrums); //jauns objekts tāpēc ātrums 0
        merida.printetAtrumu();

        Velosipeds vecsVelosipeds = new Velosipeds();
        vecsVelosipeds.bremzuTips = 'S';
        vecsVelosipeds.bremzet();

        Koks ozols = new Koks();
        ozols.irSkujuKoks = false;
        ozols.irLapuKoks = true;
        ozols.diametrs = 100;
        ozols.augtums = 2000;
        ozols.lapuKrasa = "Tumši zaļā";
        ozols.printKoks();

        Rinkis mansRinkis = new Rinkis(5);
        System.out.println(mansRinkis.PI);
//        mansRinkis.radius = 5;
        System.out.println(mansRinkis.radius);
        System.out.println(mansRinkis.aprekinatLaukumu());

        Rinkis mansRinkisDivi = new Rinkis();
        System.out.println(mansRinkisDivi.PI);
        mansRinkisDivi.radius = 50;
        System.out.println(mansRinkisDivi.radius);
        System.out.println(mansRinkisDivi.aprekinatLaukumu());
        System.out.println(mansRinkisDivi.aprekinatRinkaLinijasGarumu());
        mansRinkis.printCreatedTime(); //kape NULL?????
        mansRinkisDivi.printCreatedTime();

        System.out.println("======================");
        Rinkis mansRinkis3 = new Rinkis(12.3);
        System.out.println(mansRinkis3.laukums);
        System.out.println(mansRinkis3.rinkaLinijasGarums);
        System.out.println("======================");


        Rinkis mansRinkisTris = new Rinkis(12.3);

        Taisnsturis taisnsturisViens = new Taisnsturis(12.4,34.32);
//        taisnsturisViens.malaViens = 12.4;
//        taisnsturisViens.malaDivi = 34.32;
        System.out.println("Taisnstūra laukums ir " + taisnsturisViens.aprekinatLaukumu());

        Suns reksis = new Suns();
        reksis.vaiRej = false;
        reksis.name = "Dingo";
        System.out.println(reksis.vaiRej);
        reksis.astesGarums = 10;
        reksis.printName();
        reksis.izdodSkanu();

        Animal dzivnieks = new Animal();
        dzivnieks.name = "Dzīvnieks";


    }
}

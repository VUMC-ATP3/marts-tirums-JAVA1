package homework.classHomework;

public class Main {
    public static void main(String[] args) {
        Trijsturis trijsturisViens = new Trijsturis();
        trijsturisViens.a=15;
        trijsturisViens.b=15;
        trijsturisViens.c=25;
        System.out.println("TrijsturaViens laukums ir " + trijsturisViens.aprekinatTrijsturaLaukumu());
        System.out.println("Ir vienādmalu - " + trijsturisViens.isVienadmalu());
        System.out.println("Ir vienādsānu - " + trijsturisViens.isVienadsanu());


        Trijsturis trijsturisDivi = new Trijsturis(15, 15, 15);
        System.out.println("TrijsturaDivi laukums ir " + trijsturisDivi.aprekinatTrijsturaLaukumu());
        System.out.println("Ir vienādmalu - " + trijsturisDivi.isVienadmalu());
        System.out.println("Ir vienādsānu - " + trijsturisDivi.isVienadsanu());

    }


}

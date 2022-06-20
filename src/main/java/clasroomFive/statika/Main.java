package clasroomFive.statika;

public class Main {
    public static void main(String[] args) {

//        System.out.println(Auto.klasesNosaukums);

        System.out.println("Cik auto objekti uztaisiti: " + Auto.totalCarsCreated);

        Auto masina = new Auto("BMW");
//        System.out.println(masina.klasesNosaukums);
//        masina.klasesNosaukums = "Autoklase changed";
//        System.out.println(masina.marka);


        Auto masinaDivi = new Auto("Mercedes");
//        masinaDivi.marka = "Mercedes";
//        System.out.println(masinaDivi.klasesNosaukums);

        System.out.println("Cik auto objekti uztaisiti: " + Auto.totalCarsCreated);

        Auto masinaTris = new Auto("Opel");
        Auto masinaCetri = new Auto("Fiat");

        System.out.println("Cik auto objekti uztaisiti: " + Auto.totalCarsCreated);

        Auto.printText();


    }
}

package clasroomFive.statika;

public class Auto {
    public String marka;
    public static String klasesNosaukums = "Auto klase";
    public static int totalCarsCreated = 0;

    Auto(String marka){
        this.marka = marka;
        totalCarsCreated++;
    }

    public static void printText(){
        System.out.println("Printēju tekstu");
    }


}

package classroomFour;

public class House {
    int stavuSkaits; //locekļi
    boolean irLifts;
    boolean irAutoStavieta;
    String krasa;
    String ielasNosaukums;
    int majasNumurs;
//    Cilveks[] majasIedzivotaji;

    public House(int stavuSkaits, boolean irLifts, boolean irAutoStavieta, String krasa, String ielasNosaukums, int majasNumurs) {
        this.stavuSkaits = stavuSkaits;
        this.irLifts = irLifts;
        this.irAutoStavieta = irAutoStavieta;
        this.krasa = krasa;
        this.ielasNosaukums = ielasNosaukums;
        this.majasNumurs = majasNumurs;
    }

    //metodes
    //void neatgriež neko
    public void printHouse(){
        System.out.println("Mājas adrese ir " + adrese());
        System.out.println("Māja ir " + krasa + " krāsā");
        System.out.println("Mājā ir " + stavuSkaits + " stāvu skaits");
    }
    public String adrese(){
        return ielasNosaukums + " " + majasNumurs;
    }


}

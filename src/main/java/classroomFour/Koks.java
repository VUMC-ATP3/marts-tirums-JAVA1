package classroomFour;

public class Koks {

    boolean irLapuKoks;
    boolean irSkujuKoks;
    int augsanasAtrums = 0;
    String lapuKrasa;
    int diametrs;
    float augtums;

    public void printKoks(){
        System.out.println("Lapas ir " + lapuKrasa + " krāsā");
        System.out.println("Koks ir " + diametrs + "cm diametrā");
        System.out.println("Koka augtums " + augtums + "cm");
        System.out.println("Koks ir " + irLapuKoks);
    }

}

package clasroomFive.encapsulation;

public class Rinkis {
    private double radiuss;
    private String krasa;

    Rinkis (){
        this.radiuss = 1.0;
        this.krasa = "Sarkans";
    }

    public Rinkis(double radiuss, String krasa) {
        this.radiuss = radiuss;
        this.krasa = krasa;
    }

    public double getRadiuss() {
        return radiuss;
    }

    public void setRadiuss(double radiuss) {
        this.radiuss = radiuss;
    }

    public String getKrasa() {
        return krasa;
    }

    public void setKrasa(String krasa) {
        this.krasa = krasa;
    }

    double calculateArea(){
        return Math.pow(radiuss, 2) * Math.PI;
    }


}

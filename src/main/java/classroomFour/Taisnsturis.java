package classroomFour;

public class Taisnsturis {
    double malaViens;
    double malaDivi;

    public Taisnsturis(double malaViens, double malaDivi) {
        this.malaViens = malaViens;
        this.malaDivi = malaDivi;
    }

    //    Taisnsturis(double malaViens, double malaDivi){
//        this.malaViens = malaViens;
//        this.malaDivi = malaDivi;
//    }

    public double aprekinatLaukumu(){
        return malaViens * malaDivi;
    }
}

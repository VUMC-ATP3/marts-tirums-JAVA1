package homework.classHomework;

public class Trijsturis {
    int a;
    int b;
    int c;
    double laukums;
    boolean vienadmalu;
    boolean vienadsanu;

    public Trijsturis(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
//area = formul = area.area
    Trijsturis() {
        System.out.println("Mēs veidojam Trijstūri...");
    }

    public double aprLaukums() {
        return (a + b + c) / 2.0d;
    }

    public double aprekinatTrijsturaLaukumu() {
        laukums = aprLaukums();
        return Math.sqrt(laukums * (laukums - a) * (laukums - b) * (laukums - c));
    }

    public boolean isVienadmalu() {
        if (a == b || a == c || b == c) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isVienadsanu() {
        if ((a == b && a == c)) {
            return true;
        }else{
            return false;
        }
    }
}

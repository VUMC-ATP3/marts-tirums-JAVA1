package classroomFour;

public class Velosipeds {
    int atrums = 0;
    char bremzuTips;

    public void spiestPedalus(){
        System.out.println("Cilvēks spiež pedāļus ");
        atrums++;
    }
    public void bremzet(){
        System.out.println("Cilvēks bremzē ");
        if(bremzuTips=='D'){
            atrums = atrums - 2;
        }
        else if (bremzuTips=='V'){
            atrums--;
        }else {
            System.out.println("Bremžu nav...");
        }
//        atrums--;
    }

    public void printetAtrumu(){
        System.out.println(atrums + "km/h");
    }

}

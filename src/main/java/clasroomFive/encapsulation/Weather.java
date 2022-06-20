package clasroomFive.encapsulation;

public class Weather {

    boolean isRaining; //default - varam piekļūt klases un pakotnes līmenim
    public boolean isSunShining; // varam piekļūt visur
    private boolean isSnowing; // varam piekļūt tikai klases ietvaros
    private double temperatureAtDay; // varam piekļūt tikai klases ietvaros
    public double temperatureAtNight; // varam piekļūt visur

    public void printWeather(){
     System.out.println("Šī ir publiska metode");
     System.out.println("Ārā līst lietus visu dienu");
     metodeDivi();

    }

    private void metodeDivi(){
     System.out.println("Šī ir privāta metode");
    }

    void metodeTris(){
     System.out.println("Šī ir DEFAULT metode");
    }


}

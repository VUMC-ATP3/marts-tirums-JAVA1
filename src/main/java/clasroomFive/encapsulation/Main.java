package clasroomFive.encapsulation;

public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.printWeather();
//        weather.metodeDivi(); // nevar izsaukt jo Private
        weather.metodeTris();
        weather.isRaining = true;


        Human cilveks = new Human();
        Human cilveks2 = new Human();
        Human cilveks3 = new Human(12, 150.2, "Pēteris");

        System.out.println(cilveks3.toString());

        cilveks3.setAge(-3);
        System.out.println(cilveks3.toString());

        cilveks3.setAge(18);
        System.out.println(cilveks3.toString());

        System.out.println(cilveks3.getAge());

        System.out.println(cilveks3.getName());

        Rinkis rinkisViens = new Rinkis();
        rinkisViens.setRadiuss(2.0);

        Rinkis rinkisDivi = new Rinkis(3.0,"Zils");
        rinkisDivi.setKrasa("Zaļš");






    }
}

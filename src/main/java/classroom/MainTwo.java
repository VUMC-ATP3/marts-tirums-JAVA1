package classroom;

public class MainTwo {
    public static void main(String[] args) {
        String vards = "Marts";
        String uzvards = "Tīrums";
        int vecums = 33;
        boolean isPresent = true;

        System.out.println("Vārds: " + vards + "\n" + "Uzvārds: " + uzvards + "\n"
        + "Vecums: " + vecums + "\n" + "Vai bija nodarbībā? " + isPresent);

        String teikums = String.format("Vārds: %s \n Uzvards %s\n Vecums %s \n isPresent %s", vards,uzvards,vecums,isPresent);
        // %s norada uz mainigo pec kartas
        System.out.println(teikums);

        System.out.println((2*(2+2)/2);
        
    }
}

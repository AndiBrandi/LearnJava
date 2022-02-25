package Java_Basic;

public class Bmw {
    static String firmenName = "";
    String modell;
    String motor;
    int sitzAnzahl;

    public Bmw() {
    }

    public Bmw(String modell, String motor, int sitzAnzahl) {
        this.modell = modell;
        this.motor = motor;
        this.sitzAnzahl = sitzAnzahl;
    }

    private void printDetails() {

        System.out.println(modell + " , " + motor + " , " + sitzAnzahl);

    }

    public void drive() {

        System.out.println(modell + "Bmw fährt");

    }

    public static void callCeo() {


    }

    public String getModell() {

        return modell;
    }

    public String addString(String s) {

        String str = modell + " " + s;

        return str;
    }

}

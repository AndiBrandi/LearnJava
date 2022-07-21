package Java_Adv_Vererbung;

public class Fahrzeug {

    private String farbe = "";
    private int sitzAnzahl = 0;
    private int leistung = 0;

    public Fahrzeug(String farbe, int sitzAnzahl, int leistung) {
        this.farbe = farbe;
        this.sitzAnzahl = sitzAnzahl;
        this.leistung = leistung;
    }

    public Fahrzeug() {

    }


    void gas() {
        System.out.println("Fahrzeug beschleunigt.");
    }

    void brake() {
        System.out.println("Fahrzeug bremst ab.");
    }

}

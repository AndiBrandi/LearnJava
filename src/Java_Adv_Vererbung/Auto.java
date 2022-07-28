package Java_Adv_Vererbung;

public class Auto extends Fahrzeug {

    private int tuerenAnzahl = 0;
    private String treibstoffTyp = "";
    private int felgenGroesse = 0;

    public Auto(String farbe, int sitzAnzahl, int leistung, int tuerenAnzahl, String treibstoffTyp, int felgenGroesse) {
        super(farbe, sitzAnzahl, leistung);
        this.tuerenAnzahl = tuerenAnzahl;
        this.treibstoffTyp = treibstoffTyp;
        this.felgenGroesse = felgenGroesse;
    }

    public void motorhaubeOeffnen() {
        System.out.println("Motorhaube vom Auto wird geöffnet");

    }

}

package Java_Adv_Vererbung;

public class Tesla_Model_S extends Auto {

    private int motorenAnzahl = 0;

    public Tesla_Model_S(String farbe, int sitzAnzahl, int leistung, int tuerenAnzahl, String treibstoffTyp, int felgenGroesse, int motorenAnzahl) {
        super(farbe, sitzAnzahl, leistung, tuerenAnzahl, treibstoffTyp, felgenGroesse);
        this.motorenAnzahl = motorenAnzahl;
    }

    public void aufladen() {
        System.out.println("Tesla Model S wird aufgeladen");
    }

}

package Java_Adv_Vererbung;

public class Audi_Q8 extends Auto {

    private int gangAnzahl = 0;

    public Audi_Q8(String farbe, int sitzAnzahl, int leistung, int tuerenAnzahl, String treibstoffTyp, int felgenGroesse, int gangAnzahl) {
        super(farbe, sitzAnzahl, leistung, tuerenAnzahl, treibstoffTyp, felgenGroesse);
        this.gangAnzahl = gangAnzahl;
    }

    public void launchControl() {

    }



}

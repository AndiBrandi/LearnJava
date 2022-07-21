package Java_Adv_Vererbung;

public class Motorrad extends Fahrzeug {

    String type = "";
    String treibstoffTyp = "";
    boolean beiwagen = false;

    public Motorrad(String farbe, int sitzAnzahl, int leistung, String type, String treibstoffTyp, boolean beiwagen) {
        super(farbe, sitzAnzahl, leistung);
        this.type = type;
        this.treibstoffTyp = treibstoffTyp;
        this.beiwagen = beiwagen;
    }

    public void doWheelie() {
        System.out.println("Motorrad macht einen wheelie");
    }

}

package Java_Adv_Vererbung;

public class KTM_Super_Duke extends Motorrad {

    String name = "KTM Super Duke";

    public KTM_Super_Duke(String farbe, String sitzAnzahl, int leistung, String type, String treibstoffTyp, boolean beiwagen, String name) {
        super(farbe, sitzAnzahl, leistung, type, treibstoffTyp, beiwagen);
        this.name = name;
    }

    @Override
    public void doWheelie() {
        super.doWheelie();
        System.out.println(name + " macht einen wheelie");
    }
}

package Java_Adv_Vererbung;

public class Main_Vererbung {

    public static void main(String[] args) {


        Tesla_Model_S tesla = new Tesla_Model_S("weiss", 5,1080,5,"Strom",21,3);
        tesla.aufladen();


        Fahrzeug fahrzeug = new Audi_Q8("schwarz", 5, 560, 5, "diesel",19,6);

    }

}

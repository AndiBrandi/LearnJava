package Java_Basic;

public class Bmw {
    static String companyName = "BMW Group";
    String model;
    String engine;
    int seatCount;

    public Bmw() {
    }

    public Bmw(String model, String engine, int seatCount) {
        this.model = model;
        this.engine = engine;
        this.seatCount = seatCount;
    }

    private void printDetails() {

        System.out.println(model + " , " + engine + " , " + seatCount);

    }

    public void drive() {

        System.out.println(model + "Bmw fährt");
    }

    public static void changeCompanyName(String newName) {

        companyName = newName;

    }


    public String addToName(String s) {

        model = model + " " + s;

        return model;
    }


    public String getModel() {
        return model;
    }

}

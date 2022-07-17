package Java_Basic;

public class Main_java_basic {

    public static void main(String[] args) {


        Bmw bmw = new Bmw("3er","V8", 4);


        bmw.drive();
        String s = bmw.addToName("test");


        Bmw.changeCompanyName("BMW Alliance");

    }

}


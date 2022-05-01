package Java_Basic;

public class Main_java_basic {

    public static void main(String[] args) {

//        File file = new File("...");


        Bmw bmw = new Bmw("3er","V8", 4);
        bmw.drive();
        String s = bmw.addString("test");


        Bmw.callCeo();

    }

}


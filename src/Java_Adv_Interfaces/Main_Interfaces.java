package Java_Adv_Interfaces;

public class Main_Interfaces {

    public static void main(String[] args) {

        Auto auto = new Auto(1);

        testVehicleTopSpeed(auto);


    }


    static void testVehicleTopSpeed(IDriveable vehicle) {

        int topSpeed;
        topSpeed = vehicle.accelerate();
        System.out.println(topSpeed);
    }

}

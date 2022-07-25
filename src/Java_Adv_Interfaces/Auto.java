package Java_Adv_Interfaces;

public class Auto implements IDriveable {

    int status;

    public Auto(int status) {
        this.status = status;
    }

    @Override
    public int accelerate() {

        return 230;
    }
}

package main.java.section_9.interfaces;

public class MobilePhone implements ITelephone{
    private int myNum;
    private boolean isOn = false;

    public MobilePhone(int num){
        this.myNum = num;
    }
    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile Phone is on");
    }

    @Override
    public void dial(int phoneNumber) {

        if (isOn) System.out.println("dialing... " + phoneNumber);
        else System.out.println("Mobile phone is off");
    }

    @Override
    public boolean isRinging() {
        System.out.println("Ring Ring...");
        return true;
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
        return true;
    }

    @Override
    public void answer() {
        System.out.println("Hola! como estas");
    }
}

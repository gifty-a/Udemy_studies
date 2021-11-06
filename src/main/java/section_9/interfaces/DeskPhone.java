package main.java.section_9.interfaces;

public class DeskPhone implements ITelephone{
    private int phoneNumber;
    public DeskPhone(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Power is on");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println(phoneNumber);
    }

    @Override
    public boolean isRinging() {
        System.out.println("ring ring");
        return false;
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        System.out.println("calling..." + phoneNumber);
        return false;
    }

    @Override
    public void answer() {
        System.out.println("Hola");
    }
}

package main.java.section_9.interfaces;

public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    boolean isRinging();
    boolean callPhone(int phoneNumber);
    void answer();
}

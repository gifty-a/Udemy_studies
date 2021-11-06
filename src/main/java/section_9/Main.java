package main.java.section_9;

import main.java.section_9.interfaces.DeskPhone;
import main.java.section_9.interfaces.ITelephone;

public class Main {
    public static void main(String[] args) {
        int phoneNumber = 1256;
        ITelephone homePhone = new DeskPhone(phoneNumber);
        homePhone.callPhone(((DeskPhone)homePhone).getPhoneNumber());
        homePhone.isRinging();
        homePhone.powerOn();
    }
}

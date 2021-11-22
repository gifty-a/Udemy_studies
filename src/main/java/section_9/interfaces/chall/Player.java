package main.java.section_9.interfaces.chall;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name;
    private String weapon;
    int hitPoints;
    int strength;

    public Player(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> detailsList  = new ArrayList<>();
        detailsList.add(this.name);
        detailsList.add(String.valueOf(this.hitPoints));
        detailsList.add(String.valueOf(this.strength));
        detailsList.add(this.weapon);
        return detailsList;
    }

    @Override
    public void read(List<String> list) {
        if (!list.isEmpty()) {
            this.setName(list.get(0));
            this.setHitPoints(Integer.parseInt(list.get(1)));
            this.setStrength(Integer.parseInt(list.get(2)));
            this.setWeapon(list.get(3));
        }
    }

    @Override
    public String toString() {
        return "Player{name = '" + this.name + "'}, hitpoints = "+ this.hitPoints + ", strength = " + this.strength + ", weapon = '" + this.weapon +"'}";
    }
}

package main.java.section_9.interfaces.chall;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints, strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> monsterList = new ArrayList<>();
        monsterList.add(this.name);
        monsterList.add(String.valueOf(this.hitPoints));
        monsterList.add(String.valueOf(this.strength));
        return null;
    }

    @Override
    public void read(List<String> list) {
        if (!list.isEmpty()){
            this.setName(list.get(0));
            this.setHitPoints(Integer.parseInt(list.get(1)));
            this.setStrength(Integer.parseInt(list.get(2)));
        }
    }

    @Override
    public String toString() {
        return "Monster{name = '" + this.name + "', hitPoints = " + this.hitPoints + "strength = " + this.strength + "}";
    }
}

package com.perscholas.java_basics;

public class WaterMonster extends Monster {
    // fields
    public String name;
    public String type;

    // constructors
    public WaterMonster(String monsterName, String monsterType) {
        super(monsterName);
        this.type = monsterType;
    }
    public WaterMonster(String monsterName){
        super(monsterName);
    }

    // methods
    @Override
    public String attack() {
        return "Attack with water! ";
    }

    // getters setters
}

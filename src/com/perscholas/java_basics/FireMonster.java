package com.perscholas.java_basics;

public class FireMonster extends Monster {
    // fields
    public String type;

    // constructors
    public FireMonster(String monsterName, String monsterType) {
        super(monsterName);
        this.type = monsterType;
    }
    public FireMonster(String monsterName){
        super(monsterName);
    }

    // methods
    @Override
    public String attack() {
        return "Attack with fire! ";
    }

    // getters setters
}

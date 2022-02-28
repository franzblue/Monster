package com.perscholas.java_basics;

public class StoneMonster extends Monster {
    // fields
    public String type;

    // constructors
    public StoneMonster(String monsterName, String monsterType) {
        super(monsterName);
        this.type = monsterType;
    }
    public StoneMonster(String monsterName){
        super(monsterName);
    }

    // methods
    @Override
    public String attack() {
        return "Attack with stone! ";
    }

    // getters setters
}

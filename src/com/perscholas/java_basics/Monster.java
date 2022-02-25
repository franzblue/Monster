package com.perscholas.java_basics;

public abstract class Monster {
    // fields
    public String name;

    // constructors
    public Monster(String monsterName) {
        this.name = monsterName;
    }

    // methods
    public abstract String attack();
    // getters setters
}

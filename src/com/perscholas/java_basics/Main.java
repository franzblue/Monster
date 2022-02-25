package com.perscholas.java_basics;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Program at the "interface" defined in the superclass
        // Declare instances of the superclass, substituted by subclasses.
        Monster m1 = new FireMonster("fire"); // upcast
        Monster m2 = new WaterMonster("water"); // upcast
        Monster m3 = new StoneMonster("stone"); // upcast

        // Invoke the actual implementation
        System.out.println(m1.attack() + m1.name); // Run com.perscholas.java_basics.FireMonster's attack()
        System.out.println(m2.attack() + m2.name); // Run WaterMonster's attack()
        System.out.println(m3.attack() + m3.name); // Run StoneMonster's attack()

         // m1 dies, generate a new instance and re-asign to m1.
        m1 = new StoneMonster("a2b2");
        System.out.println(m1.attack() + m1.name);

        // We have a problem here!!!
        Monster m4 = new Monster("u2u2") {
            public String attack() {
                return "!^_&^$@+%$* I don't know how to attack!";
            }
        };
        System.out.println(m4.attack() + m4.name); // garbage!!!
    } // main
} // class

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
        m1 = new StoneMonster("new stone");
        System.out.println(m1.attack() + m1.name);

        // We have a problem here!!!
        Monster m4 = new Monster("air");
        System.out.println(m4.attack() + m4.name); // garbage!!!
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classicmodels?user=root&password=root");
            String SelectSQL = "SELECT * FROM employees";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(SelectSQL);
            while(result.next()) {
                String name = result.getString("firstName");
                String email = result.getString("email");
                System.out.println(name + " | " + email);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    } // main
} // class

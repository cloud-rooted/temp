// |-> NOTE <-|

// to compile this, command is  'this sql connector is present '
// javac -cp ".;mysql-connector-j-9.5.0.jar" JDBCDemo.java

// to run this compiled file command is
// java -cp ".;mysql-connector-j-9.5.0.jar" JDBCDemo  

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "jdbcuser",
                "jdbc123"
            );

            Statement stmt = con.createStatement();

            // First SELECT
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            System.out.println("Before Insert:");
            System.out.println("ID\tName\tMarks");
            while (rs.next()) {
                System.out.println(
                    rs.getInt(1) + "\t" +
                    rs.getString(2) + "\t" +
                    rs.getInt(3)
                );
            }

            // INSERT
            int rowsInserted = stmt.executeUpdate(
                "INSERT INTO student VALUES " +
                "(1, 'Reacher', 98), " +
                "(2, 'Jack', 92)"
            );
            System.out.println("\n" + rowsInserted + " records inserted.\n");

            // Second SELECT
            ResultSet rs2 = stmt.executeQuery("SELECT * FROM student");
            System.out.println("After Insert:");
            System.out.println("ID\tName\tMarks");
            while (rs2.next()) {
                System.out.println(
                    rs2.getInt(1) + "\t" +
                    rs2.getString(2) + "\t" +
                    rs2.getInt(3)
                );
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

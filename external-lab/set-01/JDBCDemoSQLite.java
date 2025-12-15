// compile this code as 
// javac -cp ".;sqlite-jdbc-3.42.0.0.jar" JDBCDemoSQLite.java

// Run this code as
// java -cp ".;sqlite-jdbc-3.42.0.0.jar" JDBCDemoSQLite

import java.sql.*;

public class JDBCDemoSQLite {
    public static void main(String[] args) {
        try {
            // SQLite connection (DB file will be created automatically)
            Connection con = DriverManager.getConnection(
                "jdbc:sqlite:student.db"
            );

            Statement stmt = con.createStatement();

            // Create table if not exists
            String createTable =
                "CREATE TABLE IF NOT EXISTS student (" +
                "id INTEGER PRIMARY KEY, " +
                "name TEXT, " +
                "marks INTEGER" +
                ")";
            stmt.execute(createTable);

            // First SELECT
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            System.out.println("Before Insert:");
            System.out.println("ID\tName\tMarks");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getInt("marks")
                );
            }

            // INSERT
            int rowsInserted = stmt.executeUpdate(
                "INSERT OR IGNORE INTO student VALUES " +
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
                    rs2.getInt("id") + "\t" +
                    rs2.getString("name") + "\t" +
                    rs2.getInt("marks")
                );
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

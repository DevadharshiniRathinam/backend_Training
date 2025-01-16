package Day12;

import java.sql.*;

public class SimpleStudentMarks {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/SchoolDB";
        String user = "root";
        String password = "yourpassword";
        String query = "INSERT INTO StudentMarks (name, roll_no, marks) VALUES (?, ?, ?)";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, "John Doe");
            stmt.setString(2, "S12345");
            stmt.setInt(3, 85);
            stmt.executeUpdate();
            stmt.setString(1, "Jane Smith");
            stmt.setString(2, "S12346");
            stmt.setInt(3, 92);
            stmt.executeUpdate();
            stmt.setString(1, "Michael Johnson");
            stmt.setString(2, "S12347");
            stmt.setInt(3, 78);
            stmt.executeUpdate();
            System.out.println("3 student records inserted successfully!");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

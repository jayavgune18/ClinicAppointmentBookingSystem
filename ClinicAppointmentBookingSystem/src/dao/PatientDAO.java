package dao;
import java.sql.*;
import models.Patient;
import util.DBConnection;


public class PatientDAO {
    public static void addPatient(Patient p) {
        String sql = "INSERT INTO Patient (FirstName, LastName, Phone) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection()) {
            if (conn == null) {
                System.out.println("DB connection failed. Cannot add patient.");
                return;
            }
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, p.firstName);
            ps.setString(2, p.lastName);
            ps.setString(3, p.phone);
            ps.executeUpdate();
            System.out.println("Patient added successfully.");
        } catch (SQLException e) {
            System.out.println("Error adding patient:");
            e.printStackTrace();
        }
    }

    public static void listPatients() {
        try (Connection conn = DBConnection.getConnection(); Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM Patient");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("PatientID") +
                                   ", Name: " + rs.getString("FirstName") + " " + rs.getString("LastName") +
                                   ", Phone: " + rs.getString("Phone"));
            }
        } catch (SQLException e) {
            System.out.println("Error fetching patients: " + e.getMessage());
        }
    }
}

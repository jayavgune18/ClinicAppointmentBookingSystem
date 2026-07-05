package dao;

import java.sql.*;
import models.Doctor;
import util.DBConnection;

public class DoctorDAO {
    public static void addDoctor(Doctor d) {
        String sql = "INSERT INTO Doctor (Name, Specialization) VALUES (?, ?)";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, d.name);
            ps.setString(2, d.specialization);
            ps.executeUpdate();
            System.out.println("Doctor added successfully.");
        } catch (SQLException e) {
            System.out.println("Error adding doctor: " + e.getMessage());
        }
    }

    public static void listDoctors() {
        try (Connection conn = DBConnection.getConnection(); Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM Doctor");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("DoctorID") +
                                   ", Name: " + rs.getString("Name") +
                                   ", Specialization: " + rs.getString("Specialization"));
            }
        } catch (SQLException e) {
            System.out.println("Error fetching doctors: " + e.getMessage());
        }
    }
}

package dao;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import models.Appointment;
import util.DBConnection;
public class AppointmentDAO {
    public static void bookAppointment(Appointment a) {
        String sql = "INSERT INTO Appointment (PatientID, DoctorID, AppointmentDate, AppointmentTime) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, a.patientID);
            ps.setInt(2, a.doctorID);
            ps.setDate(3, Date.valueOf(a.date));
            ps.setTime(4, Time.valueOf(a.time));
            ps.executeUpdate();
            System.out.println("Appointment booked successfully.");
        } catch (SQLException e) {
            System.out.println("Error booking appointment: " + e.getMessage());
        }
    }

    public static void listAppointments() {
        String sql = "SELECT a.AppointmentID, p.FirstName, p.LastName, d.Name, d.Specialization, a.AppointmentDate, a.AppointmentTime " +
                     "FROM Appointment a " +
                     "JOIN Patient p ON a.PatientID = p.PatientID " +
                     "JOIN Doctor d ON a.DoctorID = d.DoctorID";
        try (Connection conn = DBConnection.getConnection(); Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println("Appointment ID: " + rs.getInt("AppointmentID") +
                                   ", Patient: " + rs.getString("FirstName") + " " + rs.getString("LastName") +
                                   ", Doctor: " + rs.getString("Name") +
                                   " (" + rs.getString("Specialization") + ")" +
                                   ", Date: " + rs.getDate("AppointmentDate") +
                                   ", Time: " + rs.getTime("AppointmentTime"));
            }
        } catch (SQLException e) {
            System.out.println("Error listing appointments: " + e.getMessage());
        }
    }
}

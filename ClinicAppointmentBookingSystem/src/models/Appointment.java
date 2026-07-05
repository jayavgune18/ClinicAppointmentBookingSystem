package models;
import util.DBConnection;
import java.time.LocalDate;
import java.time.LocalTime;


public class Appointment {
    public int id;
    public int patientID;
    public int doctorID;
    public LocalDate date;
    public LocalTime time;

    public Appointment(int patientID, int doctorID, LocalDate date, LocalTime time) {
        this.patientID = patientID;
        this.doctorID = doctorID;
        this.date = date;
        this.time = time;
    }
}

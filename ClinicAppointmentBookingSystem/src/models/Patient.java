package models;
import util.DBConnection;

public class Patient {
    public int id;
    public String firstName;
    public String lastName;
    public String phone;

    public Patient(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }
}

package models;
import util.DBConnection;


public class Doctor {
    public int id;
    public String name;
    public String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }
}

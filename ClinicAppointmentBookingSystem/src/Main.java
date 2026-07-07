import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import dao.*;
import models.*;
import util.DBConnection;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Clinic Appointment Booking System ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Book Appointment");
            System.out.println("4. View All Appointments");
            System.out.println("5. View All Patients");
            System.out.println("6. View All Doctors");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("First Name: ");
                    String fn = sc.nextLine();
                    System.out.print("Last Name: ");
                    String ln = sc.nextLine();
                    System.out.print("Phone: ");
                    String phone = sc.nextLine();
                    PatientDAO.addPatient(new Patient(fn, ln, phone));
                    break;
                case 2:
                    System.out.print("Doctor Name: ");
                    String name = sc.nextLine();
                    System.out.print("Specialization: ");
                    String spec = sc.nextLine();
                    DoctorDAO.addDoctor(new Doctor(name, spec));
                    break;
                case 3:
                    System.out.print("Patient ID: ");
                    int pid = sc.nextInt();
                    System.out.print("Doctor ID: ");
                    int did = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Appointment Date (YYYY-MM-DD): ");
                    LocalDate date = LocalDate.parse(sc.nextLine());
                    System.out.print("Appointment Time (HH:MM): ");
                    LocalTime time = LocalTime.parse(sc.nextLine() + ":00");
                    AppointmentDAO.bookAppointment(new Appointment(pid, did, date, time));
                    break;
                case 4:
                    AppointmentDAO.listAppointments();
                    break;
                case 5:
                    PatientDAO.listPatients();
                    break;
                case 6:
                    DoctorDAO.listDoctors();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

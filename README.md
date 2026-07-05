# 🏥 Clinic Appointment Booking System

A **Java-based console application** that helps clinics manage patient appointments efficiently.  
The system allows clinic staff to handle doctors, patients, and appointments digitally, reducing manual work and scheduling errors.

---

## 📌 About the Project

Healthcare is one of the most essential needs in any society. With the rise in technology, the need to digitize healthcare services such as appointment bookings has become increasingly important. The **Clinic Appointment Booking System** is a software solution developed in Java to simplify the process of scheduling patient appointments. It reduces paperwork, eliminates booking conflicts, and enhances the patient experience through a digital interface.

This project focuses on **automation, accuracy, and better patient management**.

---

## 🎯 Project Goals

- Simplify the appointment booking process  
- Avoid duplicate or conflicting appointments  
- Manage patient and doctor records digitally  
- Improve overall clinic workflow efficiency  
- Store appointment and user data in a structured and secure way  
- Generate reports of patient visits and appointment history  

---

## ❗ Problem Statement

Traditional appointment booking in clinics is time-consuming, prone to human error, and lacks real-time availability. Patients may face long queues or repeated follow-ups for scheduling. Similarly, managing doctor availability manually is inefficient. This project solves these issues by introducing an automated appointment system that allows patients to book appointments based on real-time doctor availability.

---

## ✨ Key Features

- 👤 **Patient Registration & Management** – Add, view, and manage patient records  
- 🩺 **Doctor Management** – Add and manage doctor profiles with specializations  
- 📅 **Appointment Booking** – Book appointments by selecting patient, doctor, date, and time  
- 📋 **View All Appointments** – Display all scheduled appointments  
- 📂 **View Patient & Doctor Records** – Browse registered patients and doctors  
- ❌ **Cancel Appointments** – Remove appointments when required  
- 🖥️ **Console-Based Menu** – Simple and intuitive command-line interface  

---

## 🛠️ Tech Stack

| Technology          | Purpose                  |
|---------------------|--------------------------|
| **Java (JDK 8+)**   | Core programming language |
| **Java Scanner**    | Console-based user input  |
| **MySQL**           | Database                  |
| **JDBC**            | Database connectivity     |
| **Eclipse / NetBeans** | IDE                    |

---

## 💻 System Requirements

### Hardware
- Intel Core i3 or higher processor  
- Minimum 4 GB RAM  
- 500 MB free disk space  

### Software
- Windows 7/8/10/11 or Linux  
- Java JDK 8 or above  
- MySQL Server  
- Java IDE (Eclipse / NetBeans / IntelliJ)  

---

## 🗄️ Database Schema

The system uses a MySQL database named `ClinicDB` with three tables:

### Patient Table
| Column      | Type         | Description          |
|-------------|--------------|----------------------|
| PatientID   | INT (PK, AI) | Unique patient ID    |
| FirstName   | VARCHAR(50)  | Patient first name   |
| LastName    | VARCHAR(50)  | Patient last name    |
| Phone       | VARCHAR(15)  | Contact number       |

### Doctor Table
| Column         | Type         | Description         |
|----------------|--------------|---------------------|
| DoctorID       | INT (PK, AI) | Unique doctor ID    |
| Name           | VARCHAR(100) | Doctor full name    |
| Specialization | VARCHAR(50)  | Medical specialty   |

### Appointment Table
| Column          | Type         | Description              |
|-----------------|--------------|--------------------------|
| AppointmentID   | INT (PK, AI) | Unique appointment ID    |
| PatientID       | INT (FK)     | References Patient       |
| DoctorID        | INT (FK)     | References Doctor        |
| AppointmentDate | DATE         | Date of appointment      |
| AppointmentTime | TIME         | Time of appointment      |

---

## 📁 Project Structure

```
ClinicAppointmentBookingSystem/
├── sql/
│   └── clinicdb_schema.sql          # Database schema script
├── src/
│   ├── Main.java                    # Entry point with console menu
│   ├── dao/
│   │   ├── PatientDAO.java          # Patient data access operations
│   │   ├── DoctorDAO.java           # Doctor data access operations
│   │   └── AppointmentDAO.java      # Appointment data access operations
│   ├── models/
│   │   ├── Patient.java             # Patient model class
│   │   ├── Doctor.java              # Doctor model class
│   │   └── Appointment.java         # Appointment model class
│   └── util/
│       └── DBConnection.java        # JDBC database connection utility
└── README.md
```

---

## ⚙️ Application Workflow

1. Admin adds doctor details into the system  
2. Patient information is registered  
3. Appointments are booked based on availability  
4. Appointment details are stored in the database  
5. Admin can view or manage all records  

---

## 🗂️ Functional Modules (Console Menu)

| Option | Description            |
|--------|------------------------|
| 1      | Add Patient            |
| 2      | Add Doctor             |
| 3      | Book Appointment       |
| 4      | View All Appointments  |
| 5      | View All Patients      |
| 6      | View All Doctors       |
| 7      | Exit                   |

---

## 🚀 Setup & Installation

### 1. Clone or Download the Project
```bash
git clone https://github.com/jayavgune18/ClinicAppointmentBookingSystem.git
```

### 2. Set Up the Database
- Open MySQL command line or any MySQL client (e.g., MySQL Workbench)  
- Run the schema script to create the database and tables:
```bash
mysql -u root -p < sql/clinicdb_schema.sql
```

### 3. Configure Database Connection
Open `src/util/DBConnection.java` and update the database credentials if needed:
```java
private static final String URL = "jdbc:mysql://localhost:3306/ClinicDB";
private static final String USER = "root";
private static final String PASSWORD = "your_password";
```

### 4. Compile and Run
Using command line:
```bash
cd src
javac Main.java
java Main
```

Or open the project in **Eclipse / NetBeans / IntelliJ** and run `Main.java`.

---

## 📸 Screenshots

The application includes the following console screens:
- Add Patient screen  
- Add Doctor screen  
- Appointment booking screen  
- Appointment list  
- Patient list  
- Doctor list  

---

## 🚀 Future Scope

- Online appointment booking via web interface  
- Email / SMS notifications for appointment reminders  
- Web-based version using Java Servlets / Spring Boot  
- Payment integration for paid consultations  
- Advanced reporting and analytics system  
- Graphical UI using Java Swing / JavaFX  

---

## 📄 Conclusion

The Clinic Appointment Booking System offers a practical and efficient solution for both patients and clinic staff. By digitizing the process, it saves time, ensures better patient management, and helps clinics operate more smoothly. The project demonstrates the application of core Java concepts, console-based I/O, and database integration, making it an ideal academic or real-world project.

---

## 📬 Contact

**Developer:** Jay Avgune  
- **Email:** [jayavgune18@gmail.com](mailto:jayavgune18@gmail.com)  
- **LinkedIn:** [https://www.linkedin.com/in/jay-avgune/](https://www.linkedin.com/in/jay-avgune/)  

---

## 📝 License

This project is for educational and demonstration purposes.
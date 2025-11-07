import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Appointment {
    private int id;
    private int patientId;
    private int doctorId;
    private LocalDateTime dateTime;

    // Formatter to display date and time cleanly
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public Appointment(int id, int patientId, int doctorId, LocalDateTime dateTime) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.dateTime = dateTime;
    }

    // Getters
    public int getId() { return id; }
    public int getPatientId() { return patientId; }
    public int getDoctorId() { return doctorId; }
    public LocalDateTime getDateTime() { return dateTime; }

    // toString method for easy display
    @Override
    public String toString() {
        return "Appointment ID: " + id + 
               ", Patient ID: " + patientId + 
               ", Doctor ID: " + doctorId + 
               ", Date/Time: " + dateTime.format(FORMATTER);
    }
}
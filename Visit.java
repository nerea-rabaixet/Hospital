
import java.util.Date;

public class Visit{
	Date date;
	String summary;
	Doctor doctor;
	Patient patient;

	public Visit(Date date, String summary, Doctor doctor, Patient patient) {
		this.date = date;
		this.summary = summary;
		this.doctor = doctor;
		this.patient = patient;
	}

	public Date getDate() {
		return date;
	}

	public String getSummary() {
		return summary;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	@Override
	public String toString() {
		String returnstring = null;
		returnstring = "Date of visit: " + date.toString() + ", summary of the visit: " + summary + ". Visit with " + doctor.toString() + " with patient " + patient.toString() + "\n";
		return returnstring;
	}
}

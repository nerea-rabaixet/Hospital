
import java.util.LinkedList;
import java.util.Collections;

public class Hospital{
	private LinkedList< Administrative > admins;
	private LinkedList< Doctor > doctors;
	private LinkedList< Patient > patients;
	private LinkedList< Room > rooms;
	private LinkedList< Visit > visits;
	private String name;

	public Hospital( String name ){
		this.name = name;
		admins = new LinkedList<>();
		doctors = new LinkedList<>();
		patients = new LinkedList<>();
		rooms = new LinkedList<>();
		visits = new LinkedList<>();
	}
	
	public void addAdmin( Administrative a ){	
		admins.add(a);
	}

	public Administrative getAdmin( int idx ){
		return admins.get(idx);
	}
	
	public void addDoctor( Doctor d ){
		doctors.add(d);
	}

	public Doctor getDoctor( int idx ){
		return doctors.get(idx);
	}

	public void addRoom( int id ){
		rooms.add(new Room(id));
	}

	public Room getRoom( int idx ){
		return rooms.get(idx);
	}	
	
	public LinkedList< Room > getRooms(){
		return rooms;
	}
	
	public void addResident(  int id, String name, int age ){
		this.patients.add(new Resident(id, name, age));
	}
	
	public void addVisitor( int id, String name, int age ){
		this.patients.add(new Visitor(id, name, age));
	}
	
	public void addVisit( Visit v ){
		visits.add(v);
	}
	
	public Visit getVisit( int idx ){
		return visits.get(idx);
	}
	
	public Patient getPatient( int idx ){
		return patients.get(idx);
	}

	public void deletePatient( int idx ){
		patients.remove(idx);
	}
	
	public void assignBeds( int adminIdx ){
		for (int i = 0; i < patients.size(); i++){
			if(patients.get(i) instanceof Resident){
				this.admins.get(adminIdx).assignBed((Resident) patients.get(i));
			}
		}
	}

	public void sortPatients(){
		Collections.sort(patients);
	}

	@Override
	public String toString() {
		String adminslist = (admins.get(0).toString() + " ");
		for(int i = 0;i < admins.size(); i++){
			if (i != 0){
				adminslist += (admins.get(i).toString() + " ");
			}
		}
		String doctorslist = (doctors.get(0).toString() + " ");
		for(int i = 0;i < doctors.size(); i++){
			if (i != 0){
				doctorslist += (doctors.get(i).toString() + " ");
			}
		}
		String patientslist = (patients.get(0).toString() + " ");
		for(int i = 0;i < patients.size(); i++){
			if (i != 0){
				patientslist += (patients.get(i).toString() + " ");
			}
		}
		String visitslist = (visits.get(0).toString() + " ");;
		for(int i = 0;i < visits.size(); i++){
			if (i != 0){
				visitslist += (visits.get(i).toString() + " ");
			}
		}
		String roomslist = (rooms.get(0).toString() + " ");;
		for(int i = 0;i < rooms.size(); i++){
			if (i != 0){
				roomslist += (rooms.get(i).toString() + " ");
			}
		}
		String returnstring = null;
		returnstring = name + "\n" + "Administratives: \n" + adminslist + "Doctors: \n" + doctorslist + "Patients: \n" + patientslist + "Visits: \n" + visitslist + "Rooms: \n" + roomslist;
		return returnstring;
	}

}


import java.util.LinkedList;
import java.util.Date;

public class Administrative extends Person
{

	private Hospital hospital;

	public Administrative(int id, String name, Hospital hospital) {
		super(id, name);
		this.hospital = hospital;
	}


	public void addVisit( Date d, String s, Doctor doc, Patient p ){
		hospital.addVisit(new Visit(d,s,doc,p));
		p.addVisit(new Visit(d,s,doc,p));
	}

	public boolean assignBed(Resident resident  ){
		boolean roomav = false;
		for(int i = 0; i < this.hospital.getRooms().size(); i++){
			resident.assignBed(this.hospital.getRooms().get(i).getAvailableBed());
			if(this.hospital.getRooms().get(i).getAvailableBed() != null){
				this.hospital.getRooms().get(i).getAvailableBed().assignResident(resident);
				resident.assignRoom(this.hospital.getRooms().get(i));
				String doctorstring = null;
				if (resident.getDoctor() == null){
					doctorstring = "has no doctor assigned \n";
				}
				else{
					doctorstring = resident.getDoctor().toString();
				}
				System.out.println(toString() + "has assigned bed to " + resident.toString() + " is assigned to Room " + resident.getRoom().getRoomID() + " Bed " + resident.getBed().getBedID() + " and " + doctorstring);
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String returnstring = null;
		returnstring = "Administrative: " + getName() + ", (ID: " + getID() + ") \n";
		return returnstring;
	}

}

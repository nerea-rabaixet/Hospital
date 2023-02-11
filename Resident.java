public class Resident extends Patient {
	private Room room;
	private Bed bed;

	public Resident ( int id, String name, int age ){
		super(id, name, age);
	}

	public Bed getBed() {
		return bed;
	}

	public Room getRoom() {
		return room;
	}

	public void assignRoom(Room r ){
		this.room = r;
	}
	
	public void assignBed( Bed b ){
		this.bed = b;
	}
	
	public Doctor getDoctor(){
		if (visits.size() != 0){
			return visits.get(0).getDoctor();
		}else{
			return null;
		}
	}

	@Override
	public String toString() {
		String returnstring = null;
		returnstring = "Resident " + getName() + "(ID " + getID() + ", age " + getAge() + ")\n";
		return returnstring;
	}


}

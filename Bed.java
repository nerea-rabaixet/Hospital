public class Bed{
	private int bedID;
	private Room room;
	private Resident resident;
		
	public Bed( int id, Room r ){
		assignRoom(r);
		this.bedID = id;
	}
	
	public void assignRoom( Room r ){
		this.room = r;
	}
	
	public void assignResident( Resident r ){
		this.resident = r;
	}
	
	public void release(){
		assignResident(null);
	}
	
	public int getBedID(){
		return bedID;
	}

	public boolean isAvailable(){
		return this.resident == null;
	}

	@Override
	public String toString() {
		String returnstring = null;
		returnstring = Integer.toString(bedID);
		return "Bed " + returnstring + "\n";
	}
}

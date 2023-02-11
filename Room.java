
import java.util.LinkedList;

public class Room{
	private LinkedList< Bed > beds;
	private int roomID;
	
	public Room( int roomID ){
		this.roomID = roomID;
		beds = new LinkedList<>();
	}
	
	public void addBed( int bedID ){
		beds.add(new Bed( bedID, this ));
	}
	
	public Bed getBed( int idx ){
		return beds.get(idx);
	}
	
	public Bed getAvailableBed(){
		for(int i = 0;i < beds.size(); i++){
			if (beds.get(i).isAvailable()){
				return beds.get(i);
			}
		}
		return null;
	}

	public int getRoomID() {
		return roomID;
	}

	public boolean isAvailable(){
		return getAvailableBed() != null;
	}
	
	public String listBeds(){
		String list = null;
		for(int i = 0;i < beds.size(); i++){
			if (beds.get(i).isAvailable()){
				list += beds.get(i).toString();
			}
		}
		return list;
	}

	public String toString() {
		String bedslist = (beds.get(0).toString() + " ");;
		for(int i = 0;i < beds.size(); i++){
			if (i != 0){
				bedslist += (beds.get(i).toString() + "\n");
			}
		}
		String returnstring = null;
		returnstring = "Room " + getRoomID() + "\n" + bedslist;
		return returnstring;
	}


}

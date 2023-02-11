public class Person{
	public int id;
	public String name;
	
	public Person( int id, String name ){
		setID(id);
		setName(name);
	}
	
	public int getID(){
		return id;
	}
	public String getName(){
		return name;
	}
	public void setID( int id ){
		this.id = id;
	}
	public void setName( String name ){
		this.name = name;
	}

	@Override
	public String toString() {
		String returnstring = null;
		returnstring = id + name;
		return returnstring;
	}
}

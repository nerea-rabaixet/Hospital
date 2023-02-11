public class Visitor extends Patient
{
	public Visitor( int id, String name, int age ){
		super(id, name, age);
	}

	@Override
	public String toString() {
		String returnstring = null;
		returnstring = "Visitor " + getName() + " (ID " + getID() + ", age " + getAge() + ") \n";
		return returnstring;
	}
}

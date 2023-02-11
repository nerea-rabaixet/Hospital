
import java.util.LinkedList;
import java.util.Date;

public class Patient extends Person implements Comparable<Patient>{
	protected Date admissionDate;
	protected Integer age;
	protected LinkedList< Visit > visits;

	public Patient( int id, String name, int age ){
		super(id, name);
		setAge(age);
		visits = new LinkedList<>();
	}
	
	public void addVisit( Visit v ){
		visits.add(v);
	}
		
	public void setAdmissionDate( Date d ){
		this.admissionDate = d;
	}
	
	public Date getAdmissionDate(){
		return admissionDate;
	}
	
	public void setAge( Integer age ){
		this.age = age;
	}
	
	public Integer getAge(){
		return age;
	}

	public int compareTo( Patient p ){
		return Integer.compare(getAge(),p.getAge());
	}

	@Override
	public String toString() {
		String visitslist = null;
		for(int i = 0;i < visits.size(); i++){
			visitslist += (visits.get(i).toString() + " ");
		}
		String returnstring = null;
		returnstring = getName() + getID() + age + visitslist;
		return returnstring;
	}
}

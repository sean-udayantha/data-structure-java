package linklist;

public class link {

	public String name;
	public double avarage;
	public link Next;
	
	public  link(String name , double avg) {
		this.name=name;
		this.avarage = avg;
		Next = null;
	}
	
	public void displayDetails() {
		System.out.println(name +""+ avarage);
	}
	//test1 
	
	
	
	
}

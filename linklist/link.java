package linklist;

public class link {

	public String name;// data item
	public double avarage;// data item
	public link Next; // reference to the next link
	
	public  link(String name , double avg) {// constructor
		this.name=name;
		this.avarage = avg;
		Next = null;
	}
	
	public void displayDetails() {// display data item
		System.out.println(name +""+ avarage);
	}
	//test1 
	
	
	
	
}

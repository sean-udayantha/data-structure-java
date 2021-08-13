package linklist;

public class linklist {
	public link first;


	public linklist() {
		
		first =null;
		
		
	}
	
public boolean IsEmpty(){
	return (first==null);
}	
public void insertFrist(String name,double avg) {
	link newlink=new link(name,avg);
	newlink.Next = first;
	 first=newlink;
}

public link deleteFirst(){
	link temp = first;
    first = first.Next;
    return temp;

}	
	public void displaylist(){
		
		link current = first;
        while (current != null) {
            current.displayDetails();
             current = current.Next;
        }
        System.out.println("");

		
	}
}

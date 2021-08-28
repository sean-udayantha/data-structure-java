package linklist;

public class linklist {
	public link first;


	public linklist() {
		
		first =null;
		
		
	}
	
public boolean IsEmpty(){// true if list is empty
	return (first==null);
}	

//insertFirst Method
public void insertFrist(String name,double avg) {
	link newlink=new link(name,avg);
	newlink.Next = first;
	 first=newlink;
}

//deleteFirst Method
public link deleteFirst(){
	link temp = first;
    first = first.Next;
    return temp;

}	
 //using current to searching to the linked list item 
	public void displaylist(){
		
		link current = first;
        while (current != null) {
            current.displayDetails();
             current = current.Next;
        }
        System.out.println("");

		
	}
	
	
}

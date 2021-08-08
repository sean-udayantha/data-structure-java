package Queue;



public class QueueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueX  theQueue = new QueueX(3);  // create a queue with max size 10
		
		 theQueue. insert(10); 
		 theQueue. insert(20);
		 theQueue. insert(30); 
		 theQueue. insert(40);
		 
		 System.out.println("starting remove the Queue");
		 
		 while( !theQueue.isEmpty() ) {    // until it is empty, delete item from queue
				
				int val = theQueue.remove();
				System.out.println(val);
				System.out.print("");
			}
	 
	}

}

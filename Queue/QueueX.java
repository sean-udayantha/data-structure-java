package Queue;

public class QueueX {

	private int maxSize;    // size of queue array
    private int  queArray[];
    private int front;           //front of the queue 
    private int rear;           //rear of the queue
    private int nItems;  //no of items of the queue
    public QueueX(int maxSize){
    	this.maxSize = maxSize;
    	queArray = new int [maxSize];
    	front = 0;
   	    rear = -1;
   	    nItems = 0;             

    }
	
	public void insert(int j) {
		// increment rear and insert an item
		if (nItems == maxSize) {
	       System.out.println("Queue is full");
		}
		else{
		 queArray[++rear] = j;
		 nItems++;
		 System.out.println("rear:"+rear+"  nItems:"+nItems+"");
		 System.out.println("queArray:"+queArray[rear]);
		 System.out.println( "array length"+queArray.length);
		 System.out.println("*************************************************");
		}
		 
	      }
	
	//peek function
     public int peekFront() {
	      if (nItems == 0)  {
	           System.out.println("Queue is empty");
	           return -99; 
	       }
	      else {
	           return queArray[front];
	      }
	}
     // remove function
     public int remove() {
        if (nItems == 0)  {
            System.out.println("Queue is empty");
            return -99; 
        }
        else   {
            nItems--;
            return queArray[front++];
        }
    }
   //check the array   
public boolean isEmpty(){
	 if (nItems == 0)  {
         System.out.println("Queue is empty");
         return true; 
     }
    else {
         return false;
    }
}
//check the array
public boolean isfull(){
	 if (nItems == maxSize)  {
         System.out.println("Queue is full");
         return true; 
     }
    else {
         return false;
    }
}
}


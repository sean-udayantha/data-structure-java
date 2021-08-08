package Stack;

public class StackX {
	private int maxSize;    // size of queue array
    private int  stackArray[];
    private int top;           
     
    public StackX(int maxSize){
    	this.maxSize = maxSize;
    	stackArray = new int [maxSize];
    	 top=-1;          

    }
    //push function
    public void push(int a) {
        
// check whether stack is full
                    if (top == (maxSize-1)) {
                        System.out.println("Stack is full");
                        System.out.println("*********************************");
                    }
                   else {
                         stackArray[++top]=a;
                         System.out.println("top is:"+top);
                         System.out.println("*******************************");
                         }
   
    }
   
    //pop function
    public int pop() {
    	if (top == -1)
    	      return -99;
        else
    	      return stackArray[top--];
          }
  //peek function
    public int peek() {
    	if (top == -1)
    	      return -99;
        else
    	      return stackArray[top];
          }
  //check the array
    public boolean isEmpty(){
   	 if (top == -1)  {
            System.out.println("Queue is empty");
            return true; 
        }
       else {
            return false;
       }
   }
    //check the array
   public boolean isfull(){
   	 if (top == (maxSize-1)) {
            System.out.println("Queue is full");
            return true; 
        }
       else {
            return false;
       }   
    
   }
}

package Stack;

public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         StackX  theStack = new StackX(3);  // create a stack with max size 10
         System.out.println("add the element the stack");
		theStack.push(30);  // insert given items
		theStack.push(80);
		theStack.push(100);
		theStack.push(25);
		 //my first commit
		//my 2nd commit
	System.out.println("starting remove the stack");
	
	while( !theStack.isEmpty() ) {    // until it is empty, delete item from stack
		
			int val = theStack.pop();
			System.out.println(val);
			System.out.print("");
		}

		
		
		
		
		
		
		
		
		
		
		
	}

}

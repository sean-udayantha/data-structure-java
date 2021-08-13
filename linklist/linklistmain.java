package linklist;

public class linklistmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				/*link L1= new link("nipuna",53.5);
			      link L2= new link("aravinda",78.0);
			     link L3= new link("prashani",69.5);
				
				L1.Next =L2;
				L2.Next =L3;
				L3.Next =null;
				L1.Next .Next.displayDetails();*/
				
				linklist thelist =new linklist();
				
				thelist.insertFrist("prashani",69.5);
				thelist.insertFrist("aravinda",78.0);
				thelist.insertFrist("nipuna",53.5);
				
				thelist.displaylist();
	}

}

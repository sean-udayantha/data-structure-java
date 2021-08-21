package Tree;

public class Treemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Tree T1 = new Tree();
		
		T1.insert(149,"Anusha");
		T1.insert(150,"Kosala");
		T1.insert(160,"Dinusha");
		T1.insert(130,"Malith");
		T1.insert(155,"Kamal");
		
		System.out.println("InOrder (Left, Root, Right)");
		T1.TraverseinOrder();
		
		System.out.println("PreOrder (Root, Left, Right)");
		T1.TraversepreOrder();
		
		System.out.println("PostOrder (Left, Right, Root)");
		T1.TraversepostOrder();
		
		T1.find(160);
		
		T1.deleteAll();
	}

}

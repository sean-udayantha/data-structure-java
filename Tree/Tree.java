package Tree;
//import com.sun.source.tree.WhileLoopTree;
public class Tree {

	
	private Node root; 
	
	
public void insert(int Eno, String Name) {
		
		Node newNode = new Node(); //Create a new node
		newNode.EmpNo = Eno; //assign the EmpNo to the new node
		newNode.name = Name; //assign the name to the new node
		 
		if (root == null)//checking the tree is empty
		{
			root = newNode;//if the tree is empty make the new node as root
		}
		
		else
		{
			Node current = root;
			Node parent;
			
			while (true) {
				parent = current;
				if (Eno < current.EmpNo)//left 
				{
					current = current.leftChild;
					if (current == null) 
					{
					   parent.leftChild = newNode;
					   return;
					}
					
				}
				
				else //right
				{
					current = current.rightChild;
					if (current == null)
					{
						parent.rightChild = newNode;
						return;
						
					}
				}
			}
			
		}
	}
	
private void inOrder(Node localRoot) //left,root,right
{
	
	if (localRoot != null) 
	{
		inOrder(localRoot.leftChild);
		localRoot.displayNode();
		inOrder(localRoot.rightChild);
		
	}
	
}

public void TraverseinOrder() {
	
	inOrder(root);
	
}
private void preOrder(Node localRoot) //root,left,right
{
	if (localRoot != null) 
	{
	  localRoot.displayNode();
	  preOrder(localRoot.leftChild);
	  preOrder(localRoot.rightChild);
	}
	
}

public void TraversepreOrder()
{
	preOrder(root);
}

private void postOrder(Node localRoot) //left,right,root
{
	if (localRoot != null) 
	{
		postOrder(localRoot.leftChild);
		postOrder(localRoot.rightChild);
		localRoot.displayNode();
		
	}
}

public void TraversepostOrder()
{
	postOrder(root);
}

private Node findRecursive(Node localRoot,int emp)
{
	if (localRoot == null) 
	{
		return null;
	}
	else if(localRoot.EmpNo == emp)
	{
		System.out.println(localRoot.name);
		return localRoot;
	}
	else if(emp < localRoot.EmpNo) 
	{
		return findRecursive(localRoot.leftChild, emp);
	}
	else 
	{
		return findRecursive(localRoot.rightChild, emp);
	}
}

public Node callRecursive(int eno)
{
	return findRecursive(root, eno);
}

//From baanu jeeva to Everyone:  10:08 AM
public Node find(int emp)
{
	Node current = root;
	
	while(current.EmpNo != emp)
	{
		if (emp < current.EmpNo)
		{
			current = current.leftChild;
		}
		else
		{
			current = current.rightChild;
		}
		if (current == null)
		{
			return null;
		}//found the Emp no
		
	}
	
	System.out.println(current.name);
	return current;
	
}

public void deleteAll()
{
	root = null;
}	
	
	
	
	
	
}


public class IsBST {
	
	static class Node{
		int data;
		Node left,right;
	};
	
	static Node newNode(int data)
	{
	    Node node = new Node();
	    node.data = data;
	    node.left = node.right = null;
	    return (node);
	}
	
	static boolean isBst(Node root,Node l,Node r) {
		if(root== null) return true;
		if(l!=null && root.data <l.data)
			return false;
		if(r!=null && root.data >r.data )
			return false;
		
		return isBst(root.left,l,root) && isBst(root.right,root,r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Node root = newNode(3);
		 root.left = newNode(2);
         root.right = newNode(5);
	     root.left.left = newNode(1);
	     root.left.right = newNode(4);
	 
		    if (isBst(root,null,null))
		        System.out.print("Is BST");
		    else
		        System.out.print("Not a BST");
		

	}

}

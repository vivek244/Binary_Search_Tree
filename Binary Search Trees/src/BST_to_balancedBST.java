import java.util.Vector;


class Node{
	int data;
	Node left,right;
	Node (int d){
		this.data=d;
		this.left=this.right=null;
	}
}

public class BST_to_balancedBST {
	
	    static Node root;
	    
	    void store(Node root, Vector<Node> nodes) {
	    	if(root==null) return;
	    	store(root.left,nodes);
	    	nodes.add(root);
	    	store(root.right,nodes);
	    }
	    
	    Node buildTreeUtil(Vector<Node> nodes, int start, int end) 
	    {
	    	if (start > end)
	            return null;
	  
	        int mid = (start + end) / 2;
	        Node node = nodes.get(mid);
	  
	        node.left = buildTreeUtil(nodes, start, mid - 1);
	        node.right = buildTreeUtil(nodes, mid + 1, end);
	  
	        return node;
	    }
	    Node buildTree(Node root) 
	    {
	        Vector<Node> nodes = new Vector<Node>();
	        store(root, nodes);
	  	        int n = nodes.size();
	        return buildTreeUtil(nodes, 0, n - 1);
	    }
	    
	    public void inorder(Node root) {
			 
			 if(root == null)
				 return;
			 inorder(root.left);
			 System.out.print(root.data + " ");
			 inorder(root.right);
		 }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

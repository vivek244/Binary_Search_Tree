
public class Insert_Delete {
	
	class Node{
		int data;
		Node left,right;
		Node(int d){
			data=d;
			left=right=null;
		}
	}
	
//	public Insert_Delete() {
//		root=null;
//	}
	static Node root;
	
	void deleteKey(int key) { root = delete(root, key); }
	Node delete(Node root,int key) {
		if(root==null)  return root;
		
		if(key<root.data)
			root.left=delete(root ,root.data);
		
		else if(key>root.data)
			root.right=delete(root,key);
		
		else if(root.left==null) return root.right;
		else if(root.right==null) return root.left;
		root.data=min(root.right);
		root.right=delete(root.right,root.data);
		return root;
	}
	
	
	 public  int min(Node root) {
		 int minv = root.data;
	        while (root.left != null)
	        {
	            minv = root.left.data;
	            root = root.left;
	        }
	        return minv;
	 }
	 
	 void insert(int data)
	    {
	         root = insertRec(root, data);
	    }
	 
	    Node insertRec(Node root, int data)
	    {
	 
	        if (root == null)
	        {
	            root = new Node(data);
	            return root;
	        }
		
		if(data<root.data)
			root.left=insertRec(root.left,data);
		else if(data>root.data)
			root.right=insertRec(root.right,data);
		
		return root;
			
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
		Insert_Delete tree =new Insert_Delete();
		
		tree.insert(8);
        tree.insert(3);
        tree.insert(1);
        tree.insert(6);
        tree.insert(4);
        tree.insert(7);
        tree.insert(10);
        tree.insert(14);
        tree.insert(13);
        tree.inorder(root);
        
        tree.deleteKey(6);
        tree.inorder(root);
		

	}

}

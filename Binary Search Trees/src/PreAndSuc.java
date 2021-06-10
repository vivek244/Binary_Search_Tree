
public class PreAndSuc {
	
	static class Node{
		int data;
		Node left,right;
		public Node() {}
		Node(int d){
			this.data=d;
			this.left=this.right=null;
		}
	}
	
	 static Node pre=new Node();
	 static Node suc=new Node();
	 
	 static void presuc(Node root,int data) {
		 if(root==null) return;
		 if(root.data == data);
		 
		 if(root.left !=null) {
			 Node temp=root.left;
			 while(temp.right !=null)
				 temp=temp.right;
			 pre=temp;
		 }
		 
		 if(root.right !=null) {
			 Node temp=root.right;
			 while(temp.left !=null)
				 temp=temp.left;
			 suc=temp;
		 }
		 
		 if(root.data>data) {
			 suc=root;
			 presuc(root.left,data);
		 }
		 
		 else {
			 pre=root;
			 presuc(root.right,data);
		 } 
	 }
	 
	 static Node insert(Node root,int k) {
		 if(root ==null)
			 return new Node(k);
		 if(k<root.data)
			 root.left=insert(root.left,k);
		 else 
			 root.right=insert(root.right,k);
		 
		 return root;
	 }
	 
	 public static void inorder(Node root) {
		 if(root ==null)
			 return;
		 inorder(root.left);
		 System.out.print(root.data + " ");
		 inorder(root.right);
	 }
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int key = 65;
		Node root=new Node();
		root=insert(root,50);
		insert(root, 30);
	    insert(root, 20);
	    insert(root, 40);
	    insert(root, 70);
	    insert(root, 60);
	    insert(root, 80);
	    inorder(root);
	    System.out.println();
	    presuc(root, key);
	    if (pre != null)
	        System.out.println("Predecessor is " + pre.data);
	    else
	        System.out.println("No Predecessor");
	 
	    if (suc != null)
	        System.out.println("Successor is " + suc.data);
	    else
	        System.out.println("No Successor");

	}

}

public class BinaryTree{
	Node root;
	static class Node{
		int data;
		Node left,right;
		
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	// void addNode(int newData){
		// Node newNode=new Node(newData);
		// if(root==null){
			// root=newNode;
			// newNode.previous=tail.next=null;
		// }else{
			// tail.next=newNode;
			// newNode.previous=tail;
			// tail=newNode;
			// tail.next=null;
		// }
	// }
	
	void preorder(Node root){
		if(root==null)
			return;
		System.out.println(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	void inorder(Node root){
		if(root==null)
			return;
		inorder(root.left);
		System.out.println(root.data+" ");
		inorder(root.right);
	}
	
	void postorder(Node root){
		if(root==null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data+" ");
	}
	
	void inorder(){
		inorder(root);
		System.out.println();
	}
	
	void preorder(){
		preorder(root);
		System.out.println();
	}
	
	void postorder(){
		postorder(root);
		System.out.println();
	}
	
	Node insertNode(Node root, int key){
		if(root==null){
			root = new Node(key);
			return root;
		}
		
		if(key<=root.data)
			root.left=insertNode(root.left, key);
		else
			root.right=insertNode(root.right, key);
		return root;
	}
	
	void insert(int key){
		root=insertNode(root,key);
	}
	
	Node deleteData(Node root, int key){
		//Empty tree
		if(root==null)
			return root;
		
		if(key<root.data)
			root.left=deleteData(root.left, key);
		else if(key>root.data)
			root.right=deleteData(root.right, key);
		else{
			// Case 1 & 2
			if(root.left==null)
				return root.right;
			else if(key>root.data)
				return root.left;	
		
			//case 3
			root.data=minvalue(root.right);
			root.right=deleteData(root.right, root.data);
		}
		return root;
	}
	
	int minvalue(Node root){
		int temp=root.data;
		while(root.left!=null){
			temp=root.left.data;
			root=root.left;
		}
		return temp;
	}
	
	void delete(int key){
		deleteData(root, key);
	}
	
	public static void main(String[] args){
		BinaryTree tree=new BinaryTree();
		tree.insert(10);
		tree.insert(25);
		tree.insert(14);
		tree.insert(45);
		tree.insert(5);
		tree.insert(9);
		tree.insert(4);
		// System.out.println("Preorder");
		// tree.preorder();
		
		System.out.println("Inorder");
		tree.inorder();
		
		
		tree.delete(10);
		System.out.println("Inorder");
		tree.inorder();
		
		tree.delete(9);
		System.out.println("Inorder");
		tree.inorder();
		
		tree.delete(25);
		System.out.println("Inorder");
		tree.inorder();
		// System.out.println("Postorder");
		// tree.postorder();
	}
}
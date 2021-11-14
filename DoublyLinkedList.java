public class DoublyLinkedList{
	Node head;
	Node tail;
	static class Node{
		int data;
		Node prev,next;
		
		Node(int data){
			this.data=data;
			prev=null;
			next=null;
		}
	}
	
	void addNode(int newData){
		Node newNode=new Node(newData);
		if(head==null){
			head=tail=newNode;
			newNode.prev=null;
			tail.next=null;
		}else{
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
			tail.next=null;
		}
	}
	
	public void addInMid(int index, int data) {  
       //Create a new node  
        Node newNode = new Node(data);  
  
        //If list is empty  
        if(index == 0) {  
            addNode(data);  
        }  
        else {  
            //current will point to head  
            Node current = head, temp = null;  
  
            //Store the mid position of the list  
            int mid = (size % 2 == 0) ? (size/2) : ((size+1)/2);  
  
            //Iterate through list till current points to mid position  
            for(int i = 1; i < mid; i++){  
                current = current.next;  
            }  
  
            //Node temp will point to node next to current  
            temp = current.next;  
            temp.previous = current;  
  
            //newNode will be added between current and temp  
            current.next = newNode;  
            newNode.previous = current;  
            newNode.next = temp;  
            temp.previous = newNode;  
        }
    }  
	
	void display(){
		Node current=head;
		Node trace=null;
		if(current==null){
			System.out.println("List is empty");
			return;
		}
		int countF=0;
		int countB=0;
		System.out.println("Forward Display :");
		while(current!=null){
			countF++;
			System.out.print(current.data+" ");
			trace=current;
			current=current.next;
		}
		
		// System.out.println("\nBackward Display : ");
		// while(trace.next!=null){
			// countB++;
			// System.out.print(trace.data+" ");
			// trace=trace.prev;
		// }
		System.out.println();
		System.out.println("Length of list is : "+countF);
		// System.out.println("Length of list is : "+countB);
		System.out.println();
	}
	
	public static void main(String[] args){
		DoublyLinkedList list=new DoublyLinkedList();
		list.addNode(5);
		// list.display();
		list.addNode(10);
		list.addNode(15);
		list.addNode(20);
		list.display();
		list.addNodeMid();
		list.display();
	}
}
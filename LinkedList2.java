public class LinkedList2{
	Node head;
	Node tail;
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	void addNode(int newData){
		Node newNode=new Node(newData);
		if(head==null){
			head=newNode;
			tail=newNode;
		}else{
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	void insertAtBeginning(int newData){
		Node newNode=new Node(newData);
		newNode.next=head;
		head=newNode;
	}
	
	void insertAt(int index, int newData){
		Node newNode=new Node(newData);
		if(index==0)
			insertAtBeginning(newData);
		else{
			Node current=head;
			for(int i=0;i<index-1;i++)
				current=current.next;
			
		newNode.next=current.next;
		current.next=newNode;
		}
	}
	
	void deleteAt(int index){
		Node current=head;
		if(current==null)
			return;
		
		if(index==0)
			current=current.next;
		else
			for(int i=0;i<index-1;i++)
				current=current.next;
			
		if(current==null || current.next==null)
			return;
		
		Node newNode=current.next.next;
		current.next=newNode;
	}
		
	Node reverse(){
        Node current = head;
		Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
	
	void display(){
		Node current=head;
		if(current==null){
			System.out.println("List is empty");
			return;
		}
		int count=0;
		while(current!=null){
			count++;
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
		System.out.println("Length of list is : "+count);
		System.out.println();
	}
	
	public static void main(String[] args){
		LinkedList2 list = new LinkedList2();
		list.display();
		list.addNode(10);
		list.display();
		list.addNode(20);
		list.display();
		list.addNode(30);
		list.display();
		list.addNode(40);
		list.display();
		// list.insertAtBeginning(5);
		// list.display();
		// list.addNode(50);
		// list.display();
		list.insertAt(2,55);
		// list.display();
		// list.deleteAt(4);
		// list.display();
		// list.display();
		// list.deleteAtLast(2);
		// list.display();
		Node reverseHead=list.reverse();
		list.display();
	}
}
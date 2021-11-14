public class DoublyLinkedListDemo{
	Node head;
	Node tail;
	int length;
	
	static class Node{
		int data;
		Node next;
		Node previous;
		
		Node(int data){
			this.data=data;
			this.next=null;
			this.previous=null;
		}
	}
	
	DoublyLinkedListDemo(){
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	
	boolean isEmpty(){
		return length==0;
	}
	
	int length(){
		return length;
	}
	
	void addNode(int newData){
		length++;
		Node newNode=new Node(newData);
		if(head==null){
			head=tail=newNode;
			newNode.previous=tail.next=null;
		}else{
			tail.next=newNode;
			newNode.previous=tail;
			tail=newNode;
			tail.next=null;
		}
	}
	
	void display(){
		Node current=head;
		Node trace=tail;
		if(current==null){
			System.out.println("List is empty");
			return;
		}
		int countF=0;
		int countB=0;
		System.out.println("Forward");
		while(current!=null){
			countF++;
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println("\nBackward");
		while(trace!=null){
			countB++;
			System.out.print(trace.data+" ");
			trace=trace.previous;
		}
		System.out.println();
		System.out.println("Length of list is : "+countF);
		System.out.println("Length of list is : "+countB);
		System.out.println("Length of list is : "+length);
		System.out.println();
	}
	
	public static void main(String[] args){
		DoublyLinkedListDemo list=new DoublyLinkedListDemo();
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.display();
		
	}
}
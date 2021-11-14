class Queue{
	int size=5;
	int Q[]=new int[size];
	int rear,front;
	Queue(){
		front=-1;
		rear=-1;
	}
	
	boolean isEmpty(){
		if(front==-1)
			return true;
		else
			return false;
	}
	
	boolean isFull(){
		if(front==0 && rear==size-1)
			return true;
		else
			return false;
	}
	
	void enqueue(int x){
		if(isFull())
			System.out.println("Queue is Full");
		else{
			if(front==-1)
				front=0;
			rear++;
			Q[rear]=x;
			System.out.println(x+" inserted.");
		}
	}
	
	int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return -1;
		}
		else{
			int x=Q[front];
			if(front>=rear){
				front=-1;
				rear=-1;
			}else{
				front++;
			}
			System.out.println(x+" deleted.");
			return x;
		}
	}
	
	void display(){
		if(isEmpty())
			System.out.println("Queue is Empty");
		else{
			for(int i=front;i<=rear;i++){
				System.out.println(Q[i]);
			}
		}
	}
	public static void main(String[] args){
		Queue q=new Queue();
		q.enqueue(11);
		q.enqueue(12);
		q.enqueue(13);
		q.enqueue(14);
		q.enqueue(15);
		q.enqueue(16);
		q.display();
		q.dequeue();
		q.enqueue(16);
		q.display();
	}
}
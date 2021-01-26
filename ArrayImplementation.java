package Queue;
class QueueImp
{
	final int size = 10;
	int[] arr = new int[size];
	int front = -1 , rear = -1;
	void enqueue(int data)
	{
		if(this.isEmpty())
		{
			front++;
			rear++;
			arr[rear] = data;
		}
		else if(rear == size-1)
		{
			System.out.println("Overflow,can't add more items!");
		}
		else
		arr[++rear] = data;
	}	
	int dequeue()
	{
		 if(this.isEmpty())
		{
			 System.out.println("Underflow, can't delete any item!");
		     return -1;
		}
		 if(front == rear)
		 {
			 int x = arr[front];
		 	 front = -1;
			 rear = -1;
			 return x;
		}
		else
		return arr[front++];
	}
	int peek()
	{
		if(this.isEmpty())
		{
			System.out.println("No element available");
			return -1;
		}
		return arr[front];
	}
	boolean isEmpty()
	{
		if(front==-1  && rear == -1)
			return true;
		return false;
	}
}
public class ArrayImp
{
	public static void main(String[] args) 
	{
		QueueImp q = new QueueImp();
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		System.out.println(q.isEmpty());   // true
		System.out.println(q.peek());  //5
		System.out.println(q.dequeue()); //5
		System.out.println(q.dequeue()); //6
		System.out.println(q.peek()); //7
		System.out.println(q.dequeue()); //7
		System.out.println(q.isEmpty()); //true
		System.out.println(q.peek()); // no element left -1
		System.out.println(q.dequeue()); // -1 // underflow
		q.enqueue(5); //5
		q.enqueue(6);//6
		q.enqueue(7);//7
		q.enqueue(5);//5
		q.enqueue(6); //6
		q.enqueue(7); //7
		q.enqueue(5);//5
		q.enqueue(6);//6
		q.enqueue(7);//7
		q.enqueue(5);//5
		q.enqueue(10);//-1
	}

}

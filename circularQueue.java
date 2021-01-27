package Queue;
class Circular
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
	else if((rear+1)%size == front)
	{
		System.out.println("Overflow,can't add more items!");
	}
	else
	{
          rear = (rear + 1)%size;
          arr[rear] = data;
	}
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
	{
		 int x = arr[front];
		 front = (front+1)%size; 
	     return x;
    }
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
public class CircularQueue 
{
        public static void main(String args[])
        {
            Circular cq = new Circular();
   
    		cq.enqueue(1);
    		cq.enqueue(2);
    		cq.enqueue(3);
    		cq.enqueue(4);
    		cq.enqueue(5);
    		cq.enqueue(6);
    		cq.enqueue(7);
    		cq.enqueue(8);
    		cq.enqueue(9);
    		cq.enqueue(10);
    		System.out.println(cq.peek()); // 1
 
    		System.out.println(cq.dequeue()); //1
    		cq.enqueue(11);
    		System.out.println(cq.rear); // 0
    		cq.enqueue(12); // Overflow!!
    		System.out.println(cq.dequeue()); // 2
    		System.out.println(cq.dequeue()); //3
    		System.out.println(cq.dequeue()); //4
    		System.out.println(cq.dequeue()); //5
    		System.out.println(cq.dequeue());//6
    		System.out.println(cq.dequeue());//7
    		System.out.println(cq.dequeue());//8
    		System.out.println(cq.dequeue());//9
    		System.out.println(cq.dequeue());//10
    		System.out.println(cq.dequeue());//11
    		System.out.println(cq.front); //-1 
    		System.out.println(cq.rear); // -1
        }
}

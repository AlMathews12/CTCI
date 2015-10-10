

public class Queue
{
    Node head;
    Node tail;

    public Queue(){};

    public void enqueue(BTNode btNode)
    {
	if(head == null)
	{
	    head = new Node(btNode);
	    tail = head;
	}
	else
	{
	    tail.next = new Node(btNode);
	    tail = tail.next;
	}
    }

    public BTNode dequeue()
    {
	if(head == null)
	{
	    return null;
	}
	if(head == tail)
	{
	    BTNode tmp = head.btNode;
	    head = head.next;
	    tail = head;
	    return tmp;
	}
	else
	{
	    BTNode tmp = head.btNode;
	    head = head.next;
	    return tmp;
	} 
    }	    
}

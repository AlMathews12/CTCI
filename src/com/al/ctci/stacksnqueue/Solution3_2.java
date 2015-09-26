//Design a stack which in addition to pop and push , also have min function which returns the min value in O(1) time.

import java.util.*;
import java.io.*;
class Node 
{
    Node next;
    int value;
    int min;

    public Node(){}
	
    public Node(int value)
    {
	this.value = value;
    }
}

class Stack
{
    Node head;    

    public void push(int val)
    {
	if(this.head == null)
        {	
	    Node newNode = new Node(val);
	    newNode.min = val;
	    this.head = newNode;
	}
	else
	{
	    Node newNode = new Node(val);
	    newNode.next = this.head;

	    if(this.head.min < val)
		newNode.min = this.head.min;
	    else	
		newNode.min = val;

	    this.head = newNode;
	}    		
    }

    public int  pop()
    {
	if(this.head == null )
	{
	    System.out.println("Stack is Empty");
	    return 0;
	}
	else 
	{
	    int tmp = this.head.value;
	    this.head = this.head.next;
	    return tmp;
	}
    }

    public int min()
    {

	return this.head.min;
    }

    public void print()
    {
	Node tmp = this.head;
	while(tmp != null)
	{
	    System.out.print(tmp.value + "\t");
	    tmp = tmp.next;
	}
    }
}

public class Solution3_2
{
    public static void main(String [] args) throws IOException 
   {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int go  = 1;
	int opts =0;
	int val =0;

	Stack s = new Stack();

	while(true)
	{
	    System.out.println("Enter 1 to continue , 0 to exit");
	    go = Integer.parseInt(br.readLine());
	    if(go == 0)
		break;
	    System.out.println("Enter 1 to push,2 to pop , 3 to view min value and 4 to print the stack");
	    opts = Integer.parseInt(br.readLine());
	
	    switch (opts)
	    {
		case 1:
		    System.out.println("Enter the new value");	
		    val = Integer.parseInt(br.readLine());
		    s.push(val);
		    break;
		case 2:
		    val = s.pop();
		    System.out.println(val);
		    break;			  
  	    	case 3:
		    val = s.min();
		    System.out.println(val);
		    break;	   
		case 4:
		    s.print();
		    break;
		default:
		    System.out.println("Invalid option"); 
	    }      
	}
    }

}

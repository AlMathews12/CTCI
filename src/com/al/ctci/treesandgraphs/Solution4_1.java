import java.util.*;
import java.io.*;

public class Solution4_1
{

    public static int maxHt;
    public static int minHt;

    public static void main(String [] args) throws IOException
    {
	maxHt = 0;
	BST bst = new BST();
	BTNode root = null;
	int val;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	// Reading values to create the tree
	while(true)
	{
	    System.out.println("Enter the new node , 0 to exit");
	    val  = Integer.parseInt(br.readLine()) ;
	    if (val == 0)
		break;
	    else
		root = bst.addNode(root, val);	  
	}
	
	// Checking if the tree is balanced
	if(isBalancedTree(root,0))
	    System.out.println("Tree is balanced");
	else
	    System.out.println("Tree is not balanced");

	System.out.println("Max Ht " + maxHt);	
    }

    // First implementation (using global variable)
    public static boolean isBalancedTree(BTNode root, int ht)
    {
	boolean leftBal = true;
	boolean rightBal = true;
	if(root.left == null && root.right == null)
	{
	    System.out.println(ht);
		if(maxHt == 0)
		{
		    maxHt = ht;
		    minHt = ht;
		    return true;
		}    	
		else	    
		{
			if(ht > maxHt)
			    maxHt = ht;
			if(ht < minHt)
			    minHt = ht;
		}

		if((maxHt - minHt) > 1)
		    return false;
		else	
		    return true;   
	}
	else 
	{
	    if (root.left !=  null)
	    {
	    	leftBal = isBalancedTree(root.left , ht+1);
	    }
	    if (root.right != null)
	    {
		rightBal = isBalancedTree(root.right, ht+1);
	    }
	    return (leftBal && rightBal);
	}
    }
}

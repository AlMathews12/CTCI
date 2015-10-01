import java.util.*;
import java.io.*;

public class Solution4_3
{
    static BST bst ;
    static BTNode root;
    public static void main(String args[]) throws IOException
    {
	bst = new BST();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter size of array");
	int size = Integer.parseInt(br.readLine());
	int arr[]  = new int[size];
	System.out.println("Enter values");
	
	for (int i=0; i<size; i++)
	{
	    arr[i] = Integer.parseInt(br.readLine());
	}
	
	System.out.println("\nCreating minimal height tree");
	
	addNodeMin(0,size-1,arr);

	bst.inorderTraversal(root);
	
    }

    public static void addNodeMin(int i, int j , int arr[])
    {
	if(i == j)
	{
	    root = bst.addNode(root,arr[i]);
	}
	else if(i > j)
	{

	}
	else
	{
	    int mid = (i+j)/2;
	    root = bst.addNode(root,arr[mid]);
	    addNodeMin(i,mid-1,arr);
	    addNodeMin(mid+1,j,arr);	    
	}	    
    }
}

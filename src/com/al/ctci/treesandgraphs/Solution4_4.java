import java.util.*;
import java.io.*;

public class Solution4_4
{
    static Map<Integer,List> listMap ;

    public static void main(String [] args) throws IOException
    {
    	listMap = new HashMap<Integer,List>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	System.out.println("Enter values , 0 to exit");
	BST bst = new BST();
	BTNode root = null;
	int value;
	while(true)
	{
	    value = Integer.parseInt(br.readLine());
	    if(value == 0)   
		break;
	    root = bst.addNode(root,value);
	}
	
	System.out.println("\ncreating lists\n");

	preorderTraversal(root,0);

	for(Map.Entry<Integer,List> e : listMap.entrySet())
	{
	    List<BTNode> list = e.getValue();
	    Iterator itr = list.iterator();
	    while(itr.hasNext())
	    {
		BTNode node = (BTNode) itr.next();
		System.out.print(node.value);
	    }	    
	    System.out.println();
	}

    }

    public static void preorderTraversal(BTNode root, int ht)
    {
	if(root !=null)
	{
	    addToList(root,ht);
	    preorderTraversal(root.left,ht+1);
	    preorderTraversal(root.right,ht+1);
	}

    }

    public static void addToList(BTNode root,int ht)
    {
	if(listMap.containsKey(ht))
	{
	    List<BTNode> list = listMap.get(ht);
	    list.add(root);	
	}
	else
	{
	    List<BTNode> list = new ArrayList<BTNode>();
	    list.add(root);
	    listMap.put(ht,list);
	}
    }
}

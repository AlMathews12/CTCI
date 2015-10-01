
public class BST
{
    public void preorderTraversal(BTNode root)
    {
	if(root != null)
	{
	    System.out.println(root.value);
	    preorderTraversal(root.left);
	    preorderTraversal(root.right);    
	}
    }
    
    public void inorderTraversal(BTNode root)
    {
	if(root != null)
	{
	    preorderTraversal(root.left);
	    System.out.println(root.value);
	    preorderTraversal(root.right);
	}
    }
    
    public void postorderTraversal(BTNode root)
    {
	if(root != null)
	{
	    preorderTraversal(root.left);
	    preorderTraversal(root.right);    
	    System.out.println(root.value);	
	}
    }
    
    public BTNode addNode(BTNode root, int value)
    {	
	if(root == null)
	    return new BTNode(value);
	else
	{
	    if(value <= root.value)
	    {
		root.left = addNode(root.left,value);
	    }
	    else
	    {
		root.right = addNode(root.right,value);
	    }
	    return root;
	}   	
    }
    
    
}

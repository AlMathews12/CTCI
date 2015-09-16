import java.util.*;
import java.io.*;

public class Solution1_3 
{
    public static void main(String []args) throws IOException
    {
	boolean flag = true;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the first string");
	String first = br.readLine();
	System.out.println("Enter the second string");
	String second = br.readLine();

	Map<String,Integer> charMap = new HashMap<String,Integer>();
	
	// Traversing through first string and updating the map
	for(int i =0 ; i < first.length(); i++)
	{
	    char tmp = first.charAt(i);
	    String tmpStr = ""+tmp;
	    if(charMap.containsKey(tmpStr))
	    {
		int v = charMap.get(tmpStr);
		v++;
		charMap.put(tmpStr,v); 
	    }
	    else
	    {
		charMap.put(tmpStr,1);
	    }
	}	
	
	// Checking if second is permutation of the first string
	for(int i =0 ; i < second.length();i++)
	{
	    char tmp = second.charAt(i);
	    String tmpStr = ""+tmp;
	    if(charMap.containsKey(tmpStr))
	    {
		int v = charMap.get(tmpStr);
		if(v == 1)
		{
		    charMap.remove(tmpStr);
		}
		else
		{
		    v--;
		    charMap.put(tmpStr,v);
		}	
	    }
	    else
	    {
		flag = false;
		break;
	    }
	}
	
	if(charMap.size() > 0)
	    flag= false;
    
	if(flag == true)
	{
	    System.out.println("is permutation");
	}
	else
	{
	    System.out.println("is not permutation");
	}
    }
}

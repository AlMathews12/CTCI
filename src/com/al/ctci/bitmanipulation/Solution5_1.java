//

import java.io.*;
import java.util.*;

public class Solution5_1
{
    public static void main(String []args) throws IOException
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the first binary number");
	int first = Integer.parseInt(br.readLine(),2);
	System.out.println("Enter the second binayr number");
	int second = Integer.parseInt(br.readLine(),2);
	System.out.println("Enter starting and ending point");
	int start = Integer.parseInt(br.readLine());
	int end = Integer.parseInt(br.readLine());

	int mask  = 0;
	mask = ~mask;

	mask = mask << start;
	mask = ~mask;
	mask =  mask << end;

	mask = ~mask;
	
	int output = first & mask;
	second = second << end;
	output = output | second;
    
	System.out.println("Output  " + Integer.toBinaryString(output));
	
    }
}

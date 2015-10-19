import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution9_1 {

    public static int count =0;
	
	public static void main(String[] args) throws IOException
	{
		int steps;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of steps");
		steps = Integer.parseInt(br.readLine());
		
		totalCount(steps, 0);
        System.out.println("count -" + count);
		
	}


    public static void totalCount(int total, int current)
    {
        if(current == total)
            count++;
        else
        {
            if((current+1) <= total)
                totalCount(total, current+1);
    
            if((current+2) <= total)
                totalCount(total, current+2);
            
            if((current+3) <= total)
                totalCount(total, current+3);
        }
    }
}

import java.util.*;
import java.io.*;

public class Solution1_8
{
    public static void main (String [] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first String");
        String input = br.readLine();
        System.out.println("Enter the second string");
        String second = br.readLine();

        String ch = input+input;
        
        if(ch.contains(second))
        {
            System.out.println("is substring");
        }
        else
        {
            System.out.println("is not sub string");
        }
    }
}

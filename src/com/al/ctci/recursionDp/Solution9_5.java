import java.util.*;
import java.io.*;

public class Solution9_5
{
    public static void main(String [] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        String input = br.readLine();
        
        int len = input.length();
        int a[] = new int [len];
        printPermutations(input,"",a);

    }

    public static void printPermutations(String input, String output, int a[])
    {
        if(allPresent(a))
            System.out.println(output);
        else
        {
            for(int i=0 ; i < a.length; i++)  
            {
                if(a[i] == 0)
                {
                    String tmp = output+input.charAt(i);
                    a[i] =1;
                    printPermutations(input,tmp,a);
                    a[i] = 0;
                }
            }
        }

    }

    public static boolean allPresent(int a[])
    {
        for(int i=0 ; i < a.length; i++)
        {
            if(a[i] == 0)
                return false;
        }
        return true;
    }
}

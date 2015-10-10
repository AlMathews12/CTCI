import java.util.*;
import java.io.*;

public class Solution1_4
{
    public static void main(String [] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        
        String input = br.readLine();
        
        char[] arr = input.toCharArray();
        char [] newArr = new char[100];
        int count=0;
        for (int i = 0;i <arr.length; i++)
        {
            newArr[i] = arr[i];
            if(newArr[i] == ' ')
                count++;
        }

        //replacing logic
        for(int i = input.length()-1;i >=0 ; i--)
        {
            if(newArr[i] == ' ')
            {
                count--;
                newArr[i+count*2] = '%';
                newArr[i+count*2 +1] = '2';
                newArr[i+count*2 +2] = '0';
            }
            else
            {
                newArr[i+count*2] = newArr[i];
            }
        }
    
        String output = new String(newArr);
        System.out.println(output);
    }
}

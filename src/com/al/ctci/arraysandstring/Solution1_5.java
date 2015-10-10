import java.util.*;
import java.io.*;

public class Solution1_5
{
    public static void main(String [] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        String input = br.readLine();

        int comlen = findCompressedLength(input);
        if(input.length() < comlen)
            System.out.println(input);
        else
        {
            char[] arr = new char[comlen];
            char tmp =input.charAt(0);
            arr[0] = tmp;
            int index =1;
            int count = 1;
            for(int i =1 ; i < input.length();i++)
            {
                if(tmp != input.charAt(i))
                {
                    arr[index++] = new String(""+count).charAt(0);
                    tmp = input.charAt(i);
                    arr[index++] = tmp;
                    count =1;
                }
                else
                {
                    count++;
                }
            }
            arr[index] = new String(""+count).charAt(0);
            System.out.println(arr);
        } 
        
    }

    public static int findCompressedLength(String input)
    {
        char tmp = input.charAt(0);
        int count= 0;
        for(int i = 1 ; i < input.length(); i++)
        {
            if(input.charAt(i) != tmp)
            {
                count = count + 2;
                tmp = input.charAt(i);
            }
        } 
        count = count+2;
        return count;
    }
}

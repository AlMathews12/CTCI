import java.util.*;
import java.io.*;

public class Solution11_3
{
    static boolean found = false;

    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter length of array");
        int len = Integer.parseInt(br.readLine());
        int []arr = new int[len];

        System.out.println("enter values --rotated");
        for(int i = 0; i < len; i++)
        {   
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter the element ");
        int ele = Integer.parseInt(br.readLine());

        int index = findElement(ele,arr,0,len -1);

        if(index == -1)
            System.out.println("element not found");
        else    
            System.out.println("element present at index " + index);
    }

    public static int findElement(int ele, int []a,int i,int j)
    {
        int index;
        int mid = (i+j)/2;
        if(a[mid] == ele)
            return mid;
        if (j < i)
            return -1;
        
        if(a[i] < a[mid])
        {
            if(ele <= a[mid] && ele >= a[i])
                return findElement(ele,a,i,mid-1);
            else
                return findElement(ele,a,mid+1,j);
        }
        else if (a[mid] > a[j])
        {     
            if(ele >= a[mid] && ele <= a[j])
                 return findElement(ele,a,mid+1,j);
            else
                return findElement(ele,a,i,mid-1);
        }
        else if(a[i] == a[mid])
        {
            if(a[mid]!= a[j])
                return findElement(ele,a,mid+1,j);
            else
            {
                int result = findElement(ele,a,i,mid-1);
                if(result == -1)
                {
                    return findElement(ele,a,mid+1,j);
                }
                else
                {
                    return result;
                }
            }        
        }
        return -1;
    }
}

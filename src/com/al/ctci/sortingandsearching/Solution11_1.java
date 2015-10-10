import java.io.*;
import java.util.*;

public class Solution11_1
{
    public static void main(String []args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of first array and the number of elements in it");
        int arr1_len = Integer.parseInt(br.readLine());
        int arr1[] = new int[arr1_len];
        int no_ele = Integer.parseInt(br.readLine());
        System.out.println("Enter the sorted values in first arr");
        for(int i =0;i < no_ele;i++)
        {
            arr1[i] = Integer.parseInt(br.readLine());   
        }

        System.out.println("Enter length of second array ..followed by sorted values in it");
        int arr2_len = Integer.parseInt(br.readLine());
        int arr2[] = new int[arr2_len];
        for(int i =0; i < arr2.length ; i++)
        {
            arr2[i] = Integer.parseInt(br.readLine());
        }

        //Merging two arrays
        int index = arr1.length-1;
        int i = no_ele -1;
        int j = arr2.length -1;
        while(i >= 0 && j >= 0)
        {
            if(arr1[i] > arr2[j])
            {
                arr1[index] = arr1[i];
                index--;
                i--;
            }
            else
            {
                arr1[index] = arr2[j];
                index--;
                j--;
            }            
        }
        
        if(j >= 0)
        {
            for(int k = j; k >= 0;k--)
            {
                arr1[k] = arr2[k];
            }
        }
    
        System.out.println("Output array");
        for(int k=0;k<arr1.length;k++)
            System.out.print(arr1[k]+" ");
        System.out.println();
        
    }

   
}

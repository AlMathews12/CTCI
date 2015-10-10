import java.io.*;
import java.util.*;

public class Solution11_2
{
    public static void main(String [] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array length");
        int len = Integer.parseInt(br.readLine());
        String arr[] = new String[len];
        System.out.println("Enter the strings in the array");
        for(int i = 0; i < len; i++)
        {
            arr[i] = br.readLine();
        }

        //Sorting logic - with extra data structure
        Map<String,List<String>> map  = new HashMap<String,List<String>>();
        
        for(int i = 0; i < len; i++)
        {
            String str = getSortedString(arr[i]);
            if(map.containsKey(str))
            {
                map.get(str).add(arr[i]);
            }
            else
            {
                List<String> l = new ArrayList<String>();
                l.add(arr[i]) ;           
                map.put(str, l);
            }
        }
        
        int k = 0;
        for(Map.Entry<String,List<String>> e : map.entrySet())
        {
            List<String> l = e.getValue();
            Iterator itr = l.iterator();
            while(itr.hasNext())
            {
                arr[k++] = (String)itr.next();
            }
        }

        //printing
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(" " + arr[i] );
        }
        System.out.println();
    
    }


    public static String getSortedString(String str)
    {
        str = str.toUpperCase();
        char [] c = str.toCharArray();
        Arrays.sort(c);
        String new_Str = new String(c);
        return new_Str;   
    }
}

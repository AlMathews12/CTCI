//package com.al.ctci.arraysandstring;

import java.util.*;
import java.io.*;

public class Solution1_1
{
    public static void main(String []args) throws IOException
    {
	boolean flag = false;
	System.out.println("Enter the string");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String input = br.readLine();
	char inp[] = input.toCharArray();
	Arrays.sort(inp);
	char tmp ;
	for(int i =0;i < inp.length-1;i++)
	{
	    if(inp[i] == inp[i+1])
	    {
		flag= true;	
	    }      
	}
	if(flag == true)
	    System.out.println("Repeated Chars present");
	else
	    System.out.println("All Unique");
	
    }
}

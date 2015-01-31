package com.al.ctci.recursionDp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution9_1 {
	
	public static void main(String[] args) throws IOException
	{
		int steps;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of steps");
		steps = br.read();
		
		printOptions(steps);
		
	}
	
	public static void printOptions(int n,String str)
	{
		int t =0;
		if(t == n)
		{
			System.out.println(str);
		}
		else
		{
			
		}
			
	}

}

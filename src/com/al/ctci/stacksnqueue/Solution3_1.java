//package com.al.ctci.stacksnqueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size,selectedStck,temp,action;
		int stck[];
		int head1=-3,head2=-2,head3 =-1;
		int exit = 1;
		
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the array size");
			size = Integer.parseInt(br.readLine());
			stck = new int[size];
			
			while(exit != 0)
			{
				System.out.println("Enter 1,2 or 3 to select the stack");
				selectedStck = Integer.parseInt(br.readLine());
				
				System.out.println("0 for push , 1 for pop");
				action = Integer.parseInt(br.readLine());
				
				if(action == 0)
				{
					System.out.println("Enter the value");
					temp = Integer.parseInt(br.readLine());
					switch (selectedStck) {
					case 1:
						head1 = push(head1,temp,stck);
						break;
					case 2:
						head2 = push(head2,temp,stck);
						break;
					case 3:
						head3 = push(head3,temp,stck);
						break;
					default:
						System.out.println("Enter a valid stack number");
						break;
					}
				}
				else
				{
					switch (selectedStck) {
					case 1:
						head1 = pop(head1,stck);
						break;
					case 2:
						head2 = pop(head2,stck);
						break;
					case 3:
						head3 = pop(head3,stck);
						break;
					default:
						System.out.println("Enter a valid stack number");
						break;
					}	
				}
				
				System.out.println("Do you want to continue ,1 for yes , 0 for no");
				exit = Integer.parseInt(br.readLine());
				
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}

	private static int pop(int head, int[] stck) {
		if(head < 0)
		{
			System.out.println("No element in the stack" );
		}
		else
		{
			System.out.println("popped value : " + stck[head] );
			head-=3;
		}
		return head;
	}

	private static int push(int head, int temp, int[] stck) {
		// TODO Auto-generated method stub
		int newhead = head +3;
		if(newhead >= stck.length)
		{
			System.out.println("Cannot add the element . Stack completely filled");
		}
		else
		{
			stck[newhead] = temp;
			head = newhead;
		}
		return head;
	}

}

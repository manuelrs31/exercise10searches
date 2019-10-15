package com.exercise10searches.app;

import java.util.Random;
import java.util.Scanner;

public class sequencialsearchnongready
{

	public static void main(String[] args) 
	{
		// constant declaration
		final int elements_array=100;
		int numbertofind=0;
		int[] vector = new int[elements_array];
		int indexfound=-1;
		Random numbers = new Random(System.nanoTime());
		Scanner input = new Scanner(System.in);
		boolean isfound=false;
		for (int i=0; i<elements_array; i++)
		{
			vector[i] = numbers.nextInt(101);
		}
		
		for (int i=0; i<elements_array; i++)
		{
			System.out.print(vector[i]+" ");
			
		}
		
		do
		{
			System.out.println(" ");
			System.out.println(" input the value to find inside the array");
			numbertofind = input.nextInt();
			if (numbertofind<0)
			{
				System.out.println("numbers must be greater then or equal to zero");
			}
		} while(numbertofind<0);
		
		
		
		
		for(int i=0; i<elements_array; i++)
		{
			if (numbertofind==vector[i])
			{
				 indexfound=i;
				 break;
			}
		}
		if (indexfound!=-1)
		{
			System.out.println("element found at index: "+indexfound);
			
		}
		else
		{
			System.out.println("element not found");
		}
		int i=0;
		while (!isfound==true && i<elements_array)
		{
			if(numbertofind==vector[i])
			{
				indexfound=i;
				isfound=true;
			}
			i++;
			
		}
		if (indexfound!=-1)
		{
			System.out.println("element found at index: "+indexfound);
			
		}
		else
		{
			System.out.println("element not found");}
		
		
		input.close();

	}

}

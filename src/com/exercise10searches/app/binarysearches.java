package com.exercise10searches.app;

import java.util.Random;
import java.util.Scanner;

public class binarysearches {

	public static void main(String[] args) 
	{
		// constants declaration
		final int elements_array=100;
		
		//variables declaration
		int numbertofind=0;
		int indexfound=-1;
		int[] miarray = new int[elements_array];
		int liminf=0;
		int limsup=elements_array-1;
		int pivotal=liminf+(limsup-liminf)/2;
		int temp=0;
		
		// objects construction
		Random randomnumbers = new Random(System.nanoTime());
		Scanner input = new Scanner(System.in);
		
		//initializacion
				for (int i=0; i<elements_array; i++)
				{
					miarray[i] = randomnumbers.nextInt(101);
				}
		//visualization
				for (int i=0; i<elements_array; i++)

				{
					System.out.print(miarray[i]+" ");
				}
				
				System.out.println(" ");
		
	
		// sorting algoritmos
		System.out.println(" ");
		for ( int i=0; i<elements_array; i++)
		{
			for(int j=0; j<elements_array-1; j++)
			{
				if (miarray[j]>miarray[j+1])
				{
					temp=miarray[j+1];
					miarray[j+1]=miarray[j];
					miarray[j]=temp;
					
				}
			}
		}
		System.out.println(" ");
		//visualization
		
				for (int i=0; i<elements_array; i++)

				{
					System.out.print(miarray[i]+" ");
				}
				
				System.out.println(" ");
				
		do
		{
			
			System.out.println("input number to find inside the array (0-100): ");
			numbertofind = input.nextInt();
			if (numbertofind<0)
			{
				System.out.println("number must be zero or positive value ");
			}
		} while (numbertofind<0);
		
		
				
		//bynary search algoritmos
		while(liminf<=limsup)
		{
			pivotal=liminf+(limsup-liminf)/2;
			if (numbertofind==miarray[pivotal])
			{
				indexfound=pivotal;
				break;
				
			}
			else if(numbertofind>miarray[pivotal])
			{
				liminf=pivotal+1;
			}
			else if (numbertofind<miarray[pivotal])
			{
				limsup=pivotal-1;
			}
		}
		if (indexfound!=-1)
		{
			System.out.println(" element found at index: ");
		}
		else
		{
			System.out.println(" element not present in the array ");
		}
	}

}

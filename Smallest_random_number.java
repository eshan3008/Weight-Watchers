package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Smallest_random_number {
	// Generate random numbers
	public static void main(String[] args) {
		int[] numbers = new int[500];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random()*100 + 1);
		}
	// Print Numbers
		for (int j = 0; j < numbers.length; j++) {
			System.out.print(numbers[j]);
			if(j< numbers.length) System.out.println(", ");
		}
		Arrays.sort(numbers);
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the nth smallest number that you wish to find: ");
		int n = reader.nextInt();
		reader.close();
		System.out.println("The nth Smallest number among 500 random numbers  " + numbers[n-1] );
	
	}

}

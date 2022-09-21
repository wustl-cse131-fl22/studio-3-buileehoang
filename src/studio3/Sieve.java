package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner array = new Scanner(System.in);
		System.out.println("What number should we go up to? ");
		int maxNumber = array.nextInt();
		int[] sieve = new int [maxNumber];
		boolean[] prime = new boolean [maxNumber];
		
		for (int i = 0; i < maxNumber; i++)
		{
			sieve [i] = i+1;
			for (int j = 2; j < (i); j++) {
				if (sieve[i] % j == 0) {
					prime[i] = true;
				}
				}
			if (prime [i] != true) {
			System.out.println(sieve[i]);
		}
		}
	}
}
		
			
		
		
		
	


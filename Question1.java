import java.util.Scanner;

public class Question1 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr [] = new int[n];
		
		for(int i = 0 ; i < n ; i ++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < n ; i ++) {
			
			if(isPrime(arr[i])) {
				
				int num = arr[i];
				int sumOfDigit = 0;
				
				while(num > 0) {
					sumOfDigit += num % 10;
					num = num /10;
					
				}
				
				if(isPrime(sumOfDigit)) {
					System.out.print(arr[i]+" ");
				}
			}
		}
		
		System.out.println();
		
	}

	private static boolean isPrime(int num) {
		
		boolean isPrimeNumber = true;
		
		for(int i = 2 ; i * i <= num ; i ++) {
			if(num % i == 0) {
				isPrimeNumber = false;
				break;
			}
		}
		return isPrimeNumber;
	}
}

// Time complexity of this code is O(n^3/2)
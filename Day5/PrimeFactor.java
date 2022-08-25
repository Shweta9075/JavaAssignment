package Day5;

import java.util.Scanner;

public class PrimeFactor {
	public static void main(String[] args) {
		int num ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :: ");
		num = scanner.nextInt();
		
		for(int i = 2; i < num; i++) {
			while(num%i == 0) {
				System.out.println(i+" ");
				num = num/i;
			}
		}
		if(num > 2) {
			System.out.println(num);
		}
	}
}
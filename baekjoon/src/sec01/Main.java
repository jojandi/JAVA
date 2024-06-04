package sec01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		scan.close();
		
		if((n > 0 && m > 0) || (n < 0 && m < 0 && n > m) || (n > 0 && m < 0)) {
			System.out.println(n-m);
		} else{
			System.out.println((n-m) *-1);
		}
	}

}

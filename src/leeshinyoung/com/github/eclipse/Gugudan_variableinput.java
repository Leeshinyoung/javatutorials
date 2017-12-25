package leeshinyoung.com.github.eclipse;

import java.util.Scanner;

public class Gugudan_variableinput {
	
	public static void main(String[] args) {
		int result = (4 * 1);
		System.out.println(result);
		//5
		System.out.println("몇단을 출력하실 건가요? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		System.out.println(number * 1);
		System.out.println(number * 2);
		System.out.println(number * 3);
		System.out.println(number * 4);
		System.out.println(number * 5);
		System.out.println(number * 6);
		System.out.println(number * 7);
		System.out.println(number * 8);
		System.out.println(number * 9);
	}
}

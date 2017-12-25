package leeshinyoung.com.github.eclipse;

import java.util.Scanner;

public class Gugudan_condition {

	public static void main(String[] args) {
	/* TODO 사용자가 입력한 숫자 값에 해당하는 단을 출력한다.
	예를 들어 사용자가 8이라는 숫자를 입력하면 8단 전체를 계산해 출력한다.
	사용자가 2 이상, 9 이하가 아닌 값을 입력하는 경우 “2이상, 9이하의 값만 입력할 수 있습니다.”라는 메시지를 출력한다.
	*/
		System.out.println("몇단을 출력하실 건가요? : ");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		System.out.println("number: " + i);
		if (i < 2) {
			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
		} else if (i > 9) {
			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
		} else {
			for (int j = 1;  j < 10; j++) {
					System.out.println(i * j);
			}
		}
	}

}

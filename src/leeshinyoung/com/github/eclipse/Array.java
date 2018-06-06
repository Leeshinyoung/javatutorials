package leeshinyoung.com.github.eclipse;

public class Array {
	public static void main(String[] args) {
		// 배열 생성
		int[] intArray = new int[5]; // 크기 5의 빈 배열
		
		intArray[0] = 2;
		intArray[1] = 3;
		intArray[2] = 5;
		intArray[3] = 7;
		intArray[4] = 11;
		//System.out.println(intArray[2] + intArray[4]);
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
}

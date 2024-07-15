package basic_grammer_loop;

import java.util.Scanner;

public class ForSyntax {

	public static void main(String[] args) {

		/*
		 *  for (초기값; 반복조건; 증감식) {
		 *  	반복할 코드
		 *  }
		 */
		
//		for (int i = 1; i < 101; i++) {
//			System.out.println(i);
//		}
		
		// System.out.println(i); - for 내부에서 정의한 i 라는 변수는 for 안에서만 사용
		
		// 1. 1 부터 1000 까지의 합 출력.
		int sum = 0;
		for(int i = 1; i < 1001; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		// 2. 1 부터 100 중 짝수의 합 출력.
		// 1. 연산자 (%) + if
		sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		// 2. 증감식 사용.
		sum = 0;
		for(int i = 0; i < 101; i +=2) {
			sum += i;
		}
		System.out.println(sum);
		//구구단 (이중 for - 중첩 for - nested for)
		for (int i = 2; i < 10; i++) {
			
			System.out.println(i + "단 시작");
			
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
			System.out.println(i + "단 끝");
		}
		
		// 3. 구구단 3단을 출력. (for)
		for (int i = 1; i < 10; i++) {
			int j = 3;
			
			System.out.println(j + " X " + i + " = " + i * j);
		}
		
		// 4. Scanner 이용해서, 출력하고 싶은 구구단 수를 입력받으면
		//	  해당 구구단이 출력되는 코드.
		//	  1 ~ 9 <-- Scanner를 이용해서 보고싶은 곱할 수를 입력받는다.
		// 	  예) 단수 : 10
		//		  곱할 수 : 20
		//		출력 예) 10 * 1 = 10
		//			   ....
		//  		    10 * 20 = 200
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("단 수를 입력하세요.");
		int i = keyboard.nextInt();
		
		System.out.println("곱할 수를 입력하세요.");
		int num = keyboard.nextInt();
		System.out.println(i + "단 시작");
		for(int j = 1; j < num + 1; j++) {
			
			System.out.println(i + " X " + j + " = " + i * j);
		} System.out.println(i + "단 끝");
		
		// Java 출력 방법.
		// System.out.println(); - ln ==> line 출력한 뒤에 개행(엔터).
		// System.out.print(); - 출력한 뒤 개행 X
		
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		
		System.out.print("2");
		System.out.print("2");
		System.out.print("2");
		
		System.out.println();
		
		
		System.out.print("3");
		System.out.print("3");
		System.out.print("3");
		System.out.print("3");
		
		
		
		
		
	}
}

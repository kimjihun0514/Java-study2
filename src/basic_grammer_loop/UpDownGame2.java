package basic_grammer_loop;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame2 {

	public static void main(String[] args) {
		
		// Psuedo Code. (의사 코드)
		// 코드의 논리식을 문자로 나열.
		
		// 1. 랜덤한 숫자 하나를 생성.
		Random random = new Random();
		
		// 2. 사용자가 숫자를 입력.
		Scanner keyboard = new Scanner(System.in);
		
		// 3. 랜덤한 숫자와 사용자가 입력한 숫자가 같은지 비교.
			// "정답입니다!" 출력.
		// 4. 랜덤한 숫자가 사용자가 입력한 숫자보다 작은지 비교.
			// "DOWN" 출력.
		// 5. 랜덤한 숫자가 사용자가 입력한 숫자보다 큰 지 비교.
			// "UP" 출력.
		
		int ranNum = random.nextInt(51);
		
		String str = ""; // int와 비슷

		System.out.println("0 ~ 50 사이의 숫자를 입력하세요.");
		while (true) {
		int num = keyboard.nextInt();
		
		if (ranNum == num) {
			System.out.println("정답입니다!");
			break;
		}
		else if (ranNum > num) {
			str = "UP";
		}
		//else if (ranNum < num) {
		else {	
			str = "DOWN";
		}
		
		System.out.println(str);
		
		}
		}
}
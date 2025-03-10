package basic_grammer_loop;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		
		System.out.println("---------------맞힐 때까지 반복하는 업다운 게임---------------");
		
		//우리가 맞힐 숫자를 랜덤하게 생성.
		double randomFloatingPoint = Math.random(); // 부동소수점 형태의 난수 생성.
		int correctNumber = (int) (randomFloatingPoint * 100); // 0.01234111 ==> 1.234111
																//명시적 형변환
		Scanner keyboard = new Scanner(System.in);
		
			// true - 무한히 반복
		while (true) {
			
			System.out.println("숫자를 입력하세요.");
			
			int answer = keyboard.nextInt();		
			
			if (correctNumber == answer) {
				System.out.println("정답입니다!");
				break; // 현재 흐름을 중단시키는 키워드.
			}
			else if (correctNumber > answer) {
				System.out.println("UP!");
			}
			else {
				System.out.println("DOWN!");
			}
		}
	}
}

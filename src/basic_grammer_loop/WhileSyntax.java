package basic_grammer_loop;

import java.util.Random;

public class WhileSyntax {

	public static void main(String[] args) {
		
		// while () {} - 소괄호 안에 비교,논리연산자
		
//		int count = 0;
//		
//		while (count < 10) {
//			System.out.println("반복중입니다."); // X 10
//			count++;
//		}
//		
//		System.out.println("반복이 종료되었습니다.");
//		
		//무한반복.
		// - 사용 X
//		while (true) {
//			System.out.println(Math.random()); // Math.random(); - 부동소수점형 난수
//		}
		
		Random random = new Random();
		int enemyHealthPoint = random.nextInt(Integer.MAX_VALUE); // -21억 ~ +21억
		System.out.println(enemyHealthPoint);
		
//코드 선택 후 Alt + 방향키	 - 코드 이동
		//while - 언제 끝날 지 모르는 반복문, 웹 애플리케이션 X 잠깐 쓰고 버림.
		while (enemyHealthPoint > 0) {
			int damage = random.nextInt(1000); // 0 ~ 999수.
			System.out.println(damage);
			
			enemyHealthPoint -= damage;
			
			System.out.println(enemyHealthPoint);
		}
	}
	
}

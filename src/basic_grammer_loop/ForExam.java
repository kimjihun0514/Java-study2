package basic_grammer_loop;

public class ForExam {

	public static void main(String[] args) {
		
		/*
		 * 1~100까지의 합 출력
		 * 1~100중 홀수의 합 출력
		 * 1~100중 3, 5, 6의 배수만 출력
		 * Syetem.out.print(); 사용
		 */
		// 1 ~ 100까지의 합
		int sum = 0;
		for(int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 1 ~ 100 중 홀수의 합
		sum = 0;
		
		for(int i = 1; i < 101; i++) {
			if(i % 2 == 1) {
				sum += i;
			}
		}System.out.println(sum);
		
		// 1 ~ 100 중 3, 5, 6의 배수 출력
		for(int i = 1; i < 100; i++) {
		
		}
		
		
	}
}

package basic_grammer_loop;

import java.util.Scanner;

public class AverageExam {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요.");
		int korScore = keyboard.nextInt();
		
		System.out.println("영어 점수를 입력하세요.");
		int engScore = keyboard.nextInt();
		
		System.out.println("수학 점수를 입력하세요.");
		int mathScore = keyboard.nextInt();
		
		System.out.println("코딩 점수를 입력하세요.");
		int progScore = keyboard.nextInt();
		
		int sum = korScore + engScore + mathScore + progScore;
		int average = sum / 4;
		
		//국어 영어 수학 프로그래밍의 합계와 평균을 각각 계산해 할당하고
		//아래 기준에 따라 성적을 출력해보세요.
		//평균 95점 이상 : A+
		//평균 90점 이상 : A
		//평균 85점 이상 : B+
		//평균 80점 이상 : B
		//평균 70점 이상 : C
		//평균 70점 미만 : F
		
		String grade = "";
		//굳이 논리연산자가 필요없는 이유 : if - else 는 하나만 작동하기 때문.
		if (average >= 95) {
			grade = "A+";
			}
		else if(average >= 90) {
			grade ="A";
			}
		else if(average >= 85) {
			grade = "B+";
			}
		else if(average >= 80) {
			grade = "B";
			}
		else if(average >= 70) {
			grade = "C";
			}
		else {
			grade = "F";
			}
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average);
		System.out.println(grade);
		
	}
}

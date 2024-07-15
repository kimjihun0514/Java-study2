package basic_grammer_loop;

import java.util.Scanner;

public class GugudanExam {

	public static void main(String[] args) {
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("단 수를 입력하세요.");
		int i = keyboard.nextInt();
		
		
		if(i > 0) {
			System.out.println("곱할 수를 입력하세요.");
			int num = keyboard.nextInt();
		for(int j = 1; j < num + 1; j++) {
			System.out.println(i + " X " + j + " = " + i * j);
		}
		}
		else {
			System.out.println("구구단 프로그램 종료");
		}
	}
}

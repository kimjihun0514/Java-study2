package basic_grammer_loop;

public class ForExam2 {

	public static void main(String[] args) {
		/* i가 0일 때 j가 1이 되고 "*"이 하나 출력됩니다.
		 * 출력 후  다시 돌아와서 i가 1이 되고 j가 2가 되고 "*"이 두개 출력됩니다.
		 * i가 4가 될 때까지 반복합니다.
		 * i가 5가 되면 조건에 맞지 않아서 출력이 끝이 납니다.
		 */
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i + 1; j++) {			
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

package basic_grammer_loop;

public class MovieExam {

	public static void main(String[] args) {
		
		int money = 10_000;
		int movie = 18_000;
		
		if (money >= movie) {
			System.out.println("관람 가능");
		}
		else {
			System.out.println("관람 불가능");
			System.out.println("부족한 돈 : " + (money - movie));
		}
		
	}
}

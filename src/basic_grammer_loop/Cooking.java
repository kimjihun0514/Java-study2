package basic_grammer_loop;

public class Cooking {

	public static void main(String[] args) {
		// 코드의 핵심 코어(엔진)을 만들때 종종 사용.
		// if 와 switch 혼동 주의.
		// 라면 끓이기 순서.
		int step = 3;
		
		switch(step) {
		case 0:
			System.out.println("찻장 문을 연다.");
			System.out.println("냄비를 꺼낸다.");
			System.out.println("싱크대로 간다.");
		case 1:
			System.out.println("물을 튼다.");
			System.out.println("냄비에 물을 받는다.");
			System.out.println("물을 끈다.");
		case 2:
			System.out.println("가스레인지에 냄비를 올린다.");
			System.out.println("가스 벨브를 연다.");
			System.out.println("불을 켠다.");
		case 3:
			System.out.println("라면을 꺼낸다.");
			System.out.println("라면 봉지를 뜯는다.");
			System.out.println("스프를 꺼낸다.");
			System.out.println("스프를 흔든다.");
			System.out.println("스프를 뜯는다.");
			System.out.println("물이 끓기를 기다린다.");
			System.out.println("스프를 넣는다.");
			System.out.println("건더기 스프를 꺼낸다.");
			System.out.println("건더기 스프를 흔든다.");
			System.out.println("건더기 스프를 뜯는다.");
			System.out.println("건더기 스프를 넣는다");
			System.out.println("비닐봉지들을 쓰레기통에 버린다.");
			System.out.println("면을 넣는다.");
		case 4:
			System.out.println("냉장고로 가서 계란을 꺼내 깨서 냄비에 넣는다.");
		case 5:
			System.out.println("면을 들었다 놨다 해준다.");
			System.out.println("익을 때 까지 반복");
			
			System.out.println("불을 끈다.");
			System.out.println("가스 벨브를 잠근다.");
		case 6:
			System.out.println("전공책을 깔아서 냄비를 올리고 젓가락으로 맛있게 먹는다.");
			System.out.println("설거지를 하고 정리한다.");
		}
		
	}
	
}

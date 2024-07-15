package basic_grammer_loop;

import java.util.Scanner;

public class FlightFareExam {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int money = 1_000_000;
		
		System.out.println("아빠 나이 : ");
		int father = keyboard.nextInt();
		
		System.out.println("엄마 나이 : ");
		int mother = keyboard.nextInt();
		
		System.out.println("자녀 나이 : ");
		int daughter = keyboard.nextInt();
		
		int adultOneWayFlightFare = 400_000;
		int kidOneWayFlightFare = 120_000;
		
		/*
		 * 3인 가족이 100만원으로 편도여행을 가려고 한다.
		 * 부모님의 나이는 각각 40세, 36세입니다.
		 * 딸의 나이는 11세.
		 * 성인 비행요금은 30만원
		 * 아동 비행요금은 12만원입니다. 성인 판단 기준은 19세 이상입니다.
		 * 여행을 떠날 수 있으면 "여행 가자!"
		 * 여행을 떠날 수 없으면 "다음에 가자"
		 */
		
		final int ADULT = 18;
		
		int fare = 0;
		
		if (father > ADULT) {
			fare += adultOneWayFlightFare;
			}
		else {
			fare += kidOneWayFlightFare;
			}
		
		if (mother > ADULT) {
			fare += adultOneWayFlightFare;
		}
		else {
			fare += kidOneWayFlightFare;
		}
		
		if (daughter > ADULT) {
			fare += adultOneWayFlightFare;
		}
		else {
			fare += kidOneWayFlightFare;
		}
		
		System.out.println("총 비행요금은 " + fare +"원 입니다.");
		System.out.println("준비된 현금 : " + money);
		if(money >= fare) {
			System.out.println("여행 가자!");
		}
		else {
			System.out.println("다음에 가자");
		}
	}
}

package basic_grammer_loop;

import java.util.Scanner;

public class VacationCalculator {

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
		
		int adultCount = 0;
		int kidCount = 0;
		
		if (father >= 19) {
			adultCount++;
		}
		else {
			kidCount++;
		}
		if (mother >= 19) {
			adultCount++;
		}
		else {
			kidCount++;
		}
		if (daughter >= 19) {
			adultCount++;
		}
		else {
			kidCount++;
		}
		
		int flightFare = adultOneWayFlightFare * adultCount
				+ kidOneWayFlightFare * kidCount;
		
		System.out.println("성인 : " + adultCount + "명");
		System.out.println("아동 : " + kidCount + "명");
		
		System.out.println("필요 경비 : " + flightFare);
		System.out.println("준비된 현금 : " + money);
		
		if(money >= flightFare) {
			System.out.println("여행 가자!");
		}
		else {
			System.out.println("다음에 가자");
		}
	}
}

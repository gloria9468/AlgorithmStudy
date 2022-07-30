package chapter_1;

import java.util.ArrayList;
import java.util.Scanner;

public class practice_1_1 {
		// p.13 - 실습 1-1
		public void get_max() { 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구하라.");
		System.out.println("첫번째 정수 >>  ");
		int a = scan.nextInt();
		System.out.println("두번째 정수 >>  ");
		int b = scan.nextInt();
		System.out.println("세번째 정수 >>  ");
		int c = scan.nextInt();
		
		int max = a; 
		if(max - b < 0 ) max = b; // a < b
		
		if(max - c < 0) max = c; // b < c
		

		System.out.println("최대값은 >>> " + max );
		
		System.out.println("계속 이어서 하시겠습니까?");
		String yn = scan.next();
		
		if("y".equals(yn)) get_max();
		else System.out.println("종료합니다.");
		
	}
		
	
	// p.21 - 실습 1C-1
	// 3개의 정숫값을 입력하고 중앙값을 구하여 출력 
	// 추가 학습 ::: 사용자에게 갯수에 상관없이 입력값을 받아서 중앙값을 구함.
	public void median() {
		System.out.println("정수를 입력해주세요. 그만 입력할 경우 \"stop\"을 입력해주세요. ");
		ArrayList<Integer> al = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		String scan_in = null;
		do {
			scan_in = scan.next();
			al.add(Integer.parseInt(scan_in));
		} while(!"stop".equals(scan_in));
		
		//System.out.println(al);
		
	}
	
		
	
		
}

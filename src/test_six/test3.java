package test_six;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		/*
		어떤 규칙에 따라 수를 순서대로 나열한 것을 수열이라고 한다.
		예를 들어
		2 6 18 54 162 486 ... 은 2부터 시작해 이전에 만든 수에 3을 곱해 다음 수를 만든 수열이다.
		이러한 것을 수학에서는 앞뒤 수들의 비율이 같다고 하여 등비(비율이 같다의 한문 말) 수열이라고 한다.
		등비 수열을 알게된 경곽이는 갑자기 궁금해 졌다.
		"그럼.... 13번째 나오는 수는 뭘까?"
		경곽이는 물론 수학을 아주 잘 하지만, 프로그램을 만들어 컴퓨터로 자동 계산하고 싶어졌다.
		시작 값(a), 등비의 값(r), 몇 번째 인지를 나타내는 정수(n)가 입력될 때 n번째 수를 출력하는 프로그램을 만들어보자.
		입력
		시작 값(a), 등비의 값(r), 몇 번째 인지를 나타내는 정수(n)이 입력된다.
		(모두 0 ~ 7)
		출력
		n번째로 만들어질 수를 출력한다.
		입력 예시 
		2
		3
		7
		출력 예시
		1458
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 수 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 수 : ");
		int num2 = sc.nextInt();
		System.out.println("세 번째 수 : ");
		int num3 = sc.nextInt();
		int multiSum = num1;
		for(int i=0; i<num3; i++) {
			multiSum = multiSum * num2;
			System.out.println(multiSum);
		}
		
	}

}

package test_six;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		/*
	 	어떤 규칙에 따라 수를 순서대로 나열한 것을 수열이라고 한다.
		예를 들어
		1 4 7 10 13 16 19 22 25 ... 은 1부터 시작해 이전에 만든 수에 3을 더해 다음 수를 만든 수열이다.
		이러한 것을 수학에서는 앞뒤 수들의 차이가 같다고 하여 등차(차이가 같다의 한문 말) 수열이라고 한다.
		수열을 알게된 경곽이는 갑자기 궁금해 졌다.
		"그럼.... 123번째 나오는 수는 뭘까?"
		경곽이는 물론 수학을 아주 잘 하지만, 프로그램을 만들어 더 큰 수도 빠르게 계산하고 싶어졌다.
		시작 값(a), 등차의 값(d), 몇 번째 인지를 나타내는 정수(n)가 입력될 때 n번째 수를 출력하는 프로그램을 만들어보자.
		입력
		시작 값(a), 등차의 값(d), 몇 번째 인지를 나타내는 정수(n)이 입력된다.
		(모두 0 ~ 100)
		출력
		n번째로 만들어질 수를 출력한다.
		입력 예시 
		1
		3
		5
		출력 예시
		13
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시작값을 입력해주세요>");
		int a = sc.nextInt();
		System.out.print("등차 값을 입력해주세요>");
		int b = sc.nextInt();
		System.out.print("몇 번째 자리 까지 출력을 할지 입력해주세요>");
		int n = sc.nextInt();
		
		for(int i = a; i<=(b*n); i+=b) {
			System.out.println(i);
		}
	}
}

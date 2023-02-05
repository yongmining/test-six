package test_six;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		/*1, 2, 3 ... 을 계속 더해나갈때, 그 합이 입력한 정수보다 같거나 작을 때까지,
		(0 ~ 1000)
		계속 합하는 프로그램을 작성해보자.
		즉, 1부터 n까지 정수를 계속 합해 간다고 할 때, 어디까지 합해야 같거나 넘어서는지 알아보고자하는 문제이다.
		하지만, 이번에는 그 때의 합을 출력해야 한다.
		예를 들어 57을 입력하면 1+2+3+...+8+9+10=55 에 다시 11을 더해 66일 때 66이 출력되어야 한다.
		입력
		어느 정도까지 합을 계산할 지,
		정수 한개를 입력받는다.
		(단, 입력되는 자연수는 100 000 000이하이다.)
		출력
		1, 2, 3, 4, 5 ... 계속 더해가다가,
		입력된 정수보다 커지거나 같아지는 경우, 그 때 까지의 합을 출력한다.
		입력 예시 
		57
		출력 예시
		66
		도움말
		조건문이나 반복문의 코드블럭 안에서 break; 가 실행되면
		가장 가까운 코드블럭의 밖으로 빠져나간다.
		예시
		int n, i, s=0;
		n = scan.nextInt();
		for(i=1; ; i++) //for 반목문에서 가운데의 조건이 빠진 경우 무한 반복된다.
		{
  		s+=i;
 		if(s >= n) break; //조건식의 결과가 참이라면, 가장 가까운 반복 코드블럭의 밖으로 빠져나간다.
		} //반복 코드블럭의 마지막, break; 가 실행되면 반복을 중단하고 여기로 튕겨 나온다.
		printf("%d", s);
		무한 반복이 되는 코드는
		while(1) {...}, do {...}while(1); 등도 가능하다.
		0이 아니면 모두 참(true)으로 인식되기 때문이다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요>");
		int a = sc.nextInt();
		int sum = 0;
		for(int i = 1; i<=a; i++) {
			sum += i;
			if(sum >= a) {
				break;
			}
			System.out.print(i+"+");
		}
		System.out.println();
		System.out.println(sum+"입력한 수보다 크거나 같으므로 종료 합니다.");
	}

}

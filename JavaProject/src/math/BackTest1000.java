package math;

import java.util.Scanner;

/*
 * 
문제

두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
입력

첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
출력

첫째 줄에 A+B를 출력한다.
예제 입력 1

1 2

예제 출력 1

3

힌트 

 */
import java.util.Scanner;

public class BackTest1000 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int firNum = Integer.parseInt(num.split(" ")[0]);
		int secNum = Integer.parseInt(num.split(" ")[1]);
		System.out.println(firNum + secNum);
	}
}


//풀이 성공
/*문제

정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.

    1+1+1+1
    1+1+2
    1+2+1
    2+1+1
    2+2
    1+3
    3+1

정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
입력

첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 11보다 작다.
출력

각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력한다.
*/

package dynamic_programming;

import java.util.Scanner;

public class BackTest9095 {
	static int sumCnt;
	
	public static int sumFunction(int idx) {
		int tmpIdx;
		if(idx-3>=0) {
			tmpIdx = idx -3;
			sumFunction(tmpIdx);
		}
		if(idx-2>=0) {
			tmpIdx = idx -2;
			sumFunction(tmpIdx);
		}
		if(idx-1>=0) {
			tmpIdx = idx -1;
			sumFunction(tmpIdx);
		}
		if(idx == 0) {
			sumCnt++;
			return sumCnt;
		}
		
		
		return sumCnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] intBox = new int[count];
		
		for(int i=0; i<count;i++) {
			intBox[i] = sc.nextInt();
		}
		
		for(int j = 0; j<count;j++) {
			sumCnt = 0;
			sumFunction(intBox[j]);
			System.out.println(sumCnt);
		}
	}
	
	
	
}

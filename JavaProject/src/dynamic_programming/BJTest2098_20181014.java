/*
 * 

외판원 순회 문제는 영어로 Traveling Salesman problem (TSP) 라고 불리는 문제로 computer science 분야에서 가장 중요하게 취급되는 문제 중 하나이다. 
여러 가지 변종 문제가 있으나, 여기서는 가장 일반적인 형태의 문제를 살펴보자.

1번부터 N번까지 번호가 매겨져 있는 도시들이 있고, 도시들 사이에는 길이 있다. (길이 없을 수도 있다) 
이제 한 외판원이 어느 한 도시에서 출발해 N개의 도시를 모두 거쳐 다시 원래의 도시로 돌아오는 순회 여행 경로를 계획하려고 한다. 
단, 한번 갔던 도시로는 다시 갈 수 없다. (맨 마지막에 여행을 출발했던 도시로 돌아오는 것은 예외) 이런 여행 경로는 여러 가지가 있을 수 있는데, 
가장 적은 비용을 들이는 여행 계획을 세우고자 한다.

각 도시간에 이동하는데 드는 비용은 행렬 W[i][j]형태로 주어진다. W[i][j]는 도시 i에서 도시 j로 가기 위한 비용을 나타낸다. 비용은 대칭적이지 않다. 즉, W[i][j] 는 W[j][i]와 다를 수 있다. 모든 도시간의 비용은 양의 정수이다. W[i][i]는 항상 0이다. 경우에 따라서 도시 i에서 도시 j로 갈 수 없는 경우도 있으며 이럴 경우 W[i][j]=0이라고 하자.

N과 비용 행렬이 주어졌을 때, 가장 적은 비용을 들이는 외판원의 순회 여행 경로를 구하는 프로그램을 작성하시오.
입력

첫째 줄에 도시의 수 N이 주어진다. (2 ≤ N ≤ 16) 다음 N개의 줄에는 비용 행렬이 주어진다. 각 행렬의 성분은 1,000,000 이하의 양의 정수이며, 갈 수 없는 경우는 0이 주어진다. W[i][j]는 도시 i에서 j로 가기 위한 비용을 나타낸다.

항상 순회할 수 있는 경우만 입력으로 주어진다.
출력

첫째 줄에 외판원의 순회에 필요한 최소 비용을 출력한다.
예제 입력 1

4
0 10 15 20
5  0  9 10
6 13  0 12
8  8  9  0

예제 출력 1

35


 */

package dynamic_programming;

import java.util.Scanner;

public class BJTest2098_20181014 {
	static int[][] square;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine())+1;
		square = new int[num][num];
		
		for(int i=1;i<num;i++) {
			String[] str = sc.nextLine().replaceAll("  ", " ").split(" ");
			for(int j=1; j<num;j++) {
				square[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		for(int e=1; e<=4;e++) {
			calculate(e, 0);
		}
		
		
	}
	
	static int calculate(int stVal, int endVal) {
		
		int result;
		result = square[stVal][endVal] + calculate(endVal -1);
		
		calculate(2,1);
		calculate(3,1);
		calculate(4,1);
		/*
		
		if(square[stVal][endVal])
		
		if(endVal == 0)
			calculate(stVal)
		if(square[stVal][endVal] != 0)
		square[stVal][endVal] + calculate()*/
		return 0;
	}
	
	static int calculate(int status) {
		if(status == 0) {
			return 0;
		} else {
			return status;
		}
	}
}

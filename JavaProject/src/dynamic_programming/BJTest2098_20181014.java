/*
 * 

���ǿ� ��ȸ ������ ����� Traveling Salesman problem (TSP) ��� �Ҹ��� ������ computer science �о߿��� ���� �߿��ϰ� ��޵Ǵ� ���� �� �ϳ��̴�. 
���� ���� ���� ������ ������, ���⼭�� ���� �Ϲ����� ������ ������ ���캸��.

1������ N������ ��ȣ�� �Ű��� �ִ� ���õ��� �ְ�, ���õ� ���̿��� ���� �ִ�. (���� ���� ���� �ִ�) 
���� �� ���ǿ��� ��� �� ���ÿ��� ����� N���� ���ø� ��� ���� �ٽ� ������ ���÷� ���ƿ��� ��ȸ ���� ��θ� ��ȹ�Ϸ��� �Ѵ�. 
��, �ѹ� ���� ���÷δ� �ٽ� �� �� ����. (�� �������� ������ ����ߴ� ���÷� ���ƿ��� ���� ����) �̷� ���� ��δ� ���� ������ ���� �� �ִµ�, 
���� ���� ����� ���̴� ���� ��ȹ�� ������� �Ѵ�.

�� ���ð��� �̵��ϴµ� ��� ����� ��� W[i][j]���·� �־�����. W[i][j]�� ���� i���� ���� j�� ���� ���� ����� ��Ÿ����. ����� ��Ī������ �ʴ�. ��, W[i][j] �� W[j][i]�� �ٸ� �� �ִ�. ��� ���ð��� ����� ���� �����̴�. W[i][i]�� �׻� 0�̴�. ��쿡 ���� ���� i���� ���� j�� �� �� ���� ��쵵 ������ �̷� ��� W[i][j]=0�̶�� ����.

N�� ��� ����� �־����� ��, ���� ���� ����� ���̴� ���ǿ��� ��ȸ ���� ��θ� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
�Է�

ù° �ٿ� ������ �� N�� �־�����. (2 �� N �� 16) ���� N���� �ٿ��� ��� ����� �־�����. �� ����� ������ 1,000,000 ������ ���� �����̸�, �� �� ���� ���� 0�� �־�����. W[i][j]�� ���� i���� j�� ���� ���� ����� ��Ÿ����.

�׻� ��ȸ�� �� �ִ� ��츸 �Է����� �־�����.
���

ù° �ٿ� ���ǿ��� ��ȸ�� �ʿ��� �ּ� ����� ����Ѵ�.
���� �Է� 1

4
0 10 15 20
5  0  9 10
6 13  0 12
8  8  9  0

���� ��� 1

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

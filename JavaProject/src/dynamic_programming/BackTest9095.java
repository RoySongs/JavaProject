
//Ǯ�� ����
/*����

���� 4�� 1, 2, 3�� ������ ��Ÿ���� ����� �� 7������ �ִ�. ���� ��Ÿ�� ���� ���� 1�� �̻� ����ؾ� �Ѵ�.

    1+1+1+1
    1+1+2
    1+2+1
    2+1+1
    2+2
    1+3
    3+1

���� n�� �־����� ��, n�� 1, 2, 3�� ������ ��Ÿ���� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
�Է�

ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���� n�� �־�����. n�� ����̸� 11���� �۴�.
���

�� �׽�Ʈ ���̽�����, n�� 1, 2, 3�� ������ ��Ÿ���� ����� ���� ����Ѵ�.
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

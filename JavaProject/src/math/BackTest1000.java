package math;

import java.util.Scanner;

/*
 * 
����

�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
�Է�

ù° �ٿ� A�� B�� �־�����. (0 < A, B < 10)
���

ù° �ٿ� A+B�� ����Ѵ�.
���� �Է� 1

1 2

���� ��� 1

3

��Ʈ 

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

package math;

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

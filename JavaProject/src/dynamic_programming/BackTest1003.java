package dynamic_programming;

import java.util.Scanner;

public class BackTest1003 {
	static int countZero;
	static int countOne;
	static Result[] rs;
	static int fibonacci(int n) {
	    if (n == 0) {
	    	countZero++;
	        return 0;
	    } else if (n == 1) {
	    	countOne++;
	        return 1;
	    } else {
	        return fibonacci(n-1) + fibonacci(n-2);
	    }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		rs = new Result[value];
		for(int i=0;i<value;i++) {
			countZero = 0;
			countOne = 0;
			fibonacci(sc.nextInt());
			rs[i] = new Result(countZero, countOne);
			
		}
		for(int j=0;j<value;j++) {
			System.out.println(rs[j].a+" "+rs[j].b);
		}
		
	}
	
	public static class Result {
		private int a;
		private int b;
		public Result(int a, int b) {
			super();
			this.a = a;
			this.b = b;
		}
	}
}

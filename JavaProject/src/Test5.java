// 세 값의 최솟값을 구하는 min3 메서드

public class Test5 {
	
	static int min3(int a, int b, int c) {
		int min;
		min = a;
		if(min > b)min=b;
		if(min > c)min=c;
		return min;
	}
	
	public static void main(String[] args) {
		
		int fixNum = 5;
		
		for(int a1 = 1; a1 <fixNum ; a1++) {
			for(int b1 = 1; b1 <fixNum; b1++) {
				for(int c1 = 1; c1 <fixNum; c1++) {
					System.out.println("숫자는 " + a1+","+b1+","+c1+" = "+ min3(a1,b1,c1));
				}
			}
		}
	}
	
	
	
	
}

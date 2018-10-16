// 네 값의 최댓값을 구하는 max4 메서드
public class Test4 {

	
	static int max4(int a, int b, int c, int d) {
		
		int max = 0;
		
		max = a;
		if(b > max)max = b;
		if(c > max)max = c;
		if(d > max)max = d;
		return max;
		
	}
	
	public static void main(String[] args) {
		
		int fixNum = 9;
		
		for(int a1 = 1; a1 <fixNum ; a1++) {
			for(int b1 = 1; b1 <fixNum; b1++) {
				for(int c1 = 1; c1 <fixNum; c1++) {
					for(int d1 = 1; d1 <fixNum; d1++) {
						System.out.println("숫자는 " + a1+","+b1+","+c1+","+d1+" = "+ max4(a1,b1,c1,d1));
					}
				}
			}
		}
		
		
		System.out.println(max4(1,2,3,4));
	}
}

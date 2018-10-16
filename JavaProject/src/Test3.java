
public class Test3 {
	
	
	public static void main(String[] args) {
		int realIdx = 5;
		int[] abc = new int[realIdx];
		
		abc[0] = 0;
		abc[1] = 00;
		abc[2] = 000;
		abc[3] = 1;
		abc[4] = 2;
		
		for(int idx=0; idx<realIdx; idx++) {
			System.out.println(abc[idx]);
		}
		
		int j= 0;
		while(abc.length > j) {
			System.out.println(abc[j]);
			j++;
		}
		
		
		
		
	}
}

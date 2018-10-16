
public class Test2 {

	
	public static void main(String[] args) {
		int i = 100000;
		
		double multiple = 1.3;
		int result;
		for(int j=0; j<13;j++) {
			i*=multiple;
		}
		result = i;
		System.out.println(result);
	}
}

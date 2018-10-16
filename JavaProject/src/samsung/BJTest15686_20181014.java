package samsung;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BJTest15686_20181014 {
	
	
	static int totalMin = 9999999;
	static int[][] square;
	static ArrayList<Node> list = new ArrayList<Node>();
	static ArrayList<Node> list2 = new ArrayList<Node>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] firStr = sc.nextLine().split(" ");
		int n = Integer.parseInt(firStr[0]);
		int m = Integer.parseInt(firStr[1]);
		square = new int[n+1][n+1];
		
		for(int i=1; i<=n;i++) {
			String[] secStr = sc.nextLine().split(" ");
			for(int j=1; j<=n;j++) {
				square[i][j] = Integer.parseInt(secStr[j-1]);
				if(square[i][j] == 2) {
					list.add(new Node(i,j));
				} else if(square[i][j] == 1) {
					list2.add(new Node(i,j));
				}
			}
		}
		solve();
		
		
		
		System.out.println(Arrays.deepToString(square));
	}
	
	static int solve() {
		
		for(int i=0;i<list.size();i++) {
			Node node = list.get(i);
			int realX = node.x;
			int realY = node.y;
			int minSum = 0;
			for(int j=0; j<list2.size();j++) {
				minSum = Math.abs(realX-list2.get(j).x)+Math.abs(realY-list2.get(j).y) +minSum;
			}
			if(minSum < totalMin) {
				
			}
			totalMin = Math.min(minSum, totalMin);
			
		}
		
		
		return 0;
	}
}
class Node {
	int x;
	int y;
	Node(int x, int y){
		this.x =x;
		this.x = y;
	}
}

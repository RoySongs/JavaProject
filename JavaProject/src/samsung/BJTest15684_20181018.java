package samsung;

import java.util.ArrayList;
import java.util.Scanner;

public class BJTest15684_20181018 {
	
	// 기준 점 i
	// n 세로선 수
	// M 가로선 수
	// H 세로선마다 가로선을 놓을 수 있는 위치의 개수 
	static int i;
	static int n;
	static int h;
	static boolean[][] map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		h = Integer.parseInt(str[2]);
		map = new boolean[n+1][h+1];
		// 모두를 찾을 필요 없이 n개 세로선이 있을 경우 n-1개만 찾아도 자동으로 마지막 답은 알 수 있다.
		// 하지만 여기서는 연습을 위해 n개를 모두 테스트한다.
		for(int makeSpot=0; makeSpot<m;makeSpot++) {
			String[] str2 = sc.nextLine().split(" ");
			int firstX =Integer.parseInt(str2[0]);
			int firstY = Integer.parseInt(str2[1]);
			map[firstX][firstY] = true;
			map[firstX][firstY+1] = true;
			
		}
		mapRevise();
	
	}
	static void mapRevise() {
		ArrayList<Node> list = new ArrayList<Node>();
		for(int idx=1;idx<=h;idx++) {
			for(int subIdx=1;subIdx<n;subIdx++) {
				if(map[idx][subIdx]==false && map[idx][subIdx+1]==false) {
					list.add(new Node(idx,subIdx,idx,subIdx+1));
				}
				//map[idx]
				//list.add(new Node<>)
			}
		}
		
		for(i=1;i<=n;i++) {
			move(1,i, 0);
		}
	}
	
	static void move(int x, int y, int standValue) {
		
		if(h == x) {
			System.out.println("y줄은 : "+ y);
		//if(i==y&& h ==x) {
			//종료
			//스택 초기화
			return;
		}
		if(map[x][y]== true && map[x][y-1]== true) {
			// 왼쪽 이동할 경우 스택에 넣는 것도 고려하자.
			standValue++;
			y = y-1;
		}else if(map[x][y]== true && map[x][y+1]== true) {
			standValue--;
			y = y+1;
		}else {
		}
		x = x+1;
		move(x, y, standValue);
		
	}
	
	
	static class Node{
		int bfX;
		int bfY;
		int afX;
		int afY;
		Node(int bfX, int bfY, int afX, int afY){
			this.bfX = bfX;
			this.bfY = bfY;
			this.afX = afX;
			this.afY = afY;
		}
	}
	
}









/* 여기까지는 사다리문제 찾기
package samsung;

import java.util.Scanner;

public class BJTest15684_20181018 {
	
	// 기준 점 i
	// n 세로선 수
	// M 가로선 수
	// H 세로선마다 가로선을 놓을 수 있는 위치의 개수 
	static int i;
	static int h;
	static boolean[][] map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		h = Integer.parseInt(str[2]);
		map = new boolean[n+1][h+1];
		// 모두를 찾을 필요 없이 n개 세로선이 있을 경우 n-1개만 찾아도 자동으로 마지막 답은 알 수 있다.
		// 하지만 여기서는 연습을 위해 n개를 모두 테스트한다.
		for(int makeSpot=0; makeSpot<m;makeSpot++) {
			String[] str2 = sc.nextLine().split(" ");
			int firstX =Integer.parseInt(str2[0]);
			int firstY = Integer.parseInt(str2[1]);
			map[firstX][firstY] = true;
			map[firstX][firstY+1] = true;
			
		}
		for(i=1;i<=n;i++) {
			move(1,i);
		}
	
	}
	
	
	static void move(int x, int y) {
		
		if(h == x) {
			System.out.println("y줄은 : "+ y);
		//if(i==y&& h ==x) {
			//종료
			return;
		}
		if(map[x][y]== true && map[x][y-1]== true) {
			// 왼쪽 이동할 경우 스택에 넣는 것도 고려하자.
			y = y-1;
		}else if(map[x][y]== true && map[x][y+1]== true) {
			y = y+1;
		}else {
		}
		x = x+1;
		move(x, y);
		
	}
	
	
	class Node{
		int y;
		int x;
		Node(int y, int x){
			this.y = y;
			this.x = x;
		}
	}
	
}
*/
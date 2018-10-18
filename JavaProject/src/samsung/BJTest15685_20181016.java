package samsung;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class BJTest15685_20181016 {
	static ArrayList<Node> list = new ArrayList<Node>();
	static int[] wayX = {1,0,-1,0};
	static int[] wayY = {0,-1,0,1};
	static int[][] map = new int[101][101];
	static int result=0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] realStr = sc.nextLine().split(" ");
		int repeat = Integer.parseInt(realStr[0]);
		for(int idx=0;idx<repeat;idx++) {
			String subStr = sc.nextLine();
			String[] str = subStr.split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			int way = Integer.parseInt(str[2]);
			int circleNum = Integer.parseInt(str[3]);
			
			
			int answer = solve(x, y, way, circleNum);
		}
		for(int p=0; p<list.size();p++) {
			System.out.println(p+"는 list x : "+list.get(p).x + " list y : "+list.get(p).y);
		}
		

		 for(int h=0; h<=100; h++){
			 for(int v=0; v<=100; v++){
				  if(map[h][v] ==1&& map[h][v+1] ==1&& map[h+1][v] ==1&& map[h+1][v+1]==1) {
					  ++result;
				  }
			 }
		 }
		 System.out.println("정답은 : " + result);
		
	}
	public static int solve(int x, int y, int way, int circleNum) {
		
		//방향 정보 리스트
		ArrayList<Integer> wList = new ArrayList<Integer>();
		// 스택이 담길 공간
		LinkedList<Integer> stack = new LinkedList<Integer>();
		
		wList.add(way);
		list.add(new Node(x,y));
		map[x][y]=1;
		// 넣는다.
		logic(x,y,wList,stack, circleNum);
		
		return 0;
	}
	
	public static void logic(int x, int y, ArrayList<Integer> wList, LinkedList<Integer> stack, int circleNum) {
		
		if(circleNum ==0) {
			return;
		}
		
		for(int m=0;m<wList.size();m++) {
			// 이동할 circleNum을 찾고 이동한다. 그리고 넣는다.
			stack.push(wList.get(m));
			x = x+wayX[wList.get(m)];
			y = y+wayY[wList.get(m)];
			list.add(new Node(x,y));
			map[x][y]=1;
		}
		
		
		for(int n=0;n<stack.size();n++) {
			int newIdx;
			int popNum = stack.pop()+1;
			if(popNum%4 ==0) {
				newIdx = 0;
			} else {
				newIdx = popNum;
			}
			wList.add(newIdx);
			x = x+wayX[newIdx];
			y = y+wayY[newIdx];
			list.add(new Node(x,y));
			map[x][y]=1;
		}
		logic(x,y,wList,stack,--circleNum);
		
	}
	 
	static class Node{
		int x;
		int y;
		Node(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
}
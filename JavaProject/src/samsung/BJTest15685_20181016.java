package samsung;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class BJTest15685_20181016 {
	static ArrayList<Node> list = new ArrayList<Node>();
	static int[] wayX = {1,0,-1,0};
	static int[] wayY = {0,-1,0,1};
	static int[][] map = new int[102][102];
	static int result=0;
	static int x,y;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] realStr = sc.nextLine().split(" ");
		int repeat = Integer.parseInt(realStr[0]);
		for(int idx=0;idx<repeat;idx++) {
			String subStr = sc.nextLine();
			String[] str = subStr.split(" ");
			x = Integer.parseInt(str[0]);
			y = Integer.parseInt(str[1]);
			int way = Integer.parseInt(str[2]);
			int circleNum = Integer.parseInt(str[3]);
			solve(x, y, way, circleNum);
		}
		for(int h=0; h<=100; h++){
			 for(int v=0; v<=100; v++){
				  if(map[h][v] ==1&& map[h][v+1] ==1&& map[h+1][v] ==1&& map[h+1][v+1]==1) {
					  ++result;
				  }
			 }
		 }
		 System.out.println("aws : " + result);
	}
	public static void solve(int x, int y, int way, int circleNum) {
		
		//방향 정보 리스트
		ArrayList<Integer> wList = new ArrayList<Integer>();
		// 스택이 담길 공간
		
		wList.add(way);
		logic(wList,circleNum);
		
		
		list.add(new Node(x,y));
		map[x][y]=1;
		for(int i=0; i<wList.size();i++) {
			x = x+wayX[wList.get(i)];
			y = y+wayY[wList.get(i)];
			list.add(new Node(x,y));
			map[x][y]=1;
		}
	}
	
	public static void logic(ArrayList<Integer> wList, int circleNum) {
		LinkedList<Integer> stack = new LinkedList<Integer>();
		int stackSize = 0;
		if(circleNum ==0) {
			return;
		}
		
		for(int m=0;m<wList.size();m++) {
			stack.push(wList.get(m));
		}
		stackSize = stack.size();
		for(int n=0;n<stackSize;n++) {
			int popNum = stack.pop()+1;
			if(popNum%4 ==0) {
				popNum = 0;
				wList.add(popNum);
			} else {
				wList.add(popNum);
			}
		}
		logic(wList,--circleNum);
		
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
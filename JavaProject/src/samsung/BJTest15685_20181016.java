package samsung;

import java.util.ArrayList;
import java.util.Scanner;

public class BJTest15685_20181016 {
	static int[][] square = new int[100][100];
	
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
	}
	public static int solve(int x, int y, int way, int circleNum) {
		Node node = new Node(x,y);
		ArrayList<Node> list = new ArrayList<Node>();
		list.add(node);
		// 방향 전환
		switch (way) {
		case 0: x = x+1; break;
		case 1: y = y-1; break;
		case 2: x = x-1; break;
		case 3: y = y+1; break;
		}
		list.add(new Node(x, y));
		
		for(int idx=0; idx<circleNum;idx++) {
			int stdX =x;
			int stdY =y;
			System.out.println(Math.pow(2, circleNum-1));
			for(int subIdx=0;subIdx<Math.pow(2, circleNum-1);subIdx++) {
				int absX = Math.abs(stdX-list.get(subIdx).x);
				int absY = Math.abs(stdY-list.get(subIdx).y);
				list.add(new Node(x- absY, y- absX));
			}
		}
		//기준점
		for(int i=0; i<list.size();i++) {
			System.out.println(i+"는 list x : "+list.get(i).x + " list y : "+list.get(i).y);
		}
		return 0;
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
package minimum_spanning_tree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Practice1 {
	static int n;
	static int m;
	static Edge[] edge;
	static int[] parent;
	static int minNum;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		edge = new Edge[m];
		parent = new int[n+1];
		for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
		for(int i=0; i<m;i++) {
			String[] st = sc2.nextLine().split(" ");
			edge[i] = new Edge(Integer.parseInt(st[0]),Integer.parseInt(st[1]),Integer.parseInt(st[2]));
		}	
		
		Arrays.sort(edge, new Comparator<Edge>() {
			@Override
			public int compare(Edge a, Edge b) {
				return a.cost-b.cost;
			}
		});
		
		
		for(int i=0;i<m;i++) {
			
			int x = cal(edge[i].s);
			int y = cal(edge[i].e);
			
			if(x == y) {
				continue;
			} else {
				parent[x]= y;
				minNum = minNum + edge[i].cost;
			}
			
		}
		System.out.println(minNum);
		
	}
	
	public static int cal(int mg) {
		
		if(parent[mg] == mg ) {
			return mg;
		} else {
			parent[mg] = cal(parent[mg]);
			return parent[mg];
		}
		
	}
	
	
	
	public static class Edge{
		private int s;
		private int e;
		private int cost;
		public Edge(int s, int e, int cost) {
			this.s = s;
			this.e = e;
			this.cost = cost;
		};
	}
}

//MST(Minimum Spanning Tree) 문제 해결을 위한 크루스칼 알고리즘(Kruskal's Algorithm)
/*
 * 
문제
S 왕국의 새로운 정부는 모든 도시를 잇는 고속도로를 건설하려 한다. 그러나 비싼 비용의 문제에 부딪혀, 정부는 최소 비용으로 모든 도시 간을 이동할 수 있게 하고 싶어한다. 
또한 하나의 제약이 더 있는데, 언덕 등을 깎지 않는 친환경 건설을 위해 어떤 도시끼리는 직접 도로를 이을 수 없다.
도로 후보의 목록이 주어질 때, 정부를 도와 모든 도시 간을 잇는 고속도로를 건설하는 최소 비용을 알아내자.


입력
첫 번째 줄에 도시의 수 N이 주어진다. (2≤N≤50,000)
두 번째 줄에 도로 후보의 수 M이 주어진다. (1≤M≤200,000)
세 번째 줄부터 M개의 줄에 걸쳐 각 도로 후보의 정보 s,e,c가 주어진다. s와 e는 도로 후보가 잇는 각 도시의 번호이고, c는 그 도로를 건설하는데 드는 비용이다. (1≤s,e≤N,1≤c≤10,000)
항상 모든 도시를 잇는 고속도로를 건설할 수 있는 입력만 주어진다.

출력
첫 번째 줄에 모든 도시를 잇는 고속도로를 건설하는데 드는 최소 비용을 출력한다.

예제 입력
5
8
1 2 4
1 3 9
1 4 21
2 3 8
2 4 17
3 4 16
5 2 20
5 4 30


예제 출력
48
 */

package minimum_spanning_tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Kruskal_Test1 {
	  	static int N;
	    static int M;
	    static int[] parent;
	    static BufferedReader br;
	    static StringTokenizer st;
	    static Edge[] edges;
	    static int minCost = 0;
	    
	    public static void main(String[] args) throws IOException {
	        br = new BufferedReader(new InputStreamReader(System.in));
	         
	        N = Integer.parseInt(br.readLine());
	        M = Integer.parseInt(br.readLine());
	         
	        edges = new Edge[M];
	        parent = new int[N+1];
	         
	        for (int i = 1; i <= N; i++) {
	            parent[i] = i;
	        }
	         
	        for (int i = 0; i < M; i++) {
	            st = new StringTokenizer(br.readLine());
	            edges[i] = new Edge(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
	        }
	        br.close();
	         
	        //주어진 간선들을 비용에 대한 오른차순으로 정렬
	        Arrays.sort(edges, new Comparator<Edge>() {
	            @Override
	            public int compare(Edge a, Edge b) {
	                return a.cost - b.cost;
	            }
	        });
	         
	        for (int i = 0; i < M; i++) {
	             
	            int rootX = findRoot(edges[i].x);
	            int rootY = findRoot(edges[i].y);
	             
	            if(rootX == rootY){
	                continue;
	            }else{
	                /*Union-Find의 Union
	                두개 Node를 연결. 즉 X의 Root 노드를 Y의 Root노드로 변경*/
	                parent[rootX] = rootY;
	                minCost = minCost + edges[i].cost;
	            }
	            
	        }
	        
	        System.out.println(minCost);
	 
	    }
	    
	    //Union-Find 정점 x의 대표 node 찾기
	    private static int findRoot(int x){
	        if(x == parent[x]) {
	            return x;
	        }else{
	            parent[x] = findRoot(parent[x]);
	            return parent[x];
	        }
	         
	    }
	     
	    private static class Edge{
	        int x; 
	        int y;
	        int cost;
	        public Edge(int x, int y, int cost) {
	            this.x = x;
	            this.y = y;
	            this.cost = cost;
	        }
	    }
}

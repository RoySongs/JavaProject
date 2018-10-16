//MST(Minimum Spanning Tree) ���� �ذ��� ���� ũ�罺Į �˰���(Kruskal's Algorithm)
/*
 * 
����
S �ձ��� ���ο� ���δ� ��� ���ø� �մ� ��ӵ��θ� �Ǽ��Ϸ� �Ѵ�. �׷��� ��� ����� ������ �ε���, ���δ� �ּ� ������� ��� ���� ���� �̵��� �� �ְ� �ϰ� �;��Ѵ�. 
���� �ϳ��� ������ �� �ִµ�, ��� ���� ���� �ʴ� ģȯ�� �Ǽ��� ���� � ���ó����� ���� ���θ� ���� �� ����.
���� �ĺ��� ����� �־��� ��, ���θ� ���� ��� ���� ���� �մ� ��ӵ��θ� �Ǽ��ϴ� �ּ� ����� �˾Ƴ���.


�Է�
ù ��° �ٿ� ������ �� N�� �־�����. (2��N��50,000)
�� ��° �ٿ� ���� �ĺ��� �� M�� �־�����. (1��M��200,000)
�� ��° �ٺ��� M���� �ٿ� ���� �� ���� �ĺ��� ���� s,e,c�� �־�����. s�� e�� ���� �ĺ��� �մ� �� ������ ��ȣ�̰�, c�� �� ���θ� �Ǽ��ϴµ� ��� ����̴�. (1��s,e��N,1��c��10,000)
�׻� ��� ���ø� �մ� ��ӵ��θ� �Ǽ��� �� �ִ� �Է¸� �־�����.

���
ù ��° �ٿ� ��� ���ø� �մ� ��ӵ��θ� �Ǽ��ϴµ� ��� �ּ� ����� ����Ѵ�.

���� �Է�
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


���� ���
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
	         
	        //�־��� �������� ��뿡 ���� ������������ ����
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
	                /*Union-Find�� Union
	                �ΰ� Node�� ����. �� X�� Root ��带 Y�� Root���� ����*/
	                parent[rootX] = rootY;
	                minCost = minCost + edges[i].cost;
	            }
	            
	        }
	        
	        System.out.println(minCost);
	 
	    }
	    
	    //Union-Find ���� x�� ��ǥ node ã��
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

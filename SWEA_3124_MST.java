package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MinSpanningTree_SWEA3124 {
	static int V ,E ;
	static int[] parents;
	static Edge[] edgeList;
	
	static class Edge implements Comparable<Edge> { 
		int start, end, weight;
		
		public Edge(int s, int e, int w) {
			this.start = s;
			this.end = e;
			this.weight = w;
		}
		@Override
		public int compareTo(Edge o) {
			return Integer.compare(this.weight, o.weight);
		}
	}
	
	static void make() {
		for(int i = 1 ; i <= V ; i++) {
			parents[i] = i;
		}
	}
	
	static int findSet(int num) {
		if(parents[num] == num)	return num;
		return parents[num] = findSet(parents[num]);
	}
	
	static boolean union(int a, int b) {
		int aRoot = findSet(a);
		int bRoot = findSet(b);
		if(aRoot == bRoot)	return false;
		int Min_parent = Math.min(aRoot, bRoot);
		parents[aRoot] = Min_parent;
		parents[bRoot] = Min_parent;
		return true;
	}
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/MinSapnnintTree_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st ;
		for(int tc = 1 ; tc <= T ; tc++) {
			sb.append("#").append(tc).append(" ");
			st = new StringTokenizer(br.readLine());
			V = Integer.parseInt(st.nextToken());
			E = Integer.parseInt(st.nextToken());
			edgeList = new Edge[E];
			parents = new int[V+1];
			
			for(int i = 0 ; i < E ; i++) {
				st = new StringTokenizer(br.readLine());
				edgeList[i] = new Edge(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			}
			Arrays.sort(edgeList);
			
			make();
			
			long result = 0 ;
			int cnt = 0;
			
			for(Edge edge : edgeList) {
				if(union(edge.start , edge.end)) {
					result  += edge.weight;
					if(++cnt == V -1) {
						break;
					}
				}
			}
			sb.append(result).append("\n");
		}
		System.out.println(sb.toString());
		br.close();
	}
}

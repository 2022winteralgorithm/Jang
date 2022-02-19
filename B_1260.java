import java.util.*;
import java.io.*;

public class B_1260 {
	static ArrayList<ArrayList<Integer>> G;
	static int N,M,S;
	static boolean[] V1,V2;
	static int[]que;
	static int front, rear;
	static StringBuilder sb;
	static void dfs(int n) {
		sb.append((n+1)+" ");
		V1[n]=true;
		for(int e:G.get(n))
			if(V1[e]==false) dfs(e);
	}
	static void bfs(int n) {
		que[rear++]=n;
		V2[n]=true;
		while(front!=rear) {
			int nn=que[front++];
			sb.append((nn+1)+" ");
			for(int e:G.get(nn))
				if(V2[e]==false) {
					V2[e]=true;
					que[rear++]=e;
				}
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		S=Integer.parseInt(st.nextToken())-1;
		G=new ArrayList<ArrayList<Integer>>();
		
		
		for(int i=0;i<N;i++) {
			G.add(new ArrayList<Integer>());
		}
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(br.readLine());
			int n1=Integer.parseInt(st.nextToken())-1;
			int n2=Integer.parseInt(st.nextToken())-1;
			G.get(n1).add(n2); G.get(n2).add(n1);
		}
		
		for(int i=0;i<N;i++)
			Collections.sort(G.get(i));
		
		sb=new StringBuilder();
		V1=new boolean[N]; dfs(S);
		System.out.println(sb.toString());
		
		sb=new StringBuilder();
		que=new int[100000];
		V2=new boolean[N]; bfs(S);
		System.out.println(sb.toString());
		

	}

}

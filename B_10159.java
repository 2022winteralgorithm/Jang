import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_10159 {
	static int [][]A;
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int M=Integer.parseInt(br.readLine());
		A=new int[N][N];
		for(int t=0;t<M;t++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken())-1;
			int b=Integer.parseInt(st.nextToken())-1;
			A[a][b]=1; A[b][a]=-1;	
		}
		for(int k=0;k<N;k++)
			for(int i=0;i<N;i++)
				for(int j=0;j<N;j++) {
					if(A[i][k]!=0&&(A[i][k]==A[k][j])) {
						A[i][j]=A[i][k];
					}
				}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<N;i++) {
			int cnt=0;
			for(int j=0;j<N;j++) {
				if(i==j) continue;
				else if(A[i][j]==0)
					cnt++;
			}
			sb.append(cnt+"\n");
		}
		
		System.out.println(sb.toString());
	}

}

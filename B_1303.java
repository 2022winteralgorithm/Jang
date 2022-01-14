import java.util.ArrayList;
import java.util.Scanner;

public class B_1303 {
	static int [][]dir= {{0,-1},{-1,0},{0,1},{1,0}};
	static int [][]que;
	static boolean [][]V;
	static int front, rear;
	static Character [][]A;
	static int N,M;
	static boolean Valid(int r,int c) {
		if(r>=M||r<0) return false;
		if(c>=N||c<0) return false;
		return true;
	}
	static int bfsW(int r,int c) {
		rear=0;front=0;V[r][c]=true;
		que[rear][0]=r;que[rear++][1]=c;
		int cnt=1;
		while(front!=rear) {
			int rr=que[front][0], cc=que[front++][1];
			for(int i=0;i<4;i++) {
				int nr=rr+dir[i][0];
				int nc=cc+dir[i][1];
				if(Valid(nr,nc)==false) continue;
				if(V[nr][nc]==false&&A[nr][nc]=='W') {
					V[nr][nc]=true;
					que[rear][0]=nr;que[rear++][1]=nc;
					cnt++;
				}
			}
		}
		return cnt;
	}
	static int bfsB(int r,int c) {
		rear=0;front=0;V[r][c]=true;
		que[rear][0]=r;que[rear++][1]=c;
		int cnt=1;
		while(front!=rear) {
			int rr=que[front][0], cc=que[front++][1];
			for(int i=0;i<4;i++) {
				int nr=rr+dir[i][0];
				int nc=cc+dir[i][1];
				if(Valid(nr,nc)==false) continue;
				if(V[nr][nc]==false&&A[nr][nc]=='B') {
					V[nr][nc]=true;
					que[rear][0]=nr;que[rear++][1]=nc;
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		A=new Character[M][N];
		//bufferreader 일 때 br.readLine 후 substring으로 잘라 읽기도 함.
		for(int i=0;i<M;i++) {
			String str=sc.next();
			for(int j=0;j<N;j++) {
				A[i][j]=str.charAt(j);
			}
		}
		int sumW=0;int sumB=0;
		ArrayList<Integer> ll=new ArrayList<Integer>();
		que=new int[100000][2];
		V=new boolean[M][N];
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(V[i][j]==false&&A[i][j]=='W') {
					int k=bfsW(i,j);
					sumW+=k*k;			
				}
				if(V[i][j]==false&&A[i][j]=='B') {
					int t=bfsB(i,j);
					sumB+=t*t;			
				}
			}
		}
		System.out.println(sumW+" "+sumB);
		
		
	}

}

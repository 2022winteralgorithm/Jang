package coTeBook;
import java.util.Arrays;
/*
3 3
3 1 2
4 1 4
2 2 2 
 * 
2 4
7 3 1 8
3 3 3 4
 */
import java.util.Scanner;

public class GreedyEX3 {
static int min;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int [][]A=new int[N][M];
		for(int i=0;i<N;i++)
			for(int j=0;j<M;j++)
				A[i][j]=sc.nextInt();
		int []B=new int[N];
		
		for(int i=0;i<N;i++) {
			min=Integer.MAX_VALUE;
			for(int j=0;j<M;j++) {
				if(min>A[i][j])
					min=A[i][j];
			}
			B[i]=min;
		}
		//for(int i=0;i<N;i++)
		//	System.out.println(B[i]);
		
		Arrays.sort(B);
		System.out.println(B[N-1]);
		
	}

}

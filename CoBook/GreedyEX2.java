package coTeBook;

import java.util.Arrays;
import java.util.Scanner;

/* 예시
5 8 3
2 4 5 4 6
 */
public class GreedyEX2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int K=sc.nextInt();
		int []A=new int[N];
		for(int i=0;i<N;i++)
			A[i]=sc.nextInt();
		Arrays.sort(A);
		//몫
		int p=M/(K+1);
		//나머지
		int q=M%(K+1);
		int sum=0;
		sum=A[N-1]*K+A[N-2];
		sum=sum*p+A[N-1]*q;
		System.out.println(sum);
		
		
		
	}

}

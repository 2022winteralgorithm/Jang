import java.util.Scanner;

public class B_2559 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int []A=new int[N];
		for(int i=0;i<N;i++)
			A[i]=sc.nextInt();
		int sum=0;
		for(int i=0;i<K;i++)
			sum+=A[i];
		int re=sum;
		for(int i=K;i<N;i++) {
			sum=sum+A[i]-A[i-K];
			System.out.print(sum+" ");
			re=Math.max(sum, re);
		}
		System.out.println(re);
	}

}

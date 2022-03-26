package coTeBook;

import java.util.Scanner;

public class GreedyEX4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cnt=0;
		int N=sc.nextInt(); int K=sc.nextInt();
		while(N>=K) {
			if(N%K==0) {
				N=N/K;
				cnt++;
			}
			else {
				N=N-1;
				cnt++;
			}
		}
		while(N>1) {
			N=N-1;
			cnt++;
			
		}
		System.out.println(cnt);	
	}

}

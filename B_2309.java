import java.util.Arrays;
import java.util.Scanner;

public class B_2309 {
	static int comb(int[] arr,int n,int r) {
		if(r==0||n==r) {
			
			return 1;
			}
		else
			return comb(arr,n-1,r-1)+comb(arr,n-1,r);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []A=new int[9];
		int sum=0;
		for(int i=0;i<9;i++) {
			A[i]=sc.nextInt();
			sum+=A[i];
		}
		Arrays.sort(A);
		int p=0;int q=0;
		for(int i=0;i<8;i++)
			for(int j=i+1;j<9;j++) {
				if(sum-A[i]-A[j]==100) {
					p=i;q=j;
				break;
				}
			}
		
		for(int k=0;k<9;k++) {
			if(k==p||k==q)
				continue;
			System.out.println(A[k]);
		}
	}

}

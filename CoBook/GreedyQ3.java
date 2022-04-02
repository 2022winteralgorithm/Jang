package coTeBook;

import java.util.Scanner;

public class GreedyQ3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int []A=new int[2];
		int cnt=0;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)!=str.charAt(i+1)) {
				if(str.charAt(i)=='1')
					A[1]++;
				else
					A[0]++;
			}
		}
		A[str.charAt(str.length()-1)-'0']++;
	
		System.out.println(Math.min(A[0],A[1]));
	}

}

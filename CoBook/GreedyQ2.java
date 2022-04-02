package coTeBook;

import java.util.Scanner;

public class GreedyQ2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int result=str.charAt(0)-'0';
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)-'0'<=1||result<=1)
				result+=(str.charAt(i)-'0');
			else
				result*=(str.charAt(i)-'0');
		}
		System.out.println(result);
	}

}

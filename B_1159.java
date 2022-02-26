import java.util.Scanner;

public class B_1159 {
	static int[] array=new int[26];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			String str=sc.next();
			char r=str.charAt(0);
			array[r-97]++;
		}
		boolean flag=false;
		for(int i=0;i<26;i++) {
			if(array[i]>=5) {
				flag=true;
				System.out.print((char)(i+97));
			}
		}
		if(flag==false)
			System.out.println("PREDAJA");
		
	}

}

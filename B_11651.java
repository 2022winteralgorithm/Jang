import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B_11651 {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int [][]A=new int[N][2];
		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			A[i][0]=Integer.parseInt(st.nextToken());
			A[i][1]=Integer.parseInt(st.nextToken());
			
		}
		Arrays.sort(A,new Comparator<int[]>(){
			@Override
			public int compare(int[]o1,int[]o2) {
				int res=o1[1]-o2[1];
				if(res==0) return o1[0]-o2[0];
				else return res;
			}
		});
		for(int i=0;i<N;i++) {
			for(int j=0;j<2;j++)
				System.out.print(A[i][j]+" ");
			System.out.println();
		}
	
	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Comparator;

public class B_11650 {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int N=Integer.parseInt(br.readLine());
			int[][] P=new int[N][2];
			for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			P[i][0]=Integer.parseInt(st.nextToken());
			P[i][1]=Integer.parseInt(st.nextToken());
			}
			Arrays.sort(P,new Comparator<int[]>() {
				@Override
				public int compare(int[]o1,int[]o2) {
					int res=o1[0]-o2[0];
					if(res==0) return o1[1]-o2[1];
					 else return res;
				}
			});
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<N;i++)
				sb.append(P[i][0]+" "+P[i][1]+"\n");
			System.out.println(sb.toString());
			}
		catch(IOException e) {
			System.err.println("Error: " + e);
			}
		}
	}

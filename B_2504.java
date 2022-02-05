import java.util.Scanner;
import java.util.Stack;

public class B_2504 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int mul=1;
		int result=0;
		Stack<Character> stack=new Stack<Character>();
		
		for(int i=0;i<str.length();i++) {
			switch(str.charAt(i)) {
			case '(':
				stack.push('(');
				mul*=2;
				break;
			case'[':
				stack.push('[');
				mul*=3;
				break;
				
			case')':
				if(stack.isEmpty()||stack.peek()!='(') {
					result=0;
					break;
				}
				if(str.charAt(i-1)=='(') 
					result+=mul;
				stack.pop();
				mul/=2; break;
				
			case']':
				if(stack.isEmpty()||stack.peek()!='[') {
					result=0;break;
				}
				if(str.charAt(i-1)=='[') 
					result+=mul;
				stack.pop();
				mul/=3;break;
			default:System.out.println(0); return;
			}
		}		
		
		System.out.println(!stack.isEmpty() ? 0:result);
	}

}

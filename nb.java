package assignment_3;
import java.util.*;
public class nb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			int x = sc.nextInt();
			int n = sc.nextInt();
			nobita(n,x);
		}
	}
		
	public static void nobita(int n,int x) {
		int rem = 0;
		if(x%n!=0){
			rem = x % n;
		    if(rem>n/2) {
		    	rem = rem -n;
		    	System.out.println(rem);
		    }else {
		    	System.out.println(rem);
		    }
			
		}
		else {
			System.out.println("0");
		}
	}

}


	



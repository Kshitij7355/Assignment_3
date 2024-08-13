package assignment_3;
import java.util.*;
public class Armstrongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
			int n1 =s.nextInt();
	        int n2 = s.nextInt();
			IS_Armstrong_Number(n1,n2);

		}
		public static void IS_Armstrong_Number(int n1,int n2) {
			int p =0;
	        for(int i = n1 ; i<=n2;i++){
	            int d = countofdigit(n1);
		        int sum = 0;

			     p =n1;
			    while(n1>0) {
				int rem = n1%10;
				sum=(int)(sum+Math.pow(rem, d));
				n1=n1/10;
			    }
			    if(sum==p) {
				System.out.println(p);
			    }
	        }
	        
		}
		public static int countofdigit(int n) {
			int count =0;
			while(n>0) {
				count++;
				n/=10;
			}
			return count;

	}

}

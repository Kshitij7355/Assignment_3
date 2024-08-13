package assignment_3;
import java.util.*;
public class Inverse_Arrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr= new int[n];
		for(int i = 0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int []ar = Inverse(arr);
		for (int i =0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
			
		}
	}
		
		public static int[] Inverse(int[] arr) {
			int[] narr = new int[arr.length];
            for(int i = 0;i<arr.length;i++){
                narr[arr[i]] = i;
            }
            return narr;
        }

	}



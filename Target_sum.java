package assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class Target_sum {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Taking input for size of array
	    int n = sc.nextInt();
	    
	    //Creating an array of n elements
	    int[] arr = new int[n];
	    
	    //Taking input for the elements of the array
	    for(int i=0; i<n; i++) {
	        arr[i] = sc.nextInt();
	    }
	    
	    //Taking input for target element
	    int target = sc.nextInt();
	    
	    //Calling the function to print all triplets of numbers which sum to target
	    printTriplets(arr, target);
	}

	public static void printTriplets(int[] arr, int target) {
	    
	    //Sorting the array first
	    Arrays.sort(arr);
	    
	    //Looping through the array
	    for(int i=0; i<arr.length-2; i++) {
	        int left = i+1;
	        int right = arr.length-1;
	        while(left < right) {
	            int sum = arr[i] + arr[left] + arr[right];
	            if(sum == target) {
	                System.out.println(arr[i] + " " + arr[left] + " " + arr[right]);
	                left++;
	                right--;
	            }
	            else if(sum < target) {
	                left++;
	            }
	            else {
	                right--;
	            }
	        }
	    }
	}

	
}

package Sample;

import java.util.Arrays;

public class top3SmallestNo {

	    public static void main(String[] args) {
	        int[] arr = { 5, 1, 9, 3, 7, 4 };
	        int k = 4;
	        Arrays.sort(arr);
	        System.out.print("The " + k + " smallest numbers are: ");
	        for (int i = 0; i < k; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}
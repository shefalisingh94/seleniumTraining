package Sample;

import java.util.Arrays;

public class ShortestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { -2, 45, 5, 11, -9 };
		int size = array.length;
		System.out.println(size);

		for (int i = 0; i < size - 1; i++) {
		  for (int j = 0; j < size - i - 1; j++) {
		    if (array[j] > array[j + 1]) {
		      int c = array[j];
		      array[j] = array[j + 1];
		      array[j + 1] = c;
		    }
		  }
		}

		System.out.println(Arrays.toString(array));

	}

}

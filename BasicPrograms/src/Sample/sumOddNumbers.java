package Sample;

public class sumOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1,5,4,2,9};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) { // check if number is odd
                sum += numbers[i]; // add odd number to sum
            }
        }

        System.out.println("Sum of odd numbers: " + sum);
    }
}

	

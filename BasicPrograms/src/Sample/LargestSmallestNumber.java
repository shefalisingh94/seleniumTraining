package Sample;

public class LargestSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]= {-1,-11,0,1,2,40,23,4,5};
		int largest=number[0];
		int smallest= number[0];
		for(int i=0; i<number.length; i++) {
			if(number[i]>largest) {
				largest=number[i];
			}
			else if(number[i]<smallest) {
				smallest=number[i];
			}
		}
		System.out.println(smallest);
		System.out.println(largest);

	}

}

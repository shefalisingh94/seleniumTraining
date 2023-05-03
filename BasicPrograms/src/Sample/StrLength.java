package Sample;

public class StrLength {

	public static void main(String[] args) {
		String str = "My name is Shefali Singh 123";
		int count = 0;
		int count2 = str.length();

//		String[] w = str.split(" ");
//		for (int i = w.length; i >= 0; i--) {
//			System.out.print(w[i]+"");
//		}
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));

		}
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				count++;
			}
		}

		System.out.println("The number of digits in the string is: " + count +" ");
		

		System.out.println("The number of characters in the string is: " + count2);
	}
}

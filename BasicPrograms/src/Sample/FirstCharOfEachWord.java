package Sample;

public class FirstCharOfEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Shefali.is.a.good.girl.and.a.good.daughter";
		String[] words = input.split("[.]");
		String output = "";
		for (String word : words) {
		    output += word.charAt(0);
		}
		System.out.println(output);
	}

}

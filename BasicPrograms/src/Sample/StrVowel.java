package Sample;

public class StrVowel {

	public static void main(String[] args) {
		int vCount=0, cCount=0;
		String str= " My name is Shefali Singh" ;
		str = str.toLowerCase();
		for (int i=0; i<str.length(); i++) {
			if(str.charAt(i)== 'a' || str.charAt(i)== 'e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
			vCount++;
			}
			else if(str.charAt(i)>'a' && str.charAt(i)<'z') {
				cCount++;
				}
		}
		System.out.println("vowel is :" +vCount);
		System.out.println("Consonent is :" +cCount);
	}

}

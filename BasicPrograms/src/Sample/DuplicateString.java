package Sample;

public class DuplicateString {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String str= "Shefali Singh";
		char[] ch = str.toCharArray();
		char temp ;
		int length= ch.length;
		
		for(int i= 0; i<length-i-1; i++) {
			temp= ch[i];
			ch[i]= ch[length-i-1];
			ch[length-i-1]= temp;
			
		}
		System.out.print(ch);


	}

}

package Sample;

public class StrLength {
	

	public static void main (String[] args) {
		int Count=0;
		String str= "My name is Shefali Singh";
		String[] w= str.split(" ");
		for(int i=w.length; i>=0; i--)
		{
			//System.out.print(w[i]+"");
		}
		for(int i=0; i<str.length();i++) {
			System.out.print(str.charAt(i));
			
		}
		for (int i= str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println("Count is" +Count);
		}
	}



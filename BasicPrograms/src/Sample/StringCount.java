package Sample;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "My name is Shefali";
		int count =0;
		for(int i=0 ; i<str.length(); i++) {
            if(str.charAt(i) != ' ')    

					count++;
				
		}
	System.out.println("total no of character in string :" +count);
		
		

	}

}

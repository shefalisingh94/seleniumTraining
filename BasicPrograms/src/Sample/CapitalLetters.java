package Sample;

public class CapitalLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "today-is-monday";
		int count=0;
		
		String[] words= str.split("-");
		//String str1= str.toUpperCase();
		for(int i=0; i<words.length; i++) {
			char c= words[i].charAt(0);
			String c1= String.valueOf(c).toUpperCase();
			String sub= words[i].substring(1);
			System.out.print(c1+sub +" ");
			
		}
	}
}
		
//		//char[] words= str.toCharArray();
//		for (int i=0; i<str.length();i++) {
//			if(str.charAt(i)== 'a') {
//				count++;
//				
//				
//			}
//		}
//		System.out.print(count);
//			
//		}

	
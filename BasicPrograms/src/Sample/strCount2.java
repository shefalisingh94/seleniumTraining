package Sample;

public class strCount2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		String str= "s,h,e, f,a,a,  l,a,l,i";
		char[] ch = str.toCharArray();
		//ch[0]= 
		int count=0; 
		
		for(int i=0; i<ch.length;i++) {
			if( ch[i]==  'a') {
					count++;
			
		}
		}
			System.out.print("The no of times 'a' is repeated is" +count +":" +"thank you");
		
		
		
	}

}
	

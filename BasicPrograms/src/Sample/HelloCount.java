package Sample;

public class HelloCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Hello, World!";
        char[] ch = str.toCharArray();
        int Count=0;
        
        for(int i= 0; i<ch.length; i++){
            if(ch[i]== 'l'){
               Count++;
            }
        }
        System.out.println("count of L is " +Count);
        
    }

	

}

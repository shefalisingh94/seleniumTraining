package Sample;

public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "g,d,s,f,d";
        int count=0;
       char[] ch = str.toCharArray();
       for(int i = 0; i<ch.length; i++){
           if(ch[i] == 'd'){
               count++;
           }
       }
               System.out.print("Duplicate word is:" +count);
          }

}

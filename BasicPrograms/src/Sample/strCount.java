package Sample;


public class strCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "shefali.singh.shefali";
		//String str1= "shefli.singh.shefali";
		//String str2= new String("shefali.singh.shefali");
		String[] arr  = str.split("[.]");
		int count = 0;
		for(int i=0; i<arr.length; i++)
		{
		if(arr[i].equals("shefali"))
		{
		count++;
		}
		}
		System.out.print(count);
//		System.out.println(str.equals(str1));
//		System.out.println(str==str1);
//		System.out.println(str==str2);
//		System.out.println(str.equals(str2));

	}

}


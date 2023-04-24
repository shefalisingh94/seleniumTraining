package Sample;

public class Variable2 {
	int a=10;    //non static
	static int c=20; //static 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=30;
		
		//calling static member directly
		System.out.println(c);
		
		//calling static member using class name
		System.out.println(Variable2.c);
		
		//calling static member  	
		Hello();
		
		//to call the non static member we need to create the object of the class
		Variable2 v2= new Variable2();
		System.out.println(v2.a);
		v2.Test();

	}
	//User defined method
	//Static Member
	public static void Hello() {
		char ch= 'a';
		System.out.println(ch);
	}
	
	//User defined method
	//non static member
	public void Test() {
		String s= "shefali";
		System.out.println(s);
	}

}

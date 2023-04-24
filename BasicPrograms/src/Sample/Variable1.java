package Sample;


public class Variable1 {
	int a=5; //Global Variable

	public static void main(String[] args) {  //Pre defined method
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8}; //local variable
		String s= "Java is a Programming language";
		System.out.println(a[0]);
		Object c[]= {1,2,3,4,"shefali", "java", 11<4, 12>5,'a'};
		System.out.println(c[5]);
		System.out.println(c[6]);
		System.out.println(c[7]);
		System.out.println(c[8]);
		//System.out.println(c[9]);
		
		int x=10;
		int y = 20;
		int z;
		System.out.println("Before Swapping:" +x +" "+y);
		z=x;
		x=y;
		y=z;
		System.out.println("After Swapping:" +x +" "+y);
		System.out.println(s);
		aMethod();
	}
		
		public static void aMethod(){ //user defined methods
			
		 System.out.println("shefali");
			
		}
		public static void bMethod() {
		// TODO Auto-generated method stub
		
	}

}

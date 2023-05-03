package javaPackage;

public class UrinaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		System.out.println(++a); //2, 2
		System.out.println(a); //2 
		System.out.println(a++); // 2,3
		System.out.println(++a); //4,4
		System.out.println(a);//4
		System.out.println(++a + a++);// 5,5, 5,6
		System.out.println(a++ + ++a); //6,7,8,8
		System.out.println(a++ + --a); //8,9,8,8
		System.out.println(--a + --a);//7,7,6,6
		System.out.println(a-- + a--); //6,5,5,4
		System.out.println(++a + a--); //5,5,5,4
		System.out.println(a++ + --a);//4,5,4,4
		
		

	}

}

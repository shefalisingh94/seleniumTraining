package Selenium;

public class AllDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Java is a funny language";  
		//Print = language funny a is Java 
		String[] words=s1.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
		   System.out.print(words[i]+" ");
		 
		}
		 System.out.println("");
		 //Print= egaugnal ynnuf a si avaJ

		for(int i=s1.length()-1;i>=0;i--)
		{
		   System.out.print(s1.charAt(i));
		}
		System.out.println("");
		//Print= Java is a funny language
		for (int i=0; i<s1.length(); i++) {
			
			System.out.print(s1.charAt(i));
		}
		}}  



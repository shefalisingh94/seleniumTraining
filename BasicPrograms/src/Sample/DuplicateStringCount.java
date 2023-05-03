package Sample;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateStringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);

		System.out.println("Enter the required string value ::");
		
	      String reqString = sc.next();
	      char[] myArray = reqString.toCharArray();
	      System.out.println("indices of the duplicate characters in the given string :: ");
	      Set<Character> set = new HashSet();

	      for(int i=0; i<myArray.length; i++){
	         if(!set.add(myArray[i])){
	            System.out.println(" character :: "+myArray[i]);
	         }
	      }
	   }
	}


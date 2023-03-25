package Sample;

import java.util.HashMap;
import java.util.Map;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"shef", "shef", "ma", "apple", "ma", "Ra"};
		for(int i=0; i<str.length; i++) {
			for(int j= i+1; j<str.length; j++) {
				if(str[i].equals(str[j])) {
					System.out.println(str[i]);
				}
			}
			
		}
	

}
}
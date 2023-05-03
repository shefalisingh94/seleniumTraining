package Sample;

public class PrintDuplicateChars {
	    public static void main(String[] args) {
	        String str = "Interface";
	        int count = 0;
	        
	        char[] chars = str.toCharArray();
	        
	        System.out.print("Duplicate characters in \"" + str + "\": ");
	        
	        for (int i = 0; i < chars.length; i++) {
	            for (int j = i+1; j < chars.length; j++) {
	                if (chars[i] == chars[j]) {
	                    System.out.print(chars[j] + " ");
	                    count++;
	                    break;
	                }
	            }
	        }
	        
//	        if (count == 0) {
//	            System.out.println("No duplicates found.");
//	        }
	    }
	}



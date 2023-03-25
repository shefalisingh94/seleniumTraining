package Sample;

public class MissingNumber2 {
	public static void main(String[] args) {
		   int[] arr= {2,6,10,18,22,26};
		   int missingNumber=0;
		        for(int i =0; i<=arr.length; i++){
		            if(arr[i+1]-arr[i] !=4 ){
		                missingNumber= arr[i]+4;
		                break;
		            }
		        }
		        System.out.println("Missing no" +missingNumber);
		       
		    }
		}



package Sample;

public class PrintingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		int row= a.length;
		System.out.println("Total row :"+row);
		int column= a[0].length;
		System.out.println("Total column :"+ column);
		
		for(int i=0; i<row;i++) {
			for(int j=0; j<column; j++) {
				System.out.print(a[i][j]+" ")	;
			}
			System.out.println();
		}

	}

}

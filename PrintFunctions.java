import java.util.Scanner;
public class PrintFunctions {
	
	public static int[][] takeinput(){
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of rows");
		int rows = s.nextInt();
		System.out.println("enter number of cols");
		int cols = s.nextInt();
		
	int input[][] = new int[rows][cols];
	//now we will take input from user
	
	for(int i = 0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			System.out.println("enetr element at "+i+" rows "+j+" cols ");
			input[i][j] = s.nextInt();
			
       }
	}
	return input;
	}
	
	public static void print(int input[][]) {
		int rows = input.length;
		int cols = input[0].length;
		
		for(int i = 0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(input[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	public static int largestsumcol(int input[][]) {
		int largest = Integer.MIN_VALUE;
		int rows = input.length;
		int cols = input[0].length;
		
		for(int i = 0; i<rows;i++) {
			int sum = 0;
			for(int j =0;j<cols;j++){
				sum = sum + input[i][j];
			}
			if(sum>largest) {
				largest = sum;
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr2[][] = {{1,2,3},{4,5,6}};
//		print(arr2);
		
		int input[][] = takeinput();
		print(input);
		System.out.println("largest col. sum " +largestsumcol(input));
		
		
	
	

	}

}

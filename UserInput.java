import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
	
	for(int i = 0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			System.out.print(input[i][j]+ " ");
		}
		System.out.println();
	}

	}

}

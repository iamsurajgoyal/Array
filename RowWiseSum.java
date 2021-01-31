import java.util.Scanner;
public class RowWiseSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
	int input[][] = new int[m][n];
	
	for(int i = 0;i<m;i++) {
		for(int j=0;j<n;j++) {
			
			input[i][j] = sc.nextInt();
			
       }
	}
		
	for(int i = 0; i<m;i++) {
		int sum = 0;
		for(int j =0;j<n;j++){
			sum = sum + input[i][j];
		}
		System.out.print(sum+ " ");
	}

	}

}

import java.util.Scanner;
public class SwapAlternate {
	
	public static void swap(int input[]) {
		for(int i = 0; i< input.length - 1; i = i+2) {
			 int temp = input[i];
			 input[i] = input[i+1];
			 input[i+1] = temp;
			 
		}
	}
	
	public static int[] inputText() {
		Scanner s = new Scanner(System.in);
		int size =  s.nextInt();
		int input[] = new int[size];
		for(int i =0; i< size;i++) {
			input[i] = s.nextInt();
		}
			return input;
	}
	
	public static void print(int input[]) {
		for(int i = 0;i<input.length;i++) {
			System.out.print(input[i]+ " ");
		}  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = inputText();
		swap(arr);
		print(arr);
		
		

	}

}

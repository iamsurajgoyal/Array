import java.util.Scanner;

public class ArrayStored {
	
	public static int sum(int input[]) {
		int result = 0;
		for(int i = 0; i<input.length;i++) {
			result = result + input[i];
		}
		return result;
	}
	
	public static int[] takeInput(){
		Scanner s = new Scanner(System.in);
		int size =  s.nextInt();
		int input[] = new int[size];
		
		for(int i = 0;i< size;i++) {
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void print(int input[]) {
		int size = input.length;
		for( int i = 0;i< size;i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
	}
	
	public static void incrementArray(int input[]) {
		input = new int[5];
		for(int i =0; i<input.length;i++) {
			input[i]++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5};
		incrementArray(arr);
		print(arr);
		
		
		
//		int arr[] = takeInput();
//		print(arr);
//		int s = sum(arr);
//		System.out.println("Sum " + s);

	}

}

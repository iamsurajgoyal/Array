import java.util.Scanner;
public class LinearSearch {
	
	public static int LinearSearch(int input[], int num) {
		for(int i = 0;i<input.length;i++) {
			if(input[i]==num)
				return i;
		}
	 	return -1;
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
		Scanner s = new Scanner(System.in);
		
		int arr[] = inputText();
		int n = s.nextInt();
		
		int a = LinearSearch(arr,n );
        System.out.println(a);

	}

}

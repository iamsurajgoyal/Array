
public class ArrayUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int [10];
		//arr[3] = 15;
		System.out.println(arr[3]);
		System.out.println(arr[0]);
		System.out.println(arr[5]);
		
		char chArray[] = new char[11];
		double dArray[] = new double[12];
		
		System.out.println(chArray[0]);   //initialize as null chaeracter 
		chArray[1] = 'a';
		System.out.println(chArray[1]);
		
		System.out.println(dArray[0]);
		dArray[1] = 1.2;
		System.out.println(dArray[1]);
		
		boolean bArray[] = new boolean[5];
		System.out.println(bArray[3]);

	}

}

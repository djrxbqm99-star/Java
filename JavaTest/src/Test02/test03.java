package Test02;

public class test03 {

	public static void main(String[] args) {
	
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		
		for (int i = 0; i < 10; i++) {
		System.out.print(arr[i]+", ");
		}
		System.out.print("\n");
		
		
		for (int j = 0; j < 5; j++) {
			int temp = arr[j];  // temp = 1
			arr[j] = arr[9-j];	// arr[0] = arr[9] = 10
			arr[9 - j] = temp;  // arr[9] = temp 
			System.out.print(j+1 + "번째 변경 : ");
			for(int n : arr) {
				System.out.print(n+", ");
			}
			System.out.println();
		}
		// temp 10 
		
		for ( int n : arr ) {
		System.out.print(n+", ");
		}
	
	}
}

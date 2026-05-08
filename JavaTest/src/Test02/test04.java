package Test02;

public class test04 {
    public static void main(String[] args) {
        int arr[] = {4, 2, 1, 5, 3};
        
        for (int i=0 ; i<4 ; i++) {
        	
            for (int j = i+1 ; j<5 ; j++) {
            	
                if (arr[i] > arr[j]) { // 4>2
                    int temp = arr[j];  //temp = 2 
                    arr[j] = arr[i];      //arr[1] = 4
                    arr[i] = temp;        //arr[0] = 2
                    //arr = 2,4,1,5,3
                }
            }
            System.out.print((i+1) + "라운드 : ");
            for (int n : arr) {
                System.out.print(n+" ");
            }
            System.out.print("\n");
        }
    }
}
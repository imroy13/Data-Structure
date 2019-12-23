import java.util.Scanner;
public class Selection_Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		Selection_Sort.insertionSort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	}
	
	static void insertionSort(int[] arr) {
		int i,j,max,temp;
		for(i=0;i<arr.length-1;i++) {
			max=0;
			for(j=1;j<arr.length-1-i;j++) {
				if(arr[j]>arr[max]) {
					max=j;
				}
			}
			temp = arr[arr.length-1-i];
			arr[arr.length-1-i] = arr[max];
			arr[max] = temp;
			
			
		}
	}

}

import java.util.Scanner;
public class Quick_Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++)
			arr[i] = sc.nextInt();
		Quick_Sort.sort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	}
	
	
	static void quickSort(int[] arr,int lower,int upper) {
		if(upper<=lower)
			return;
		int pivot = arr[lower];
		int start = lower;
		int stop = upper;
		
		while(lower<upper) {
			while(arr[lower] <= pivot && lower < upper)
				lower++;
			while(arr[upper] > pivot && lower<= upper)
				upper--;
			if(lower < upper) {
				int temp = arr[upper];
				arr[upper] = arr[lower];
				arr[lower] = temp;
			}
		}
		int temp = arr[upper];
		arr[upper] = arr[start];
		arr[start] = temp;
		quickSort(arr,start,upper-1);
		quickSort(arr,upper+1,stop);
		
	}
	
	static void sort(int arr[]) {
		quickSort(arr,0,arr.length-1);
	}

}

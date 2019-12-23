import java.util.Scanner;
public class Insertion_Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		Insertion_Sort.insertionSort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
	static void insertionSort(int[] arr) {
		int j;
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i];
			for(j=i;j>0 && arr[j-1]>temp;j--) {
				arr[j] = arr[j-1];
			}
			arr[j] = temp;
		}
	}

}

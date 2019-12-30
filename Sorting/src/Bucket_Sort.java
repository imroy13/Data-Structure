import java.util.Scanner;
public class Bucket_Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int lowerRange = sc.nextInt();
		int upperRange = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++)
			arr[i] = sc.nextInt();
		Bucket_Sort.bucketSort(arr, lowerRange, upperRange);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
			
	}

	
	static void bucketSort(int[] arr,int lowerRange,int upperRange) {
		int i,j;
		int range = upperRange - lowerRange;
		int[] count = new int[range];
		for(i=0;i<arr.length;i++)
			count[arr[i]-lowerRange]++;
		j=0;
		for(i=0;i<range;i++) {
			for(;count[i]>0;count[i]--)
				arr[j++] = i + lowerRange;
		}
		
	}
	
	
}

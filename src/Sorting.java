import java.util.*;

public class Sorting{
		
	static int n=0;
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter number of element you want to sort");
			
			n = sc.nextInt();
			
			int ar[] = new int[n];
			
			System.out.println("Enter elements now");
			
			for(int i=0; i<n; i++) {
				ar[i]=sc.nextInt();
			}
			
			//Arrays.sort(ar);
			
			sort(ar);
		}

		private static void sort(int[] ar) {
			
			for(int i=0;i<n; i++) {
				for(int j=i+1; j<n; j++) {
					if(ar[i]>ar[j]) {
						int temp = ar[i];
						ar[i] = ar[j];
						ar[j] = temp;
					}
				}
			}
			
			System.out.print("Sorted Order is - ");
			
			for(int i=0; i<n;i++) {
				System.out.print(ar[i]+" ");
			}
		}
}

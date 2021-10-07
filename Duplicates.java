import java.util.*;
class Duplicates{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n = scn.nextInt();
		System.out.println();
		System.out.println("Enter the "+n+" number of elements in an array:");
		int arr[]=new int[n];
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<n;i++){
			arr[i]=scn.nextInt();
			hs.add(arr[i]);
		}
        System.out.println("Number of duplicate elements are :"+(n-hs.size()));

	}

}
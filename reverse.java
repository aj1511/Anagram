
public class reverse_array {

	
	
	static void rev (int x[], int start, int end) {
		
		while(start < end) {
			int temp = x[start];
			x[start] = x[end];
			x[end] = temp;
			start ++;
			end --;	
		}	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int arr[] = {4,6,2,18,6,3,1,6,8};
		System.out.println("Before reverse");
		for(int k:arr) {
			
			System.out.print(k+" ");
		}
		rev(arr,0,arr.length-1);
		
		System.out.println("\nAfter reverse");
		for(int k:arr) {
			System.out.print(k+" ");
		}

	}

}

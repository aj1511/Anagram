
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime(1));
	}
	
	private static boolean isPrime (int in) {
		boolean ans =  true;
		
		if(in<2)
			ans =false;
		else
			if(in>=2) {
				for (int i=2;i<=Math.sqrt(in);i++) {
					if(in%i==0) {
						ans = false;
						break;
					}
				}
			}
		return ans;
	}
}

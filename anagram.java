	
	public class anagram {
	
		public static void main(String[] args) {
			
			String a="listen";
			String b="silent";
			int al[]= new int[256];
			boolean isAnagram=true;
			
			
			for (char j:a.toCharArray())
			{
				int index = (int)j;
				al[index]++;
			}
			
			for (char j:b.toCharArray())
			{
				int index = (int)j;
				al[index]--;
			}
			
			for (int i=0;i<256;i++)
			{
				if(al[i]!=0)
					{isAnagram=false;
					break;
					}
			}
			
			if(isAnagram)
				System.out.println("It is Anagram");
			else
				System.out.println("Not a Anagram");
			
		}		
}


import java.util.*;
public class duplicateElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j,k;
		System.out.print("Enter the number of elements in the array: ");
		n=sc.nextInt();
		System.out.println();
		System.out.println("Enter the "+n+" number of elements in an array:");
	int a[]=new int[n];
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
int c=0,f=0,d=0,e=0;
for(i=0;i<n;i++)
{
	for(j=0;j<i;j++)
	{
		if(a[i]==a[j])
		{
			c=1;
			break;
		}
	}
	if(c==0)
	 {d++;
		for(k=0;k<n;k++)
		{
			if(a[i]==a[k])
			{
				f++;
				e=1;
			}
			else
			{
				if(k==n-1&&e==0)
					d--;
			}
		}
		
	 }
	c=0;
	e=0;

}
System.out.println("Number of duplicate elements is:"+(f-d));

	}

}

import java.util.*;
class ReverseArray
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 array elements:");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\nReverse array elements:");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]+"");
		}
	}
}
import java.util.*;
class foreachloop
{
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int i,s;

		int a[]=new int[10];

		System.out.println("Enter elements in array");
		for(i=0;i<8;i++)
		{
			a[i]=S.nextInt();
		}

		s=0;

		//for each loop
		for(int v : a)
		{
			if(v%2==0)
			{
				s=s+v;
			}
		}
		System.out.println("sum of Even Element "+s);			

	}
}
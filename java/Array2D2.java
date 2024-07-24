import java.util.*;
class Array2D2
{
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int a[][]=new int [3][3];
		int b[][]=new int [3][3];
		int c[][]=new int [3][3];

		int i,j;
		System.out.println("Enter elements fro matrix 1");
		for(i=0;i<3;i++)
		{
			a[i]=new int[3];
			System.out.println("Enter data for "+i+"th row");
			for(j=0;j<3;j++)
			{
				a[i][j]=S.nextInt();
			}
		}
		System.out.println("Data in Matrix 1");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(" "+a[i][j]);
			}	
			System.out.println();
		}

		System.out.println("Enter elements fro matrix 2");
		for(i=0;i<3;i++)
		{
			b[i]=new int[3];
			System.out.println("Enter data for "+i+"th row");
			for(j=0;j<3;j++)
			{
				b[i][j]=S.nextInt();
			}
		}
		System.out.println("Data in Matrix 2");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(" "+b[i][j]);
			}	
			System.out.println();
		}

		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}	
		}

		System.out.println("Sum of both Matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(" "+c[i][j]);
			}	
			System.out.println();
		}
	}
}
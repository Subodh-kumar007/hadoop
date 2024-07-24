import java.util.*;
class Array2D1
{
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int ar[][]=new int [3][3];

		int i,j;
		System.out.println("Enter elements");
		for(i=0;i<3;i++)
		{
			ar[i]=new int[3];
			System.out.println("Enter data for "+i+"th row");
			for(j=0;j<3;j++)
			{
				ar[i][j]=S.nextInt();
			}
		}
		System.out.println("Data in 2 D Array");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(" "+ar[i][j]);
			}	
				System.out.println();
		}
	}
}
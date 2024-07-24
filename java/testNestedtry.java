class testNestedtry
{
	public static void main(String[] args) {

		int a[]={1,2,3,4,5};
		try{
			System.out.println("Value of element 5:- "+a[3]);
			try{
				int c=a[4]/(a[3]-4);
				System.out.println("Value of c:- "+c);
			}
			catch(ArithmeticException E)
			{
				System.out.println("Value of c:- "+E);
			}

		}
		catch (IndexOutOfBoundsException E) 
		{
				System.out.println(":- "+E);
		}	

	}
}
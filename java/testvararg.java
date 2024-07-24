//Varargs method handling in old ways before JDK 5
class testvararg
{
	static void varTest(int a[])
	{
		int l=a.length;
		System.out.println("Total Argument received"+l);
		if(l>0)
		{
			for(int i:a)
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		int n1[]={10};
		int n2[]={10,20};
		int n3[]={10,20,30};
		int n4[]={};

		varTest(n1);
		varTest(n2);
		varTest(n3);
		varTest(n4);
	}
}
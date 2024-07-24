//Varargs approach to handle multiple argument after JDK 5
class testvararg3
{
	static void varTest(int ...a)
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

	static void varTest(boolean ...a)
	{
		int l=a.length;
		System.out.println("Total Argument received"+l);
		if(l>0)
		{
			for(boolean i:a)
			{
				System.out.print(i+" ");
			}
		}
	}	

	static void varTest(String ...m)
	{
		int l1=m.length;
		System.out.println("Total String Argument received"+l1);		

		System.out.println();
		if(l1>0)
		{
			for(String j:m)
			{
				System.out.print(j+" ");	
			}
		}
	}	
	public static void main(String[] args) {		
		varTest(10);
		varTest(10,20);//Calling with 2 integer parameter
		varTest(true,false,true);//Calling with 3 argument boolean Type
		varTest("Hello","testing","20","30");//Calling with 3 Parameter 2 integer and 1 String parameter		
	}
}
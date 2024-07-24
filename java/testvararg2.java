//Varargs approach to handle multiple argument after JDK 5
class testvararg2
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

	static void varTest(String m,int ...a)
	{
		int l=a.length;
		System.out.println("Total Argument received"+(l+1));
		System.out.print(m+" ");
		if(l>0)
		{
			for(int i:a)
			{
				System.out.print(i+" ");
			}
		}
	}	
	public static void main(String[] args) {		
		varTest(10);
		varTest(10,20);//Calling with 2 integer parameter
		varTest("Hello testing",20,30);//Calling with 3 Parameter 2 integer and 1 String parameter
		varTest(true,false,true);//Calling with 3 argument boolean Type
	}
}
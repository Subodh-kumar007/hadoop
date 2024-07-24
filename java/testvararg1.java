//Varargs approach to handle multiple argument after JDK 5
class testvararg1
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
	public static void main(String[] args) {
		
		varTest(10);//Calling with 1 integer parameter
		varTest(10,20);//Calling with 2 integer parameter
		varTest(10,20,30);//Calling with 3 integer parameter
		varTest();//Calling with 0 integer parameter
	}
}
class testVariableStatic
{
	static int a;
	int b;
	void readData(int c)
	{
		a++;
		b=c;
	}
	void showData()
	{
		System.out.println("Value of A:- "+a);
		System.out.println("Value of B:- "+b);
	}

	static void showData1()
	{
		System.out.println("Value of A:- "+a);
		//System.out.println("Value of B:- "+b);
	}
}
class testVariable
{
	public static void main(String[] args) {
		testVariableStatic obj1=new testVariableStatic();
		testVariableStatic obj2=new testVariableStatic();
		obj1.readData(10);
		obj1.showData();

		obj2.readData(20);
		obj2.showData();	

		testVariableStatic.showData1();
	}

}
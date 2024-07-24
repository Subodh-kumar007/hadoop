class testStatic2
{
	static{
		System.out.println("Hello Every One I am Static Block from testStatic2");
	}	
	static void showStatic()
	{
		System.out.println("Hello Every One I am showStatic Method from testStatic2");
	}
	void show()
	{
		System.out.println("Hello Every One I am Show Method from testStatic2");	
	}
}
class testStatic1
{
	static{
		System.out.println("Hello Every One I am Static Block");
	}
	void show()
	{
		System.out.println("Hello Every One I am Show Method");
	}

	public static void main(String[] args) {
		testStatic2 obj2=new testStatic2();
		testStatic1 obj=new testStatic1();
		obj.show();
		
		obj2.show();
		testStatic2.showStatic();
	}
}
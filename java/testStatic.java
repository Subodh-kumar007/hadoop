class testStatic
{
	static{
		System.out.println("Hello Every One I am Static Block");
	}
	static{
		System.out.println("Hello Every One I am Static Block 2");
	}

	void show()
	{
		System.out.println("Hello Every One I am Show Method");
	}

	static void showStatic()
	{
		System.out.println("Hello Every One I am showStatic Method");
	}

	public static void main(String[] args) {
		testStatic obj=new testStatic();
		obj.show();
		showStatic();
	}
}
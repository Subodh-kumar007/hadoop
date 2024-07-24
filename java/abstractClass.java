abstract class testAbstract
{
	void show()
	{
		System.out.println("I am show from testAbstract");
	}
	abstract void display();
}
class Child1 extends testAbstract
{
	void show()
	{
		System.out.println("I am show from Child1");
	}
	void display()
	{
		System.out.println("I am display from Child1");
	}
}
class abstractClass
{
	public static void main(String[] args) {
		//testAbstract T=new testAbstract(); Will give error
		Child1 obj1=new Child1();
		obj1.show();

		obj1.display();
	}
}
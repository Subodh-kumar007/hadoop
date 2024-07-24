// single inheritance
/*
As we can see both parent and child class have a method with same
name "show". hence when a call to method is make with child 
Object then call for parent method is overridden i.e it is hidden
and the call will always invoke child method. the concept is 
called function overriding.
*/
class Parent
{
	void show()
	{
		System.out.println("Hello ! I am show from Parent");
	}
}
class Child extends Parent
{
	void show()
	{
		super.show();
		System.out.println("Hello ! I am show from child");
	}
}
class testOverRiding
{
	public static void main(String[] args) {

		Child C=new Child();
		C.show();

	}
}
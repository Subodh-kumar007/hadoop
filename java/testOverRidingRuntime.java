// Hierarchical inheritance
//Run time polymorphism
/*
It is an approach where call to an overloaded method is achieved
at run time. the concept is called Dynamic Method Dispatch.
Here we have an objects of both parent and child class. At run time 
what ever refernce parent object is holding helps in calling 
the method.
*/
class Parent
{
	void show()
	{
		System.out.println("Hello ! I am show from Parent");
	}
}
class Child1 extends Parent
{
	void show()
	{
		System.out.println("Hello ! I am show from child1");
	}
}
class Child2 extends Parent
{
	void show()
	{
		System.out.println("Hello ! I am show from child2");
	}
}
class testOverRidingRuntime
{
	public static void main(String[] args) {

		Parent Ref;//Declaration of Object;

		Parent P=new Parent();//Object declaration and instantiation
		Child1 C1=new Child1();
		Child2 C2=new Child2();

		Ref=P;//here Ref is holding Reference of Parent
		Ref.show();

		Ref=C1;//here Ref is holding Reference of Child1
		Ref.show();

		Ref=C2;//here Ref is holding Reference of Child2
		Ref.show();


	}
}
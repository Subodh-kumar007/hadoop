import java.util.*;
class student
{
	int rollno;
	String name;
	student(int rno,String n)
	{
		rollno=rno;
		name=n;
	}
	void showOutput()
	{
		System.out.println("rollno:- "+rollno);
		System.out.println("Name:- "+name);
	}
}
class testConstruct
{
	public static void main(String[] args) {
		student S=new student(102,"Manish");
			S.showOutput();
	}
}

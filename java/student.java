import java.util.*;
class information
{
	int rno;
	String name,course;
	void readInput()
	{
		int r;
		System.out.println("Enter student detail");
		Scanner S=new Scanner(System.in);
		rno=S.nextInt();
		name=S.next();
		course=S.next();
	}
	void showOutput()
	{
		System.out.println("Student Detail");
		System.out.println(rno+" "+name+" "+course);
	}
};
class student
{
	public static void main(String[] args) {
		information obj=new information();//Memory allocation
		obj.readInput();
		obj.showOutput();	
	}
}
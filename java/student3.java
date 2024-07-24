import java.util.*;
class information
{
	private int rno;
	private String name,course;

	void readInput(int rno,String name,String course)
	{
		this.rno=rno;
		this.name=name;
		this.course=course;
	}
	void showOutput()
	{
		System.out.println("Student Detail");
		System.out.println(rno+" "+name+" "+course);
	}	
};
class student3
{
	public static void main(String[] args) {
		information obj=new information();//Memory allocation
		
		System.out.println("Enter student detail");
		
		obj.readInput(102,"Manish","BCA");
		obj.showOutput();
	}
}
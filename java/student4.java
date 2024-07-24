import java.util.*;
class information
{
	private int rno;
	private String name,course;

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
class student4
{
	public static void main(String[] args) {

		int size,i;
		Scanner S=new Scanner(System.in);
		System.out.println("How many student detail to enter");
		size=S.nextInt();
		information obj[]=new information[size];//Memory allocation

		for(i=0;i<size;i++)
		{
			obj[i]=new information();
			obj[i].readInput();
		}
		for(i=0;i<size;i++)
			obj[i].showOutput();
	}
}
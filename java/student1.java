import java.util.*;
class information
{
	int rno;
	String name,course;
};
class student1
{
	public static void main(String[] args) {
		information obj=new information();//Memory allocation

		System.out.println("Enter student detail");
		Scanner S=new Scanner(System.in);
		obj.rno=S.nextInt();
		obj.name=S.next();
		obj.course=S.next();


		System.out.println("Student Detail");
		System.out.println(obj.rno+" "+obj.name+" "+obj.course);

	}
}
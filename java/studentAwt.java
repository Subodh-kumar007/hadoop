//By association Frame class
import java.awt.*;
class studentAwt
{
	studentAwt()
	{
		Frame F=new Frame();

		Label L1=new Label("School Admission Form");
		L1.setBounds(50,40,200,30);

		Label L2=new Label("Student Name* ");
		L2.setBounds(30,80,50,30);
		
		TextField T1=new TextField();
		T1.setBounds(120,80,50,30);

		Button b=new Button("Submit...!");
		b.setBounds(50,120,100,30);

		F.add(L1);
		F.add(L2);
		F.add(T1);
		F.add(b);

		F.setSize(400,400);
		F.setTitle("Student Form");
		F.setLayout(null);
		F.setVisible(true);
	}
	public static void main(String[] args) {
		studentAwt F=new studentAwt();
	}
}
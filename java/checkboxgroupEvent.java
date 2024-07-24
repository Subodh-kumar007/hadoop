import java.awt.*;
import java.awt.event.*;
public class checkboxgroupEvent
{
	checkboxgroupEvent(){
		Frame F=new Frame("checkboxgroupEvent");
		Label L=new Label();
		L.setAlignment(Label.CENTER);
		L.setSize(400,100);

		CheckboxGroup cbg=new CheckboxGroup();

		Checkbox cb1=new Checkbox("C++",cbg,false);
		cb1.setBounds(100,100,50,50);

		Checkbox cb2=new Checkbox("C",cbg,false);
		cb2.setBounds(100,150,50,50);

		Checkbox cb3=new Checkbox("Python",cbg,false);
		cb3.setBounds(100,200,50,50);

		Checkbox cb4=new Checkbox("Java",cbg,false);
		cb4.setBounds(100,250,50,50);

		Checkbox cb5=new Checkbox(".NET",cbg,false);
		cb5.setBounds(100,300,50,50);

		
		F.add(cb1);
		F.add(cb2);
		F.add(cb3);
		F.add(cb4);		
		F.add(cb5);

		F.add(L);

		cb1.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent E){
				L.setText("C++ CheckBox"+"Checked");
			}
		});

		cb2.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent E){
				L.setText("C CheckBox"+"Checked");
					
			}
		});

		cb3.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent E){
				L.setText("Python CheckBox"+"Checked");
			}
		});

		cb4.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent E){
				L.setText("Java CheckBox"+"Checked");
			}
		});

		cb5.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent E){
				L.setText(".NET CheckBox"+"Checked");
			}
		});
		F.setSize(500,500);
		F.setLayout(null);
		F.setVisible(true);

	}
	public static void main(String[] args) {
		new checkboxgroupEvent();
	}
}
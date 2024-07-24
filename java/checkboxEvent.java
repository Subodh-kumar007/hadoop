import java.awt.*;
import java.awt.event.*;
public class checkboxEvent
{
	checkboxEvent(){
		Frame F=new Frame("checkboxEvent");
		Label L=new Label();
		L.setAlignment(Label.CENTER);
		L.setSize(400,100);

		Checkbox cb1=new Checkbox("C++");
		cb1.setBounds(100,100,50,50);

		Checkbox cb2=new Checkbox("C");
		cb2.setBounds(100,150,50,50);

		Checkbox cb3=new Checkbox("Python");
		cb3.setBounds(100,200,50,50);

		Checkbox cb4=new Checkbox("Java");
		cb4.setBounds(100,250,50,50);

		Checkbox cb5=new Checkbox(".NET");
		cb5.setBounds(100,300,50,50);

		
		F.add(cb1);
		F.add(cb2);
		F.add(cb3);
		F.add(cb4);		
		F.add(cb5);

		F.add(L);

		cb1.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent E){
				L.setText("C++ CheckBox"
					+(E.getStateChange()==1?"Checked":"Unchecked"));
			}
		});

		cb2.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent E){
				L.setText("C CheckBox"
					+(E.getStateChange()==1?"Checked":"Unchecked"));
			}
		});

		cb3.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent E){
				L.setText("Python CheckBox"
					+(E.getStateChange()==1?"Checked":"Unchecked"));
			}
		});

		cb4.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent E){
				L.setText("Java CheckBox"
					+(E.getStateChange()==1?"Checked":"Unchecked"));
			}
		});

		cb5.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent E){
				L.setText(".NET CheckBox"
					+(E.getStateChange()==1?"Checked":"Unchecked"));
			}
		});
		F.setSize(500,500);
		F.setLayout(null);
		F.setVisible(true);

	}
	public static void main(String[] args) {
		new checkboxEvent();
	}
}
import java.awt.*;
import java.awt.event.*;
public class choiceBox
{
	choiceBox()
	{
		Frame F=new Frame("Choice Box");
		Label L=new Label();
		L.setAlignment(Label.CENTER);
		L.setSize(400,100);

		Button btn=new Button("Show");
		btn.setBounds(250,150,50,30);

		Choice cb=new Choice();
		cb.setBounds(90,150,70,70);

		cb.add("C++");
		cb.add("C");
		cb.add("Python");
		cb.add(".NET");
		cb.add("PHP");
		cb.add("Android");
		cb.add("Java");
		cb.add("Ruby");
		cb.add("Javascript");

		F.add(cb);
		F.add(L);
		F.add(btn);

		F.setSize(500,500);
		F.setLayout(null);
		F.setVisible(true);

		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent E){
				String Data="Language Selected:- "+
				cb.getItem(cb.getSelectedIndex());

				L.setText(Data);
			}
		});
	}

	public static void main(String[] args) {
		new choiceBox();
	}
}
//JComboBox
// public class JComboBox extends JComponent implements ItemSelectable, ListDataListener, ActionListener, Accessible
// 1. JComboBox() with default data Model
// 2. JComboBox(Object[] items) contain element specified in array
// 3. JComboBox(Vector <?> items) contain element specified in Vector

// commonly used methods of this class
// 1. void addItem(Object O)
// 2. void removeItem(Object O)
// 3. void removeallItems()
// 4. void setEditable(boolean B)
// 5. void addActionListener(ActionListener A) 
// 6. void addItemListener(ItemListener I)
import javax.swing.*;
import java.awt.event.*;
class swingComboBox 
{
	JFrame F;
	swingComboBox ()
	{
		F=new JFrame("comboBox");
		JLabel l1=new JLabel();
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setSize(400,100);

		JButton b1=new JButton("Click Me");
		b1.setBounds(300,70,100,30);

		String Language[]={"C++","C","Java","Python","PHP",".NET","Ruby","Django","Silenuim"};
		JComboBox cb1=new JComboBox(Language);
		cb1.setBounds(50,70,75,20);

		F.add(l1);F.add(b1);F.add(cb1);
		F.setLayout(null);
		F.setSize(500,500);
		F.setVisible(true);

		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent E){
				String Data="Selected Programming Language:-"+cb1.getItemAt(cb1.getSelectedIndex());
				l1.setText(Data);
			}
		});
	}
	public static void main(String[] args) {
		swingComboBox cb=new swingComboBox ();
	}
}

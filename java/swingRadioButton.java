//JRadio Button 
// public class JRadioButton extends JToggleButton implements Accessible
// 1. JRadioButton() Uselected radio button with no text
// 2. JRadioButton(String s) Uselected radio button with text
// 3. JRadioButton(String s,boolean selected) Uselected radio button with specified text and status

// commonly used methods of JRadioButton
// 1. void setText(String s)
// 2. String getText()
// 3. void setEnabled(boolean b)
// 4. Icon getIcon()
// 5. void setMnemonics(int a)
// 6. void addActionListener(ActionListener A)
import javax.swing.*;
import java.awt.event.*;
class swingRadioButton extends JFrame implements ActionListener
{
	JRadioButton rb1,rb2,rb3;
	JButton b1;

	swingRadioButton()
	{
		rb1=new JRadioButton("Male");
		rb1.setBounds(50,70,100,30);

		rb2=new JRadioButton("FeMale");
		rb2.setBounds(50,120,100,30);
		
		rb3=new JRadioButton("Others");
		rb3.setBounds(50,170,100,30);

		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);bg.add(rb2);bg.add(rb3);

		b1=new JButton("Click Me");
		b1.setBounds(50,220,100,30);

		b1.addActionListener(this);

		add(rb1);add(rb2);add(rb3);add(b1);

		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent E)
	{
		if(rb1.isSelected())
		{
			JOptionPane.showMessageDialog(this,"Your Gender is Male");
		}
		if(rb2.isSelected())
		{
			JOptionPane.showMessageDialog(this,"Your Gender is Female");
		}
		if(rb3.isSelected())
		{
			JOptionPane.showMessageDialog(this,"Your Gender is Others");
		}
	}
	public static void main(String[] args) {
		swingRadioButton SR=new swingRadioButton();
	}
}

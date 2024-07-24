//Jlist
// public class JList extends JComponent implements Scrollable, Accessible

// 1. JList() list with empty Data
// 2. JList(arr[] listData) list with specified array elements
// 3. JList(ListModel<ary> data Model) list with specified non-null model

// 1. void addListSelectionListener(ListSelectionListener L)
// 2. int getSelectedIndex()
// 3. ListModel getModel()
// 4. void setlistData(Object [] ld)
import javax.swing.*;
import java.awt.event.*;
public class swingList
{
	swingList(){
		JFrame F=new JFrame();
		JLabel L=new JLabel();
		L.setSize(500,100);

		JButton B=new JButton("Click ME");
		B.setBounds(200,150,80,30);

		DefaultListModel<String> l1=new DefaultListModel<>();
		l1.addElement("C");
		l1.addElement("C++");
		l1.addElement("Python");
		l1.addElement(".NET");
		l1.addElement("Ruby");
		l1.addElement("HTML");
		l1.addElement("JavaScript");

		JList <String>lst=new JList(l1);
		lst.setBounds(100,100,75,75);

		F.add(L);F.add(B);F.add(lst);
		F.setSize(500,500);
		F.setVisible(true);
		F.setLayout(null);

		B.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent E)
			{
				String Data="";
				if(lst.getSelectedIndex()!=-1)
				{
					Data="Programaing Langugae:- "+lst.getSelectedValue(); 
					L.setText(Data);
				}																																						
			}
		});

	}

	public static void main(String[] args) {
		swingList sw=new swingList();

	}
}
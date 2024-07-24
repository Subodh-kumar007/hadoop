//JTable
// JTable():- table with empty cells
// JTable(Object[][], Object[] columns):- table with specified data
import javax.swing.*;
import javax.swing.event.*;
public class swingTable
{
	public static void main(String[] args) {
		JFrame F=new JFrame("Table Formater");
		String data[][]={{"101","Jai","65000"},
						 {"101","Jai","65000"},
						 {"101","Jai","65000"},
						 {"101","Jai","65000"},
						 {"101","Jai","65000"},
						 {"101","Jai","65000"}};
		String col[]={"EmpId","Name","Salary"};
		JTable jt=new JTable(data,col);
		jt.setCellSelectionEnabled(true);
		ListSelectionModel select=jt.getSelectionModel();
		select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		select.addListSelectionListener(new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent E)
			{
				String Data=null;
				int[]row=jt.getSelectedRows();
				int[]column=jt.getSelectedColumns();
				for(int i=0;i<row.length;i++)
				{
					for(int j=0;j<col.length;j++)
					{
						Data=(String)jt.getValueAt(row[i],column[j]);
					}
				}
				System.out.println("Table Element Selected"+Data);
			}
		});
	
	JScrollPane sp=new JScrollPane(jt);	
	F.add(sp);
	F.setSize(500,500);
	F.setVisible(true);
	}
}
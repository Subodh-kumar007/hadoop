//Swing Application without inheriting Frame and without constructor
import javax.swing.*;

public class testSwing1
{
    public static void main(String[] args) {
    JFrame F=new JFrame();
    JLabel L1=new JLabel("Employee Name");
    L1.setBounds(30,70,80,30);

    JTextField TF=new JTextField();
    TF.setBounds(150,70,80,30);

    JButton B=new JButton("Click ME");
    B.setBounds(30,120,80,30);

    F.add(B);
    F.add(L1);
    F.add(TF);

    F.setSize(300,300);
    F.setTitle("First AWt Application");
    F.setLayout(null);
    F.setVisible(true);
  }
}

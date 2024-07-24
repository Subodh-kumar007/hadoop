//Swing Application by inheriting Frame and with constructor
import javax.swing.*;

public class testSwing2 extends JFrame
{
    testSwing2()
    {
      JLabel L1=new JLabel("Employee Name");
      L1.setBounds(30,70,80,30);

      JTextField TF=new JTextField();
      TF.setBounds(150,70,80,30);

      JButton B=new JButton("Click ME");
      B.setBounds(30,120,80,30);

      add(B);
      add(L1);
      add(TF);

      setSize(300,300);
      setTitle("First AWt Application");
      setLayout(null);
      setVisible(true);
    }
    public static void main(String[] args) {
      testSwing2 ts=new testSwing2();
  }
}

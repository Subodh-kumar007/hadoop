//By inheriting Frame class
import java.awt.*;
class awtExample extends Frame
{
	awtExample()
	{
		Button b=new Button("Click Me...!");
		b.setBounds(50,20,100,30);
		add(b);
		setSize(400,400);
		setTitle("First Awt Example");
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		awtExample F=new awtExample();
	}
}
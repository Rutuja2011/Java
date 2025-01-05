import java.util.*;
import javax.swing.*;
import java.io.*;
public class Demo7 extends JFrame
{
    JTable tb1;
    Demo7()
    {
    	setVisible(true);
    	setSize(500,400);
    	setLayout(null);
    	
    	Vector cols=new Vector();
    	cols.add("Roll No:");
    	cols.add("Name");
    	cols.add("Per");
    	
    	Vector data=new Vector();
    	Vector row1=new Vector();
        row1.add("101");
        row1.add("Rutu");
        row1.add("98");
       
        Vector row2=new Vector();
        row2.add("102");
        row2.add("Sharau");
        row2.add("87");
        
        data.add(row1);
        data.add(row2);
        
        tb1=new JTable(data,cols);
        JScrollPane jsp=new JScrollPane(tb1);
        jsp.setBounds(100,100,300,100);
        add(jsp);
    }
	public static void main(String[] args)
	{
		new Demo7();
	}

}

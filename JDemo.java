import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
public class JDemo extends JFrame
{
	JTable tb1;
	JDemo()
	{
		setVisible(true);
		setSize(600,400);
		setLayout(null);
		String cols[]={"Roll No","Name","Per"};
		String data[][]={{"101","om","98.8"},
				          {"102","sao","78.8"},
			            	{"103","ram","68.8"}};
		
		tb1=new JTable(data,cols);
		JScrollPane jsp=new JScrollPane(tb1);
		jsp.setBounds(100,100,400,300);
	
		add(jsp);
	}

	public static void main(String[] args)
	{
		new JDemo();
	}

}

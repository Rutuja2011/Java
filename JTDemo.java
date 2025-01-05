import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
public class JTDemo extends JFrame
{
	JTable tb1;
	JTDemo()
	{
		setVisible(true);
		setSize(600,600);
		setLayout(null);
		String cols[]={"Roll No","Name","Per"};
		String data[][]={{"101","om","98.8"},
				          {"102","sao","78.8"},
			            	{"103","ram","68.8"}};
		
		tb1=new JTable(data,cols);
		
		tb1.setBounds(100,100,400,400);
		add(tb1);
	}

	public static void main(String[] args)
	{
		new JTDemo();
	}

}

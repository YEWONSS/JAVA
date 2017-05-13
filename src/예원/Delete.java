package 예원;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.sql.*;


public class Delete extends JFrame implements ActionListener{
	JTextField codeField;
	String strSql;
	JButton del;
	
	public Delete(){
		
	}
	public void Run(){
		JPanel p1 = new JPanel();
		del = new JButton("레코드삭제");
		codeField = new JTextField(8);
		
		del.addActionListener(this);
		
		//버튼이벤트
		
		p1.add(new JLabel("삭제할등록코드입력 : "));
		p1.add(codeField);
		p1.add(del);
		
		add(p1, BorderLayout.CENTER);
		setLocation(400,100);
		setSize(400,100);
		setVisible(true);
		setTitle("레코드 삭제");
	}
	public void actionPerformed(ActionEvent e){
		strSql = "Delete from saveinfo WHERE number=" + codeField.getText() +";";
		DeleteData dd = new DeleteData(strSql);
		dd.delete();
	}
}

class DeleteData extends JFrame{
	Frame f;
	String strSql;
	
	public DeleteData(String strSql){
		this.strSql = strSql;
	}
	
	public void delete(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e){
			System.out.println("JDBC driver loading error:");
		}
		try{
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/redatadb", "root", "");
			
			Statement st = conn.createStatement();
			
			st.executeUpdate(strSql);
			
			st.close();
			conn.close();
		}
		catch(SQLException e){
			System.out.println("SQLException: " + e.getMessage());
		}
	}
}
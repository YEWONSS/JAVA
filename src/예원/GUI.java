package ����;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.sql.*;
import javax.swing.*;
import javax.swing.event.*;

import ����.Y.card_T;

import java.util.*;

public class GUI extends JFrame implements ActionListener{
	private card_D card;
	Container contentPane;
	JLabel l1;
	JButton b1;
	JTextField t1;
	card_T ss;
	card_T sss;
	JTextArea t2;
	Todays t;
	JButton b2;
	JMenuItem menuItem1;
	JMenuItem menuItem2;
	JMenuItem menuItem3;
	String strSql;
	String re;
	
	ImageIcon[] red = { new ImageIcon("red/11.PNG"),
			new ImageIcon("red/1��.PNG"),
			new ImageIcon("red/2����.PNG"),
			new ImageIcon("red/3��.PNG"),
			new ImageIcon("red/4����.PNG"),
			new ImageIcon("red/5�׸�.PNG"),
			new ImageIcon("red/6�׸�.PNG"),
			new ImageIcon("red/7�׸�.PNG"),
			new ImageIcon("red/8��.PNG"),
			new ImageIcon("red/9�׸�.PNG"), 
			new ImageIcon("red/10�׸�.PNG"),

			new ImageIcon("red/1ȫ��.PNG"), 
			new ImageIcon("red/2ȫ��.PNG"), 
			new ImageIcon("red/3ȫ��.PNG"),
			new ImageIcon("red/4�ʴ�.PNG"), 
			new ImageIcon("red/5�ʴ�.PNG"), 
			new ImageIcon("red/6û��.PNG"),
			new ImageIcon("red/7�ʴ�.PNG"),
			new ImageIcon("red/8����.PNG"), 
			new ImageIcon("red/9û��.PNG"),
			new ImageIcon("red/10û��.PNG")};

	//

	public GUI() {
		card = new card_D();
		setTitle("����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		JPanel mP = new JPanel();
		mP.setLayout(new FlowLayout());

		l1 = new JLabel("���� �ϴ� ����       ");
		l1.setFont(new Font("����", Font.BOLD, 15));
		//b1 = new JButton("���� ���� ");
		JLabel l11 = new JLabel("���� ����            ");
		t1 = new JTextField();
		//b1.addActionListener(new ActionListener() {
		//	public void actionPerformed(ActionEvent event) {
		//		repaint(); //.....
		//	}
		//});
		mP.add(l1);
		mP.add(l11);
	//	mP.add(b1);
		
		
		t = new Todays(); //��¥Ŭ����
		JMenuBar me = new JMenuBar();
		JMenu datas = new JMenu("*�ɼ�*");
		JMenu deld = new JMenu("���ڵ� ����");
		menuItem1 = new JMenuItem("�����ϱ�");
		menuItem2 = new JMenuItem("�ڵ�˻�����");
		menuItem3 = new JMenuItem("��緹�ڵ����");
		
		datas.add(menuItem1);
		deld.add(menuItem2);
		deld.add(menuItem3);
		
		me.add(datas);
		me.add(deld);
		mP.add(me);
		contentPane.add(mP, BorderLayout.NORTH);
		
		ac();
		
		MyPanel game = new MyPanel();
		game.setLayout(null);
		game.setBackground(Color.PINK);
		contentPane.add(game, BorderLayout.CENTER);
		setSize(500, 1000);
		setVisible(true);

	}
	public void ac(){
		menuItem1.addActionListener(this);
		menuItem2.addActionListener(this);
		menuItem3.addActionListener(this);

}
	
	class MyPanel extends JPanel {

		JLabel l2 = new JLabel("ī��");
		JButton b2 = new JButton();
		JButton b3[] = new JButton[3];
		JButton b4[] = new JButton[2];
		JButton b5 = new JButton();
		JButton b6 = new JButton();
		ButtonGroup group = new ButtonGroup();

		JRadioButton[] g = new JRadioButton[3];

		String num = null;
		
		public MyPanel() {
			
			add(l2);
			l2.setLocation(220, 5);
			l2.setSize(50, 50);

			add(b2);
			b2.setLocation(205, 315);
			b2.setSize(100, 30);
			
			add(b5);
			b5.setLocation(205, 530);
			b5.setSize(100, 30);
			// b2.setVisible(true);
			
			add(b6);
			b6.setLocation(150, 620);
			b6.setSize(200, 30);

			add(t1);
			t1.setLocation(90, 280);
			t1.setSize(300, 20);
			
			t2 = new JTextArea("�����",3,5);
			add(t2);
			t2.setLocation(105, 570);
			t2.setSize(300, 40);
			
			Object[] card_s = card_D.card_R().toArray();
			Object[] card_s1 = card_D.card_C().toArray();
			//System.out.print(card_D.card_C());
			
			for (int i = 0; i < g.length; i++) {
				g[i] = new JRadioButton((Integer.toString((int) card_s[i])));
				group.add(g[i]);
				add(g[i]);
				g[i].setLocation(i * 70 + 140, 50);
				g[i].setSize(50, 50);
			}

			for (int k = 0; k < card_s.length; k++) {
				b3[k] = new JButton(red[(int) card_s[k]]);
				add(b3[k]);
				b3[k].setLocation(k * 140 + 50, 110);
				b3[k].setSize(110, 160);
				g[k].addItemListener(new MyItemListener());
				t1.setText("�޷�");
			}
			for (int k = 0; k < 2; k++) {
				b4[k] = new JButton(red[0]);
				add(b4[k]);
				b4[k].setLocation(k * 200 + 100, 360);
				b4[k].setSize(110, 160);
			}
		}

		public void text() {
			t1.setText("ī�带 " + num + "�� ���Ƚ��ϴ�.");
			Object[] card_s1 = card_D.card_C().toArray();
			for (int k = 0; k < 2; k++) {
				b4[k] = new JButton(red[(int) card_s1[k]]);
				add(b4[k]);
				b4[k].setLocation(k * 200 + 100, 360);
				b4[k].setSize(110, 160);
			}
		}

		/*
		 * public void kkk(){ l3.addKeyListener(new KeyAdapter() { public void
		 * KeyPressed(KeyEvent e) { if (e.getKeyChar() == 's') {
		 * l3.setBackground(Color.green); l3.setText("�޷�"); System.exit(0); } }
		 * }); }
		 */

		public void text1() {
			card_T ss = card.card_M();
			b2.setText(ss.getname());
			b2.setFont(new Font("�������", Font.BOLD, 15));
			b2.setBackground(Color.CYAN);
			b2.addMouseListener(new MyMouseListener());
		}
		
		public void text2() {
			card_T sss = card.card_MC();
			b5.setText(sss.getname());
			b5.setFont(new Font("�������", Font.BOLD, 15));
			b5.setBackground(Color.ORANGE);
		}
		
		public void text3() {
			card_T ss = card.card_M();
			card_T sss = card.card_MC();
			int d1 = ss.getlevel();
			String d2 = ss.getname();
			int d3 = sss.getlevel();
			String d4 = sss.getname();
			
			t2.setText("Player 1��" + d2 + "������" + d1 +"\n"+"COM��" + d4 + "������" + d3);
			
			if(d1 > d3){
				b6.setText("Player 1 WIN!");
				re = "WIN";
				
			}
			else if(d1 == d3){
				b6.setText("REMATCH");
				re = "DRAW";
			}
			else{
				b6.setText("COM WIN!");
				re = "LOSE";
			}
		/*	Result rrr = new Result(d1,re) ;
			rrr.setp1(re);
			rrr.setps(d1);
			
			System.out.print(rrr.getp1());*/
		}

		class MyItemListener implements ItemListener {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.DESELECTED)
					return;
				if (g[0].isSelected()) {
					b3[0].setIcon(red[0]);
					num = g[0].getText();
					//System.out.print(num);
				} else if (g[1].isSelected()) {
					b3[1].setIcon(red[0]);
					num = g[1].getText();
					//System.out.print(num);
				} else {
					b3[2].setIcon(red[0]);
					num = g[2].getText();
					//System.out.print(num);
				}
				card.card_O(Integer.parseInt(num));
				text();
				text1();
				text2();
				text3();
			}
		}

	}
	class MyMouseListener extends MouseAdapter {
		public void MouseClicked(MouseEvent e) {
			JButton b2 = (JButton) e.getSource();
			b2.setBackground(Color.RED);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == menuItem1){
			List li = new List();
			li.Run();
		}
		else if(e.getSource() == menuItem2){
			Delete de = new Delete();
			de.Run();
		}
		else if(e.getSource() == menuItem3){
			strSql = "Delete from saveinfo;";
			DeleteData dd = new DeleteData(strSql);
			dd.delete();
		}
		
	}
}

class Result{
	String p1;	//player1�� ����
	int ps;	//player1�� ����
	String year;
	String month;
	String day;
	String name;
	
	/*Result(){
		
	}
	
	Result(int ps, String p1){
		this.p1 = p1;
		this.ps = ps;
	}
	
	public int getps(){
		return ps;
	}
	public void setps(int ps){
		this.ps = ps;
	}
	public String getp1(){
		return p1;
	}
	public void setp1(String p1){
		this.p1 = p1;
	}*/
	
	Result(String year, String month, String day, String name, int ps , String p1){
		this.year = year;
		this.month = month;
		this.name = name;
		this.day = day;
		this.p1 = p1;
		this.ps = ps;
	}
	public void Save(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e){
			System.out.println("JDBC driver loading error:");
		}
		try{
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/redatadb", "root", "");
			Statement st = conn.createStatement();
			
			String strSql = 
					"insert into saveinfo (year,month,day,name,ps,p1)" +
					"values('" + year + "','"	+ month + "','" + day + "','" 
							+toLatin1(name) + "','" + ps + "','" + toLatin1(p1) + "');";

			st.executeUpdate(strSql);
			st.close();
			conn.close();
			
			System.out.println(strSql);
		}
		catch(SQLException e){
			System.out.println("SQLException: " + e.getMessage());
		}	
	}
	private static String toLatin1(String str){
        try {
            byte[] b = str.getBytes();
            return new String(b, "ISO-8859-1");
        }
        catch (java.io.UnsupportedEncodingException uee) {
            System.out.println(uee.getMessage());
            return null;
        }
	}
}
class Todays {
	Calendar cal;
	SimpleDateFormat sdfy;	//��	
	SimpleDateFormat sdfm;	//��
	SimpleDateFormat sdfd;	//��

	public Todays() {

		cal = Calendar.getInstance();
		sdfy = new SimpleDateFormat();
		sdfm = new SimpleDateFormat();
		sdfd = new SimpleDateFormat();

		sdfy.applyPattern("yyyy");
		sdfm.applyPattern("M");
		sdfd.applyPattern("d");
	}

	public String gety() {
		String yyyy = sdfy.format(cal.getTime());
		return yyyy;
	}

	public String getm() {
		String mm = sdfm.format(cal.getTime());
		return mm;
	}

	public String getd() {
		String dd = sdfd.format(cal.getTime());
		return dd;
	}
}

class List extends JFrame implements ActionListener {
	JLabel todayy;
	JLabel todaym;
	JLabel todayd;
	JButton save;
	JButton cancel;
	Todays t;
	Result rr;
	JLabel sl1;
	JLabel sl2;
	JLabel sl3;

	JTextField nameField;
	JTextField scoreField;
	JTextField winField;
	
	List(){
		setSize(500,200);
		setLayout(new GridLayout(4,2));
	}

	public void Run() {
		JPanel p0 = new JPanel();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();

		// �г� ����

		t = new Todays();
		//rr = new Result();
		
		todayy = new JLabel("8");
		todayy.setText("�� ¥ : " + t.gety());
		todaym = new JLabel("8");
		todaym.setText(" " + t.getm());
		todayd = new JLabel("8");
		todayd.setText(" " + t.getd());

		sl1 = new JLabel("Player �̸�");
		nameField = new JTextField(8);
		sl2 = new JLabel("   SCORE : ");
		scoreField = new JTextField(4);
		//scoreField.setText(Integer.toString(rr.getps()));
		sl3 = new JLabel("   �� ��  : ");
		winField = new JTextField(5);
		//winField.setText(rr.getp1());
		save = new JButton("��  ��");
		cancel = new JButton("�� ��");
		
		//System.out.print(rr.getps());

		save.addActionListener(this);
		cancel.addActionListener(this);
		// ��ư �̺�Ʈ

		p0.add(new JLabel(""));
		p1.add(todayy);
		p1.add(todaym);
		p1.add(todayd);
		p2.add(sl1);
		p2.add(nameField);
		p2.add(sl2);
		p2.add(scoreField);
		p2.add(sl3);
		p2.add(winField);
		p3.add(save);
		p3.add(cancel);
		// �гο� ���̺귯�� ��ġ.

		add(p0);
		add(p1);
		add(p2);
		add(p3);
		// �����ӿ� �г� ��ġ

		setLocation(150, 50);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == cancel){	//�̺�Ʈ�� �߻��� ������Ʈ�� cancel�̸� ����
			nameField.setText("");
		}
		else if(e.getSource() == save){	//�̺�Ʈ�� �߻��� ������Ʈ�� save�̸� ����
			String src = nameField.getText();
			Result s = new Result(t.gety(),t.getm(),t.getd(),src, Integer.parseInt(scoreField.getText()), winField.getText());
			s.Save();
			JOptionPane.showMessageDialog(null, "����Ǿ����ϴ�.","Message",JOptionPane.INFORMATION_MESSAGE);
			
			System.out.println(" ");
			/*System.out.println(src);
			System.out.println(Integer.parseInt(scoreField.getText()));
			System.out.println(winField.getText());*/			
		}
	}
}


package ����;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Y{
	enum card_T{
	���ȱ���(38000,38000,"���ȱ���"),
	����(18000,18000,"����"),
	�嶯(10000,100,"�嶯"),
	����(9900,90,"����"),
	�ȋ�(8800,80,"�ȶ�"),
	ĥ��(7700,70,"ĥ��"),
	����(6600,60,"����"),
	����(5500,50,"����"),
	�綯(4400,40,"�綯"),
	�ﶯ(3300,30,"�ﶯ"),
	�̶�(2200,20,"�̶�"),
	�϶�(1100,10,"�϶�"),
	�˸�(1021, 1021, "�˸�"),
	����(1014, 1014, "����"),
	����(901, 901, "����"),
	���(110, 110, "���"),
	���(104, 104, "���"),
	����(64, 64, "����"),
	����(9,9, "����"),
	�Ȳ�(8,8, "������"),
	ĥ��(7, 7, "�ϰ���"),
	����(6, 6, "������"),
	����(5, 5, "�ټ���"),
	���(4, 4, "�ײ�"),
	����(3, 3, "����"),
	�β�(2, 2, "�β�"),
	�Ѳ�(1, 1, "�Ѳ�"),
	����(0, 1, "����"),
	START(0, 0, "����");
	
	private int code;
	private int level;
	private String name;
	
	private card_T(int code, int level, String name){
		this.code = code;
		this.level = level;
		this.name = name;
	}
	
	public int getcode(){
		return code;
	}
	public void setcode(int code){
		this.code = code;
	}
	public int getlevel(){
		return level;
	}
	public void setlevel(int level){
		this.level = level;
	}
	public String getname(){
		return name;
	}
	public void setname(String name){
		this.name = name;
	}	
}

	public static void main(String[] args) {
		new GUI();
	// 1 : �ϱ�		// 11 : 1ȫ��
	// 2 : 2����		// 12 : 2ȫ��
	// 3 : �ﱤ		// 13 : 3ȫ��
	// 4 : 4����		// 14 : 4�ʴ�
	// 5 : 5�׸�		// 15 : 5�ʴ�
	// 6 : 6�׸�		// 16 : 6û��
	// 7 : 7�׸�		// 17 : 7�ʴ�
	// 8 : �ȱ�		// 18 : 8����
	// 9 : 9�׸�		// 19 : 9û��
	// 10 : 10�׸�	// 20 : 10û��

	}
}
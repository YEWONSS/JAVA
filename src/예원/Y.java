package ¿¹¿ø;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Y{
	enum card_T{
	»ïÆÈ±¤¶¯(38000,38000,"»ïÆÈ±¤¶¯"),
	±¤¶¯(18000,18000,"±¤¶¯"),
	Àå¶¯(10000,100,"Àå¶¯"),
	±¸¶¯(9900,90,"±¸¶¯"),
	ÆÈ‹¯(8800,80,"ÆÈ¶¯"),
	Ä¥¶¯(7700,70,"Ä¥¶¯"),
	À°¶¯(6600,60,"À°¶¯"),
	¿À¶¯(5500,50,"¿À¶¯"),
	»ç¶¯(4400,40,"»ç¶¯"),
	»ï¶¯(3300,30,"»ï¶¯"),
	ÀÌ¶¯(2200,20,"ÀÌ¶¯"),
	ÀÏ¶¯(1100,10,"ÀÏ¶¯"),
	¾Ë¸®(1021, 1021, "¾Ë¸®"),
	µ¶»ç(1014, 1014, "µ¶»ç"),
	±¸»æ(901, 901, "±¸»æ"),
	Àå»æ(110, 110, "Àå»æ"),
	Àå»ç(104, 104, "Àå»ç"),
	¼¼·ú(64, 64, "¼¼·ú"),
	°©¿À(9,9, "°©¿À"),
	ÆÈ²ý(8,8, "¿©´ü²ý"),
	Ä¥²ý(7, 7, "ÀÏ°ö²ý"),
	À°²ý(6, 6, "¿©¼¸³¡"),
	¿À²ý(5, 5, "´Ù¼¸³¡"),
	»ç²ý(4, 4, "³×²ý"),
	¼¼²ý(3, 3, "¼¼²ý"),
	µÎ²ý(2, 2, "µÎ²ý"),
	ÇÑ²ý(1, 1, "ÇÑ²ý"),
	¸ÁÅë(0, 1, "¸ÁÅë"),
	START(0, 0, "½ÃÀÛ");
	
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
	// 1 : ÀÏ±¤		// 11 : 1È«´Ü
	// 2 : 2°íµµ¸®		// 12 : 2È«´Ü
	// 3 : »ï±¤		// 13 : 3È«´Ü
	// 4 : 4°íµµ¸®		// 14 : 4ÃÊ´Ü
	// 5 : 5±×¸²		// 15 : 5ÃÊ´Ü
	// 6 : 6±×¸²		// 16 : 6Ã»´Ü
	// 7 : 7±×¸²		// 17 : 7ÃÊ´Ü
	// 8 : ÆÈ±¤		// 18 : 8°íµµ¸®
	// 9 : 9±×¸²		// 19 : 9Ã»´Ü
	// 10 : 10±×¸²	// 20 : 10Ã»´Ü

	}
}
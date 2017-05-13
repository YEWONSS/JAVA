package ¿¹¿ø;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;

import ¿¹¿ø.Y.card_T;

public class card_D{
	private static int c1[] = new int[20];
	static HashSet<Integer> v1 = new HashSet<Integer>();
	static HashSet<Integer> v2 = new HashSet<Integer>();
	static HashSet<Integer> v = new HashSet<Integer>();

	public card_D(){

	}
	
	public static HashSet<Integer> card_R() {
		for (int i = 0; i < 20; i++) {
			c1[i] = i + 1;
			// System.out.print(c1[i]);
		}
		Random rand = new Random();
		
		while (v.size() < 6) {
			int ca_ra1 = rand.nextInt(20) + 1;
			v.add(ca_ra1);
		}
		Object[] o = v.toArray();
		Object a1 = null;
		Object a2;

		int count = 0;
		//System.out.print("player1ÀÇ Ä«µå´Â ");
		while (count < 6) {
			if (count < 3) {
				a1 = o[count];
				v1.add((Integer) o[count]);
				// System.out.print(o[count]+ " ");
				// System.out.print(a1+ " ");
				//System.out.print(a1 + " " + ",");
				//Object[] o1 = v1.toArray();
			} else if (count < 6 || count >= 3) {
				if (count == 3) {
	//				System.out.println("");
	//				System.out.print("player2ÀÇ Ä«µå´Â ");
				}
				a2 = o[count];
				v2.add((Integer) o[count]);
				// System.out.print(a2+ " ");
	//			System.out.print(a2 + " " + ",");
			}
			// System.out.print(o[count]+ " ");}
			count++;	
		}
		return v1;
	}
	public static HashSet<Integer> card_C(){
		return v2;
	}
	
	Object[] card_O(int b){
		System.out.println(" ");
		System.out.println("Ä«µå ¹ö¸®±â");
		// player1Ä«µå ¹ö¸®±â
		v1.remove((b));
		System.out.println(v1);
		Object[] o1 = v1.toArray();
		if(o1.length == 2);
		return(o1);
	}
	
	card_T card_M(){
		Object[] o1 = v1.toArray();
		System.out.print(v1);
		card_T type = card_T.START;
		int num = 0;
			if(((Integer)o1[0]==3 && (Integer)o1[1]==8)
					||((Integer)o1[0]==8 && (Integer)o1[1]==3)){
				type = card_T.»ïÆÈ±¤¶¯;
				//System.out.print("»ïÆÈ±¤¶¯");
				}
			else if(((Integer)o1[0]==1 && (Integer)o1[1]==3)
					||((Integer)o1[0]==3 && (Integer)o1[1]==1)){
				type = card_T.±¤¶¯;
				//System.out.print("±¤¶¯1");
				}
			else if(((Integer)o1[0]==1 && (Integer)o1[1]==8)
					||((Integer)o1[0]==8 && (Integer)o1[1]==1)){
				type = card_T.±¤¶¯;
				//System.out.print("±¤¶¯2");
				}
			else if(((Integer)o1[0]%10==(Integer)o1[1]%10)){
				num = ((Integer)o1[0]%10)*10;
				//¶¯¶¯¶¯
				for(card_T card : card_T.values()){
					if(num == card.getlevel()){
						type = card;
					}
				}
				//System.out.print(num+"¶¯");
				}
			else if(((Integer)o1[0]%10==1 && (Integer)o1[1]%10==2)
					||((Integer)o1[0]%10==2 && (Integer)o1[1]%10==1)){
				type = card_T.¾Ë¸®;
				//System.out.print("¾Ë¸®");
				}
			else if(((Integer)o1[0]%10==1 && (Integer)o1[1]%10==4)
					||((Integer)o1[0]%10==4 && (Integer)o1[1]%10==1)){
				//System.out.print("µ¶»ç");
				type = card_T.µ¶»ç;
				}
			else if(((Integer)o1[0]%10==1 && (Integer)o1[1]%10==9)
					||((Integer)o1[0]%10==9 && (Integer)o1[1]%10==1)){
				//System.out.print("±¸»æ");
				type = card_T.±¸»æ;
			}
			else if(((Integer)o1[0]%10==1 && (Integer)o1[1]%10==0)
					||((Integer)o1[0]%10==0 && (Integer)o1[1]%10==1)){
				//System.out.print("Àå»æ");
				type = card_T.Àå»æ;
			}
			else if(((Integer)o1[0]%10==4 && (Integer)o1[1]%10==0)
					||((Integer)o1[0]%10==0 && (Integer)o1[1]%10==4)){
				//System.out.print("Àå»ç");
				type = card_T.Àå»ç;	
			}
			else if(((Integer)o1[0]%10==4 && (Integer)o1[1]%10==6)
					||((Integer)o1[0]%10==6 && (Integer)o1[1]%10==4)){
				//System.out.print("¼¼·ú");
				type = card_T.¼¼·ú;	
			}
			else if((((Integer)o1[0]%10)+((Integer)o1[1]%10))==9){
				//System.out.print("°©¿À");
				type = card_T.°©¿À;	
			}
			else if((((Integer)o1[0]%10)+((Integer)o1[1]%10))==10){
				//System.out.print("¸ÁÅë");
				type = card_T.¸ÁÅë;	
			}
			else {
				int nu =(((Integer)o1[0]%10)+((Integer)o1[1]%10));
				num = nu%10;
				///²ý²ý²ý
				for(card_T card : card_T.values()){
					if(num == card.getlevel()){
						type = card;
					}
				}
				//System.out.print(nu+"²ý");
			}
			System.out.print(type);
			return type;
	}
	card_T card_MC(){
		Object[] o1 = v2.toArray();
		card_T type = card_T.START;
		int num = 0;
			if(((Integer)o1[0]==3 && (Integer)o1[1]==8)
					||((Integer)o1[0]==8 && (Integer)o1[1]==3)){
				type = card_T.»ïÆÈ±¤¶¯;
				//System.out.print("»ïÆÈ±¤¶¯");
				}
			else if(((Integer)o1[0]==1 && (Integer)o1[1]==3)
					||((Integer)o1[0]==3 && (Integer)o1[1]==1)){
				type = card_T.±¤¶¯;
				//System.out.print("±¤¶¯1");
				}
			else if(((Integer)o1[0]==1 && (Integer)o1[1]==8)
					||((Integer)o1[0]==8 && (Integer)o1[1]==1)){
				type = card_T.±¤¶¯;
				//System.out.print("±¤¶¯2");
				}
			else if(((Integer)o1[0]%10==(Integer)o1[1]%10)){
				num = ((Integer)o1[0]%10)*10;
				//¶¯¶¯¶¯
				for(card_T card : card_T.values()){
					if(num == card.getlevel()){
						type = card;
					}
				}
				//System.out.print(num+"¶¯");
				}
			else if(((Integer)o1[0]%10==1 && (Integer)o1[1]%10==2)
					||((Integer)o1[0]%10==2 && (Integer)o1[1]%10==1)){
				type = card_T.¾Ë¸®;
				//System.out.print("¾Ë¸®");
				}
			else if(((Integer)o1[0]%10==1 && (Integer)o1[1]%10==4)
					||((Integer)o1[0]%10==4 && (Integer)o1[1]%10==1)){
				//System.out.print("µ¶»ç");
				type = card_T.µ¶»ç;
				}
			else if(((Integer)o1[0]%10==1 && (Integer)o1[1]%10==9)
					||((Integer)o1[0]%10==9 && (Integer)o1[1]%10==1)){
				//System.out.print("±¸»æ");
				type = card_T.±¸»æ;
			}
			else if(((Integer)o1[0]%10==1 && (Integer)o1[1]%10==0)
					||((Integer)o1[0]%10==0 && (Integer)o1[1]%10==1)){
				//System.out.print("Àå»æ");
				type = card_T.Àå»æ;
			}
			else if(((Integer)o1[0]%10==4 && (Integer)o1[1]%10==0)
					||((Integer)o1[0]%10==0 && (Integer)o1[1]%10==4)){
				//System.out.print("Àå»ç");
				type = card_T.Àå»ç;	
			}
			else if(((Integer)o1[0]%10==4 && (Integer)o1[1]%10==6)
					||((Integer)o1[0]%10==6 && (Integer)o1[1]%10==4)){
				//System.out.print("¼¼·ú");
				type = card_T.¼¼·ú;	
			}
			else if((((Integer)o1[0]%10)+((Integer)o1[1]%10))==9){
				//System.out.print("°©¿À");
				type = card_T.°©¿À;	
			}
			else if((((Integer)o1[0]%10)+((Integer)o1[1]%10))==10){
				//System.out.print("¸ÁÅë");
				type = card_T.¸ÁÅë;	
			}
			else {
				int nu =(((Integer)o1[0]%10)+((Integer)o1[1]%10));
				num = nu%10;
				///²ý²ý²ý
				for(card_T card : card_T.values()){
					if(num == card.getlevel()){
						type = card;
					}
				}
				//System.out.print(nu+"²ý");
			}
			System.out.print(type);
			return type;
	}
}
package Manage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Shop {
	List<BOOK> book = new ArrayList<BOOK>();
	List<BOOK> bkk = new ArrayList<BOOK>();
	public void initialBOOK1() {
		BOOK bb = new BOOK(1, "����֮��", "δ���", "");
		BOOK bc = new BOOK(2, "���ݽṹ", "δ���", "");
		BOOK bd = new BOOK(3, "���ݿ��ӻ�", "δ���", "");
		bkk.add(bb);
		bkk.add(bc);
		bkk.add(bd);
	}
	Scanner input = new Scanner(System.in);
	//��ʼ��BOOK
	public void initialBOOK() {
		BOOK b1 = new BOOK(1, "�ߵ���ѧ", "�ѽ��", "2020-12-1");
		BOOK b2 = new BOOK(2, "����ϵͳ", "�ɽ�", "--");
		BOOK b3 = new BOOK(3, "Scala���", "�ɽ�", "--");
		book.add(b1);
		book.add(b2);
		book.add(b3);
	}


}

package Manage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Shop {
	List<BOOK> book = new ArrayList<BOOK>();
	List<BOOK> bkk = new ArrayList<BOOK>();
	public void initialBOOK1() {
		BOOK bb = new BOOK(1, "构建之法", "未入库", "");
		BOOK bc = new BOOK(2, "数据结构", "未入库", "");
		BOOK bd = new BOOK(3, "数据可视化", "未入库", "");
		bkk.add(bb);
		bkk.add(bc);
		bkk.add(bd);
	}
	Scanner input = new Scanner(System.in);
	//初始化BOOK
	public void initialBOOK() {
		BOOK b1 = new BOOK(1, "高等数学", "已借出", "2020-12-1");
		BOOK b2 = new BOOK(2, "操作系统", "可借", "--");
		BOOK b3 = new BOOK(3, "Scala编程", "可借", "--");
		book.add(b1);
		book.add(b2);
		book.add(b3);
	}


}

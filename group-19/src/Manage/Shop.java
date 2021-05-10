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
	
	//修改BOOK
	public void alterBOOK() {
		BOOK bbb = new BOOK();
		System.out.println("--->修改BOOK");
		System.out.println("请输入要修改的图书名称：");
		String name7 = input.next();
		int i = -1;
		for (BOOK b : book) {
			if (name7.equals(b.getName())) {
				System.out.println("请输入你要更新图书的id：");
				int id = input.nextInt();
				bbb.setId(id);
				System.out.println("请输入你要更新图书的名称：");
				String name = input.next();
				bbb.setName(name);
				System.out.println("请输入你要更新BOOK的借出情况：");
				String t = input.next();
				bbb.setStatus(t);
				System.out.println("请输入你要更新BOOK的借出时间：");
				String time = input.next();
				bbb.setBorrowTime(time);
				book.set(book.indexOf(b),bbb);

			}
		}
	}

	//新增BOOK
	public void addBOOK() {
		System.out.println("--->新增书籍");
		System.out.print("请输入图书的名称:");
		String bookname = input.next();
		int i = -1;
		for (BOOK store : book) {
			if (name.equals(store.getName())) {
				System.out.println("图书已经存在，不能再添加该书籍！");
				i = book.indexOf(store);
			}
		}
		if (i < 0) {
			book.add(new BOOK(book.size() + 1, bookname, "可借", ""));
			System.out.println("新增《" + bookname + "》成功!");
		}
	}

	//删除BOOK
	public void deleteBOOK() {
		System.out.println("--->删除书籍");
		System.out.print("请输入删除图书名称:");
		String Bookname = input.next();
		int BooKindex = -1;
		for (BOOK de : book) {
			if (Bookname.equals(de.getName())) {
				BooKindex = book.indexOf(de);
				if (de.getStatus().equals("已借出")) {
					System.out.println("《" + Bookname + "》" + "为借出状态，不能删除！");
				}
			}
		}
		if (BooKindex < 0)
			System.out.println("不存在该图书");
		else {
			book.remove(BooKindex);
			System.out.println("删除《" + Bookname + "》成功!");
		}
	}
	
	//查看BOOK信息
	public void listBOOK() {
		System.out.println("--->查看书籍列表");
		System.out.println("序号\t状态\t名称\t借出日期");
		for (BOOK b : book) {
			System.out.println(b.getId() +"\t" + b.getStatus() +"\t《" + b.getName() + "》\t" + b.getBorrowTime());
		}
	}

	// 推荐书籍
	public void BOOKRank() {
		System.out.println("--->推荐书籍");
		System.out.println( "    名称");
		List<BOOK> books = new ArrayList<BOOK>();
		books.addAll(bkk);
		Collections.sort(books);
		Collections.reverse(books);
		for (BOOK d : books) {
			System.out.println("《" + d.getName() + "》");
		}
	}





	



}

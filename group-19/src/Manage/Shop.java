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
		BOOK ddd = new BOOK();
		System.out.println("--->修改BOOK");
		System.out.println("请输入要修改的图书名称：");
		String name7 = input.next();
		int i = -1;
		for (BOOK d : book) {
			if (name7.equals(d.getName())) {
				System.out.println("请输入你要更新图书的id：");
				int id = input.nextInt();
				ddd.setId(id);
				System.out.println("请输入你要更新图书的名称：");
				String name = input.next();
				ddd.setName(name);
				System.out.println("请输入你要更新BOOK的借出情况：");
				String t = input.next();
				ddd.setStatus(t);
				System.out.println("请输入你要更新BOOK的借出时间：");
				String time = input.next();
				ddd.setBorrowTime(time);
				book.set(book.indexOf(d),ddd);

			}
		}
	}

	//新增BOOK
	public void addBOOK() {
		System.out.println("--->新增书籍");
		System.out.print("请输入图书名称:");
		String name = input.next();
		int i = -1;
		for (BOOK d : book) {
			if (name.equals(d.getName())) {
				System.out.println("图书已存在，不能再添加该书籍！");
				i = book.indexOf(d);
			}
		}
		if (i < 0) {
			book.add(new BOOK(book.size() + 1, name, "可借", ""));
			System.out.println("新增《" + name + "》成功!");
		}
	}

	//删除BOOK
	public void deleteBOOK() {
		System.out.println("--->删除书籍");
		System.out.print("请输入删除图书名称:");
		String name = input.next();
		int index = -1;
		for (BOOK d : book) {
			if (name.equals(d.getName())) {
				index = book.indexOf(d);
				if (d.getStatus().equals("已借出")) {
					System.out.println("《" + name + "》" + "为借出状态，不能删除！");
				}
			}
		}
		if (index < 0)
			System.out.println("不存在该图书");
		else {
			book.remove(index);
			System.out.println("删除《" + name + "》成功!");
		}
	}
	
	//查看BOOK信息
	public void listBOOK() {
		System.out.println("--->查看书籍");
		System.out.println("序号\t状态\t名称\t借出日期");
		for (BOOK d : book) {
			System.out.println(d.getId() +"\t" + d.getStatus() +"\t《" + d.getName() + "》\t" + d.getBorrowTime());
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

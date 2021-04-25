package view;

import java.util.List;
import java.util.Scanner;

import entity.BookInfo;
import service.BookInfoServiceInter;
import service.impl.BookInfoService;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		BookInfoServiceInter bookInfoService = new BookInfoService();
		BookInfo bookInfo = null;
		String message;
		BookInfo info;
		int Bid;
		String Bname;
		String Author;
		while(true) {
			System.out.println("-----------------------------------------");
			System.out.println("|         欢迎使用图书信息管理系统        |");
			System.out.println("|1：新增                                 |");
			System.out.println("|2：删除                                 |");
			System.out.println("|3：修改                                 |");
			System.out.println("|4：查询                                 |");
			System.out.println("|5：搜索(编号)                           |");
			System.out.println("|6：搜索(书名)                           |");
			System.out.println("|7：推荐                                 |");
			System.out.println("|0：退出                                 |");
			System.out.println("-----------------------------------------");
			try {
				System.out.print("请选择功能(输入对应数字)：");
				int type = input.nextInt();
				switch(type) {
					case 1:
						System.out.println("请输入图书信息（新增）：");
						System.out.print("编号：");
						Bid = input.nextInt();
						System.out.print("书名：");
						Bname = input.next();
						System.out.print("作者：");
						Author = input.next();
						bookInfo = new BookInfo(Bid,Bname,Author);
						bookInfoService.addBookInfo(bookInfo);
						break;
					case 2:
						System.out.print("请输入你要删除的书编号：");
						Bid = input.nextInt();
						bookInfoService.removeBookInfo(Bid);
						break;
					case 3:
						System.out.println("请输入图书信息（修改）：");
						System.out.print("编号：");
						Bid = input.nextInt();
						System.out.print("书名：");
						Bname = input.next();
						System.out.print("作者：");
						Author = input.next();
						bookInfo = new BookInfo(Bid,Bname,Author);
						bookInfoService.editBookInfo(bookInfo, Bid);
						break;
					case 4:
						bookInfoService.getAll();
						break;
					case 5:
						try {
							System.out.print("请输入你要搜索的编号：");
							Bid = input.nextInt();
							bookInfoService.getBookInfoByBid(Bid);
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("输入有误，请输入对应学号！");
							return;
						}
						
						break;
					case 6:
						try {
							System.out.print("请输入你要搜索的书名：");
							Bname = input.next();
							bookInfoService.getBookInfoByBame(Bname);
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("输入有误，请输入对应名字！");
							return;
						}
						break;
					case 7:

						try {
							System.out.println("图书推荐：");
							bookInfoService.recommend();
						} catch (Exception e) {
							// TODO: handle exception
							return;
						}



						break;
					case 0:
						System.out.println("系统退出");
						return;
					default:
						System.out.println("你的选择有误，请重新输入");
						break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("输入有误，请输入数字！");
				break;
			}
			
		}
	}

}


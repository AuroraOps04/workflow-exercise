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
			System.out.println("|         ��ӭʹ��ͼ����Ϣ����ϵͳ        |");
			System.out.println("|1������                                 |");
			System.out.println("|2��ɾ��                                 |");
			System.out.println("|3���޸�                                 |");
			System.out.println("|4����ѯ                                 |");
			System.out.println("|5������(���)                           |");
			System.out.println("|6������(����)                           |");
			System.out.println("|7���Ƽ�                                 |");
			System.out.println("|0���˳�                                 |");
			System.out.println("-----------------------------------------");
			try {
				System.out.print("��ѡ����(�����Ӧ����)��");
				int type = input.nextInt();
				switch(type) {
					case 1:
						System.out.println("������ͼ����Ϣ����������");
						System.out.print("��ţ�");
						Bid = input.nextInt();
						System.out.print("������");
						Bname = input.next();
						System.out.print("���ߣ�");
						Author = input.next();
						bookInfo = new BookInfo(Bid,Bname,Author);
						bookInfoService.addBookInfo(bookInfo);
						break;
					case 2:
						System.out.print("��������Ҫɾ�������ţ�");
						Bid = input.nextInt();
						bookInfoService.removeBookInfo(Bid);
						break;
					case 3:
						System.out.println("������ͼ����Ϣ���޸ģ���");
						System.out.print("��ţ�");
						Bid = input.nextInt();
						System.out.print("������");
						Bname = input.next();
						System.out.print("���ߣ�");
						Author = input.next();
						bookInfo = new BookInfo(Bid,Bname,Author);
						bookInfoService.editBookInfo(bookInfo, Bid);
						break;
					case 4:
						bookInfoService.getAll();
						break;
					case 5:
						try {
							System.out.print("��������Ҫ�����ı�ţ�");
							Bid = input.nextInt();
							bookInfoService.getBookInfoByBid(Bid);
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("���������������Ӧѧ�ţ�");
							return;
						}
						
						break;
					case 6:
						try {
							System.out.print("��������Ҫ������������");
							Bname = input.next();
							bookInfoService.getBookInfoByBame(Bname);
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("���������������Ӧ���֣�");
							return;
						}
						break;
					case 7:
						try {
							System.out.println("ͼ���Ƽ���");
							bookInfoService.recommend();
						} catch (Exception e) {
							// TODO: handle exception
							return;
						}
						break;
					case 0:
						System.out.println("ϵͳ�˳�");
						return;
					default:
						System.out.println("���ѡ����������������");
						break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("�����������������֣�");
				break;
			}
			
		}
	}

}


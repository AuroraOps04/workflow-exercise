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

						break;
					case 2:

						break;
					case 3:

						break;
					case 4:

						break;
					case 5:

						break;
					case 6:

						break;
					case 7:

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


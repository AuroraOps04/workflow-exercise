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


	//�޸�BOOK
	public void alterBOOK() {
		BOOK ddd = new BOOK();
		System.out.println("--->�޸�BOOK");
		System.out.println("������Ҫ�޸ĵ�ͼ�����ƣ�");
		String name7 = input.next();
		int i = -1;
		for (BOOK d : book) {
			if (name7.equals(d.getName())) {
				System.out.println("��������Ҫ����ͼ���id��");
				int id = input.nextInt();
				ddd.setId(id);
				System.out.println("��������Ҫ����ͼ������ƣ�");
				String name = input.next();
				ddd.setName(name);
				System.out.println("��������Ҫ����BOOK�Ľ�������");
				String t = input.next();
				ddd.setStatus(t);
				System.out.println("��������Ҫ����BOOK�Ľ��ʱ�䣺");
				String time = input.next();
				ddd.setBorrowTime(time);
				book.set(book.indexOf(d),ddd);

			}
		}
	}

	//����BOOK
	public void addBOOK() {
		System.out.println("--->�����鼮");
		System.out.print("������ͼ������:");
		String name = input.next();
		int i = -1;
		for (BOOK d : book) {
			if (name.equals(d.getName())) {
				System.out.println("ͼ���Ѵ��ڣ���������Ӹ��鼮��");
				i = book.indexOf(d);
			}
		}
		if (i < 0) {
			book.add(new BOOK(book.size() + 1, name, "�ɽ�", ""));
			System.out.println("������" + name + "���ɹ�!");
		}
	}

	//�鿴BOOK��Ϣ
	public void listBOOK() {
		System.out.println("--->�鿴�鼮");
		System.out.println("���\t״̬\t����\t�������");
		for (BOOK d : book) {
			System.out.println(d.getId() +"\t" + d.getStatus() +"\t��" + d.getName() + "��\t" + d.getBorrowTime());
		}
	}

	//ɾ��BOOK
	public void deleteBOOK() {
		System.out.println("--->ɾ���鼮");
		System.out.print("������ɾ��ͼ������:");
		String name = input.next();
		int index = -1;
		for (BOOK d : book) {
			if (name.equals(d.getName())) {
				index = book.indexOf(d);
				if (d.getStatus().equals("�ѽ��")) {
					System.out.println("��" + name + "��" + "Ϊ���״̬������ɾ����");
				}
			}
		}
		if (index < 0)
			System.out.println("�����ڸ�ͼ��");
		else {
			book.remove(index);
			System.out.println("ɾ����" + name + "���ɹ�!");
		}
	}


	// �Ƽ��鼮
	public void BOOKRank() {
		System.out.println("--->�Ƽ��鼮");
		System.out.println( "    ����");
		List<BOOK> books = new ArrayList<BOOK>();
		books.addAll(bkk);
		Collections.sort(books);
		Collections.reverse(books);
		for (BOOK d : books) {
			System.out.println("��" + d.getName() + "��");
		}
	}

}

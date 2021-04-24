package service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.mysql.fabric.xmlrpc.base.Array;

import dao.BookInfoDaoInter;
import dao.impl.BookInfoDao;
import entity.BookInfo;
import service.BookInfoServiceInter;

public class BookInfoService implements BookInfoServiceInter {

	private BookInfoDaoInter bookInfoDao = new BookInfoDao();
	
	@Override
	public void addBookInfo(BookInfo bookInfo) {
		// TODO Auto-generated method stub
		int result = bookInfoDao.insert(bookInfo);
		if (result > 0) {
			System.out.println("�����ɹ���");
		}
		else {
			System.out.println("����ʧ�ܣ�");
		}
	}

	@Override
	public void removeBookInfo(int Bid) {
		// TODO Auto-generated method stub
		int result = bookInfoDao.delete(Bid);
		if (result > 0) {
			System.out.println("ɾ���ɹ���");
		}
		else {
			System.out.println("ɾ��ʧ�ܣ�");
		}
	}

	@Override
	public void editBookInfo(BookInfo bookInfo, int Bid) {
		// TODO Auto-generated method stub
		int result = bookInfoDao.update(bookInfo, Bid);
		if (result > 0) {
			System.out.println("�޸ĳɹ���");
		}
		else {
			System.out.println("�޸�ʧ�ܣ�");
		}
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		List<BookInfo> list = bookInfoDao.select();
		if(list.size() > 0){
			for (BookInfo bookInfo2 : list) {
				System.out.print("��ţ�"+bookInfo2.getBid() + "\t");
				System.out.print("������"+bookInfo2.getBname() + "\t");
				System.out.print("���ߣ�"+bookInfo2.getAuthor() + "\t");
				System.out.println();
			}
			System.out.println("��ѯ�ɹ���");
		}else {
			System.out.println("�ձ�");
		}
	}

	@Override
	public void getBookInfoByBid(int Bid) {
		// TODO Auto-generated method stub
		List<BookInfo> list = bookInfoDao.selectByBid(Bid);
		if(list.size() > 0){
			for (BookInfo bookInfo : list) {
				System.out.print("��ţ�"+bookInfo.getBid() + "\t");
				System.out.print("������"+bookInfo.getBname() + "\t");
				System.out.print("���ߣ�"+bookInfo.getAuthor() + "\t");
				System.out.println();
			}
		}else{
			System.out.println("û�и�ͼ����Ϣ��");
		}
	}

	@Override
	public void getBookInfoByBame(String Bname) {
		// TODO Auto-generated method stub
		List<BookInfo> list = bookInfoDao.selectByBname(Bname);
		if(list.size() > 0){
			for (BookInfo bookInfo : list) {
				System.out.print("��ţ�"+bookInfo.getBid() + "\t");
				System.out.print("������"+bookInfo.getBname() + "\t");
				System.out.print("���ߣ�"+bookInfo.getAuthor() + "\t");
				System.out.println();
			}
		}else{
			System.out.println("û�и�ͼ����Ϣ��");
		}
	}

	@Override
	public void recommend() {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		Random r = new Random();
		a[0] = r.nextInt(10); 
		for(int i = 1;i < 5;i++){//����5����,ȷ�����ظ�
			a[i] = r.nextInt(10);
			for(int j = 0;j < i;j++){
				if(a[j]==a[i]){
					i--;
					break;
				}
			}
		}

		for (int i=0;i<5;i++) {
			List<BookInfo> list = bookInfoDao.selectByBid(a[i]);
			if(list.size() > 0){
				for (BookInfo bookInfo2 : list){
					System.out.print("������"+bookInfo2.getBname() + "\t");
					System.out.print("���ߣ�"+bookInfo2.getAuthor() + "\t");
					System.out.println();
				}
				
			}
		}
		
	}
}

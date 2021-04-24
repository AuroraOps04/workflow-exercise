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
			System.out.println("新增成功！");
		}
		else {
			System.out.println("新增失败！");
		}
	}

	@Override
	public void removeBookInfo(int Bid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editBookInfo(BookInfo bookInfo, int Bid) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		List<BookInfo> list = bookInfoDao.select();
		if(list.size() > 0){
			for (BookInfo bookInfo2 : list) {
				System.out.print("编号："+bookInfo2.getBid() + "\t");
				System.out.print("书名："+bookInfo2.getBname() + "\t");
				System.out.print("作者："+bookInfo2.getAuthor() + "\t");
				System.out.println();
			}
			System.out.println("查询成功！");
		}else {
			System.out.println("空表！");
		}
	}

	@Override
	public void getBookInfoByBid(int Bid) {
		// TODO Auto-generated method stub
		List<BookInfo> list = bookInfoDao.selectByBid(Bid);
		if(list.size() > 0){
			for (BookInfo bookInfo : list) {
				System.out.print("编号："+bookInfo.getBid() + "\t");
				System.out.print("书名："+bookInfo.getBname() + "\t");
				System.out.print("作者："+bookInfo.getAuthor() + "\t");
				System.out.println();
			}
		}else{
			System.out.println("没有该图书信息！");
		}
	}

	@Override
	public void getBookInfoByBame(String Bname) {
		// TODO Auto-generated method stub
		List<BookInfo> list = bookInfoDao.selectByBname(Bname);
		if(list.size() > 0){
			for (BookInfo bookInfo : list) {
				System.out.print("编号："+bookInfo.getBid() + "\t");
				System.out.print("书名："+bookInfo.getBname() + "\t");
				System.out.print("作者："+bookInfo.getAuthor() + "\t");
				System.out.println();
			}
		}else{
			System.out.println("没有该图书信息！");
		}
	}

	@Override
	public void recommend() {
		// TODO Auto-generated method stub

	}
}

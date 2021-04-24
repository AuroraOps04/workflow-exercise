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

	}

	@Override
	public void getBookInfoByBid(int Bid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getBookInfoByBame(String Bname) {
		// TODO Auto-generated method stub

	}

	@Override
	public void recommend() {
	
	}
}

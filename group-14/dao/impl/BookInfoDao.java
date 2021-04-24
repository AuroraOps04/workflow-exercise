package dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.BaseDao;
import dao.BookInfoDaoInter;
import entity.BookInfo;

public class BookInfoDao implements BookInfoDaoInter {
	
	private BaseDao baseDao = new BaseDao();
	@Override
	public List<BookInfo> select() {
		// TODO Auto-generated method stub

	}

	@Override
	public int insert(BookInfo bookInfo) {
		// TODO Auto-generated method stub

	}

	@Override
	public int update(BookInfo bookInfo, int Bid) {
		// TODO Auto-generated method stub

	}

	@Override
	public int delete(int Bid) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<BookInfo> selectByBid(int Bid) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<BookInfo> selectByBname(String Bname) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<BookInfo> recommend() {
		// TODO Auto-generated method stub
		
		return null;
	}

}
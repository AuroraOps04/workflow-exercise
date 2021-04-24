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
		List<BookInfo> list = new ArrayList<BookInfo>();
		String sql = "select * from book";
		try {
			PreparedStatement pstmt = baseDao.getConn().prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				BookInfo bookInfo = new BookInfo();
				bookInfo.setBid(rs.getInt("Bid"));
				bookInfo.setBname(rs.getString("Bname"));
				bookInfo.setAuthor(rs.getString("Author"));
				list.add(bookInfo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
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
		List<BookInfo> list = new ArrayList<BookInfo>();
		String sql = "select * from book where Bid=?";
		try {
			PreparedStatement pstmt = baseDao.getConn().prepareStatement(sql);
			pstmt.setInt(1, Bid);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				BookInfo bookInfo = new BookInfo();
				bookInfo.setBid(rs.getInt("Bid"));
				bookInfo.setBname(rs.getString("Bname"));
				bookInfo.setAuthor(rs.getString("Author"));
				list.add(bookInfo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<BookInfo> selectByBname(String Bname) {
		// TODO Auto-generated method stub
		List<BookInfo> list = new ArrayList<BookInfo>();
		String sql = "select * from book where Bname=?";
		try {
			PreparedStatement pstmt = baseDao.getConn().prepareStatement(sql);
			pstmt.setString(1, Bname);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				BookInfo bookInfo = new BookInfo();
				bookInfo.setBid(rs.getInt("Bid"));
				bookInfo.setBname(rs.getString("Bname"));
				bookInfo.setAuthor(rs.getString("Author"));
				list.add(bookInfo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<BookInfo> recommend() {
		// TODO Auto-generated method stub
		
		return null;
	}

}
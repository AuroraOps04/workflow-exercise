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
		int result = -1;
		String sql = "insert into book(Bid, Bname, Author) values(?, ?, ?)";
		try {
			PreparedStatement pstmt = baseDao.getConn().prepareStatement(sql);
			pstmt.setInt(1, bookInfo.getBid());
			pstmt.setString(2, bookInfo.getBname());
			pstmt.setString(3, bookInfo.getAuthor());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int update(BookInfo bookInfo, int Bid) {
		// TODO Auto-generated method stub
		int result = -1;
		String sql = "update book set Bid=?, Bname=?, Author=? where Bid=?";
		try {
			PreparedStatement pstmt = baseDao.getConn().prepareStatement(sql);
			pstmt.setInt(1, bookInfo.getBid());
			pstmt.setString(2, bookInfo.getBname());
			pstmt.setString(3, bookInfo.getAuthor());
			pstmt.setInt(4, bookInfo.getBid());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int delete(int Bid) {
		// TODO Auto-generated method stub
		int result = -1;
		String sql = "delete from book where Bid=?";
		try {
			PreparedStatement pstmt = baseDao.getConn().prepareStatement(sql);
			pstmt.setInt(1, Bid);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
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
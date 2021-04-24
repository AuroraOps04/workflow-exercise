package dao;

import java.util.List;

import entity.BookInfo;

public interface BookInfoDaoInter {
	public List<BookInfo> select();
	public int insert(BookInfo bookInfo);
	public int update(BookInfo bookInfo, int Bid);
	public int delete(int Bid);
	public List<BookInfo> selectByBid(int Bid);
	public List<BookInfo> selectByBname(String Bname);
	public List<BookInfo> recommend();
}

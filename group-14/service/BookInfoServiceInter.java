package service;


import entity.BookInfo;

public interface BookInfoServiceInter {
	public void addBookInfo(BookInfo userInfo);
	public void removeBookInfo(int Sno);
	public void editBookInfo(BookInfo bookInfo, int Bid);
	public void getAll();
	public void getBookInfoByBid(int Bid);
	public void getBookInfoByBame(String Bname);
	public void recommend() ;
}

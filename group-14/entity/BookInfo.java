package entity;

public class BookInfo {
	private int Bid;		//编号
	private String Bname;	//书名
	private String Author;	//作者
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public BookInfo() {
		
	}
	public BookInfo(int bid, String bname, String author) {
		Bid = bid;
		Bname = bname;
		Author = author;
	}
	
}

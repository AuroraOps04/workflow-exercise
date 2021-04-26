package Manage;

public class BOOK implements Comparable<BOOK>{
	private int id;//book���
	private String status;//book״̬
	private String name;//book����
	private Integer number = 0 ;//�������
	private String borrowTime;//���ʱ��

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getBorrowTime() {
		return borrowTime;
	}

	public void setBorrowTime(String borrowTime) {
		this.borrowTime = borrowTime;
	}

	public BOOK() {

	}

	public BOOK(int id, String name, String status, String borrowTime) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.borrowTime = borrowTime;
	}

	public int compareTo(BOOK book) {
		return this.getNumber().compareTo(book.getNumber());
	}
}